package com.ssafy.simplebackend.user.model;

import lombok.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class UserDto {
    private long id;
    private String username;
    private int age;

    public static UserDto fromEntity(User user){
        return new UserDto(
                user.getId(),
                user.getUsername(),
                user.getAge()
        );
    }
}
