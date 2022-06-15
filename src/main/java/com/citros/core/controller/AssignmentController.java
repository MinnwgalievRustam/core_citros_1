package com.citros.core.controller;

import com.citros.core.dto.AssignmentDTO;
import com.citros.core.dto.UserDTO;
import com.citros.core.mapper.AssignmentMapper;
import com.citros.core.model.Assignment;
import com.citros.core.model.User;
import com.citros.core.service.interface_impl.AssignmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AssignmentController {
    private final AssignmentService assignmentService;
    private final AssignmentMapper assignmentMapper;


    @GetMapping("/assignments/{id}")
    public AssignmentDTO sayHello(@PathVariable Long id) {
        Assignment assignment = assignmentService.getAssignment(id);
        return assignmentMapper.toDTO(assignment);
    }

}
