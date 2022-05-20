package com.nhnacademy.jdbc.board.index.web;

import com.nhnacademy.jdbc.board.student.domain.Student;
import com.nhnacademy.jdbc.board.user.domain.User;
import com.nhnacademy.jdbc.board.user.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
@Slf4j
public class LoginController {

    private final UserMapper userMapper;

    public LoginController(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @GetMapping(value = {"/", "/index.nhn"})
    public String login(@CookieValue(value = "SESSION", required = false) String session,
                        Model model) {

        List<User> user = userMapper.selectUsers();

        if(!user.isEmpty()){
            log.debug("student : {}", user.toString());
        }

        return "index/loginSuccess";

//        if (StringUtils.hasText(session)) {
//            model.addAttribute("id", session);
//            return "loginSuccess";
//        } else {
//            return "loginForm";
//        }
    }

}
