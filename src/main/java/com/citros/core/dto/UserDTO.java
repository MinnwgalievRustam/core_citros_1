package com.citros.core.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private Long id;
    private String surname;
    private String name;
    private String lastName;
    private String jobTitle;
    Set<AssignmentDTO> assignments;
}
