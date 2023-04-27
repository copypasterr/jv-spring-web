package mate.academy.spring.mapper;

import mate.academy.spring.dto.UserResponseDto;
import mate.academy.spring.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserDtoMapper {
    public UserResponseDto parse(User user) {
        return new UserResponseDto(user.getId(),
                user.getFirstName(),
                user.getFirstName());
    }
}