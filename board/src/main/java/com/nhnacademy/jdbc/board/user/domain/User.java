package com.nhnacademy.jdbc.board.user.domain;

/**
 * @Author : hansung0904@naver.com / yujin353@naver.com
 */

public class User {
    private final String id;
    private final String password;

    public User(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User{" +
            "id='" + id + '\'' +
            ", password='" + password + '\'' +
            '}';
    }
}