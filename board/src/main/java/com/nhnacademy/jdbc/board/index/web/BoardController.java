package com.nhnacademy.jdbc.board.index.web;

import com.nhnacademy.jdbc.board.boardcontent.service.BoardContentService;
import com.nhnacademy.jdbc.board.boardlist.service.BoardListService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class BoardController {

    private final BoardListService boardListService;
    private final BoardContentService boardContentService;

    public BoardController(BoardListService boardListService, BoardContentService boardContentService) {
        this.boardListService = boardListService;
        this.boardContentService = boardContentService;
    }

    // 보드 목록 보기
    @GetMapping(value = {"/boardList"})
    public String showBoardList(){
        return "index/boardList";
    }


    // 보드 글 작성
    // /boardWrite
//    @PostMapping(value = {"/login"})
//    public String doLogin(@RequestParam("uname") String id,
//                          @RequestParam("psw") String password,
//                          HttpServletRequest request,
//                          HttpServletResponse response){
//
//        if(userService.checkUser(id, password)){
//            HttpSession session = request.getSession(true);
//
//            Cookie cookie = new Cookie("SESSION", session.getId());
//            response.addCookie(cookie);
//
//            return "index/loginSuccess";
//        }else{
//            return "index/longinForm";
//        }
//    }

    // 보드 글 수정
    // /boardModify

    // 보드 글 삭제
    // /boardDelete






}
