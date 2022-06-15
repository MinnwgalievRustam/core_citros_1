package com.citros.core.mapper;

import com.citros.core.dto.AssignmentDTO;
import com.citros.core.model.Assignment;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AssignmentMapper {
    AssignmentDTO toDTO(Assignment assignment);

}
