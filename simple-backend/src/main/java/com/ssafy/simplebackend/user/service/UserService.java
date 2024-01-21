package com.ssafy.simplebackend.user.service;

import com.ssafy.simplebackend.user.model.User;
import com.ssafy.simplebackend.user.model.UserDto;
import com.ssafy.simplebackend.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    // 유저 정보 저장
    @Transactional
    public void addUser(UserDto userDto){
        userRepository.save(new User(userDto.getId(), userDto.getUsername(), userDto.getAge()));
    }

    // 유저 정보 조회
    public List<UserDto> listUser(){
        return userRepository.findAll()
                .stream().map(UserDto::fromEntity)
                .collect(Collectors.toList());
    }
}
