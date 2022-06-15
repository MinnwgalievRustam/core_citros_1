package com.citros.core.service.interface_impl;

import com.citros.core.model.Assignment;

import java.util.List;

public interface AssignmentService {
    Assignment getAssignment(Long id);
    Assignment create(Assignment assignment);
    List<Assignment> findAll();
    Assignment update(Assignment assignment);
    void delete(Long id);
}
