package com.nhnacademy.jdbc.board.index.web;

import com.nhnacademy.jdbc.board.user.domain.User;
import com.nhnacademy.jdbc.board.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@Controller
@RequestMapping
@Slf4j
public class LoginController {

    private final UserService userService;

    public LoginController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping(value = {"/login"})
    public String login(@CookieValue(value = "SESSION", required = false) String session,
                        Model model) {
        //        if (StringUtils.hasText(session)) {
//            model.addAttribute("id", session);
//            return "loginSuccess";
//        } else {
//            return "loginForm";
//        }
        return "index/loginForm";

    }

    @PostMapping(value = {"/doLogin"})
    public String doLogin(@CookieValue(value = "SESSION", required = false) String session, HttpServletRequest request){
        Optional<User> user = userService.getUser("admin");
        request.setAttribute("user", user);
        System.out.println(user);
        return "index/loginSuccess";
    }

}
