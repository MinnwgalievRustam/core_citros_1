package com.citros.core.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class AssignmentDTO {
    private Long id;
    private String subjectOrder;
    private String signControl;
    private String signPerformance;
    private String textOrder;
    Set<UserDTO> users;
}
