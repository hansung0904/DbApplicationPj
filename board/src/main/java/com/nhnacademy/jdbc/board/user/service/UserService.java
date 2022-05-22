package com.nhnacademy.jdbc.board.user.service;

import com.nhnacademy.jdbc.board.user.domain.User;

import java.util.List;
import java.util.Optional;


public interface UserService {
    Optional<User> getUser(String id);
    List<User> getUsers();
    Optional<User> checkUser(String id, String password);

}