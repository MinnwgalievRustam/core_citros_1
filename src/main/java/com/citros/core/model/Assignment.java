package com.citros.core.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@Table(name = "assignments")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id","subjectOrder","signControl"})
public class Assignment {
    @Id
    @Column(name = "assignment_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "subject_order")
    private String subjectOrder;

    @Column(name = "sign_control")
    private String signControl;

    @Column(name = "sign_performance")
    private String signPerformance;

    @Column(name = "text_order")
    private String textOrder;
    @ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH,CascadeType.DETACH})
    @JoinTable(
            name = "users_assignments",
            joinColumns = @JoinColumn(name = "assignment_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private Set<User> users = new HashSet<>();

//    public void addAssignment(User user) {
//        users.add(user);
//        user.getAssignments().add(this);
//    }
//
//    public void removeAssignment(User user) {
//        users.remove(user);
//        user.getAssignments().remove(this);
//    }
}
