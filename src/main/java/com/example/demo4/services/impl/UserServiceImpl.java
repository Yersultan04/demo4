package com.example.demo4.services.impl;

import com.example.demo4.entity.User;
import com.example.demo4.repository.UserRepository;
import com.example.demo4.services.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {
    private final UserRepository repository;

    @Override
    public User getById(Long id) {
        return repository.getById(id);
    }
}
