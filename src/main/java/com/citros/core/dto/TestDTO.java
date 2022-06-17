package com.citros.core.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestDTO {
    private Long id;
    private String subjectOrder;
    private String signControl;
    private String signPerformance;
    private String textOrder;
}
