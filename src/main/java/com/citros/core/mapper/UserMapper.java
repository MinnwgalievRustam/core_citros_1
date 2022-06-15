package com.citros.core.mapper;

import com.citros.core.dto.UserDTO;
import com.citros.core.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDTO toDTO(User user);
}
