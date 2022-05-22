package com.nhnacademy.jdbc.board.index.web;

import com.nhnacademy.jdbc.board.boardcontent.domain.BoardContent;
import com.nhnacademy.jdbc.board.boardcontent.service.BoardContentService;
import com.nhnacademy.jdbc.board.boardlist.service.BoardListService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping
@Slf4j
public class BoardController {

    private final BoardListService boardListService;
    private final BoardContentService boardContentService;

    public BoardController(BoardListService boardListService, BoardContentService boardContentService) {
        this.boardListService = boardListService;
        this.boardContentService = boardContentService;
    }

    // 보드 목록 보기
    @GetMapping(value = {"/boardList"})
    public String showBoardList(Model model){
        List<BoardContent> boardContentList = boardContentService.getBoardContents();
        model.addAttribute("boardContentList", boardContentList);
        return "index/boardList";
    }

    @GetMapping("/boardModify/modify/{contentSerialNumber}")
    public String modifyBoardContent(@PathVariable int contentSerialNumber,
                                     Model model){
        System.out.println(contentSerialNumber);
        model.addAttribute("boardContentSerialNum", contentSerialNumber);
        return "index/boardModify";
    }

    @PostMapping("/boardModify/modify/{contentSerialNumber}")
    public String modifyBoardContent(@RequestParam("title") String title,
                                     @RequestParam("content") String content,
                                     Model model){
        // public BoardContent(int contentSerialNumber, String title, int classNumber, String content, String file, LocalDateTime writeTime, int liked, int replyLimit, int rollBack, String id) {
        //
        BoardContent boardContent = new BoardContent(1, title, 0, content, null, new Timestamp(new Date().getTime()), 1, 0, 0, "admin" );
        boardContentService.modifyBoardContent(boardContent);
        return "index/boardModify";
    }

    @GetMapping("/boardDelete/delete/{contentSerialNumber}")
    public String deleteBoardContent(@PathVariable int contentSerialNumber,
                                     HttpSession session,
                                     Model model){

        System.out.println("====" + model.getAttribute("user"));
        System.out.println("=========" + session.getAttribute("user"));
        
        boardContentService.deleteBoardContentByWriter(contentSerialNumber, "A" );
        return "index/boardModify";
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
