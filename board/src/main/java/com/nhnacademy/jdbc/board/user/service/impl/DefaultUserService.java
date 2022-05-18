package com.nhnacademy.jdbc.board.user.service.impl;

import com.nhnacademy.jdbc.board.user.domain.User;
import com.nhnacademy.jdbc.board.user.service.UserService;
import java.util.Optional;

public class DefaultUserService implements UserService {
    @Override
    public Optional<User> getUser(String id) {
        return Optional.empty();
    }

    @Override
    public boolean checkUser(String id, String password) {
        return false;
    }
}