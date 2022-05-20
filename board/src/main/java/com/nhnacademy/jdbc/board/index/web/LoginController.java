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
import org.springframework.web.bind.annotation.PostMapping;
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
    public String test(@CookieValue(value = "SESSION", required = false) String session,
                        Model model) {

        Optional<User> user = userMapper.selectUser("admin");
        model.addAttribute("user", user);
        System.out.println(user);

//        if(!user.isEmpty()){
//            log.debug("student : {}", user.toString());
//        }

        return "index/main";

//        if (StringUtils.hasText(session)) {
//            model.addAttribute("id", session);
//            return "loginSuccess";
//        } else {
//            return "loginForm";
//        }
    }

    @GetMapping(value = {"/login"})
    public String login(@CookieValue(value = "SESSION", required = false) String session,
                        Model model) {
        return "index/loginForm";

    }

    @PostMapping(value = {"/doLogin"})
    public String doLogin(@CookieValue(value = "SESSION", required = false) String session, Model model){
        Optional<User> user = userMapper.selectUser("admin");
        model.addAttribute("user", user);
        System.out.println(user);
        return "index/loginSuccess";
    }

}
