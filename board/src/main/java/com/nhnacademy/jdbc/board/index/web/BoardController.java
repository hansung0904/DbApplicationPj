package com.nhnacademy.jdbc.board.index.web;

import com.nhnacademy.jdbc.board.boardcontent.domain.BoardContent;
import com.nhnacademy.jdbc.board.boardcontent.service.BoardContentService;
import com.nhnacademy.jdbc.board.boardlist.service.BoardListService;
import com.nhnacademy.jdbc.board.user.domain.User;
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
    public String showBoardList(Model model) {
        List<BoardContent> boardContentList = boardContentService.getBoardContents();
        model.addAttribute("boardContentList", boardContentList);
        return "index/boardList";
    }

    // 보드 글 제목으로 검색
    @GetMapping(value = {"/boardList"})
    public String showBoardListByTitle(@RequestParam("title") String title, Model model) {
        List<BoardContent> boardContentList = boardContentService.getBoardContentsByTitle(title);
        model.addAttribute("boardContentList", boardContentList);
        return "index/boardList";
    }

    // 보드 글 수정
    @GetMapping("/boardModify/modify/{contentSerialNumber}")
    public String modifyBoardContent(@PathVariable int contentSerialNumber,
                                     HttpSession session,
                                     Model model) {

        User user = (User) session.getAttribute("user");
        if (user.getId().equals("admin")) {
            return "index/error";
        }
        return "index/boardModify";
    }

    @PostMapping("/boardModify/modify/{contentSerialNumber}")
    public String modifyBoardContent(@RequestParam("title") String title,
                                     @RequestParam("content") String content,
                                     HttpSession session,
                                     Model model) {

        User user = (User) session.getAttribute("user");
        if (user.getId().equals("admin")) {
            return "index/error";
        } else {
            // fixme
//            BoardContent boardContent = new BoardContent();
            BoardContent boardContent = null;
            boardContentService.modifyBoardContentByUser(user.getId(), boardContent);
        }
        return "index/boardList";
    }

    @GetMapping("/boardDelete/delete/{contentSerialNumber}")
    public String deleteBoardContent(@PathVariable int contentSerialNumber,
                                     HttpSession session,
                                     Model model) {

        User user = (User) session.getAttribute("user");
        if (user.getId().equals("admin")) {
            boardContentService.deleteBoardContentByAdmin(user.getId(), contentSerialNumber);
        } else {
            boardContentService.deleteBoardContentByUser(user.getId(), contentSerialNumber);
        }
        return "index/boardList";
    }


    //보드 글 작성
    @GetMapping("/boardWrite/write/{contentSerialNumber}")
    public String writeBoardContent(@PathVariable int contentSerialNumber,
                                    HttpSession session,
                                    Model model) {

        User user = (User) session.getAttribute("user");
        if (user.getId().equals("admin")) {
            return "index/error";
        }
        return "index/boardWrite";
    }

    // 보드 글 작성
    @PostMapping("/boardWrite/write/{contentSerialNumber}")
    public String writeBoardContent(@RequestParam("title") String title,
                                    @RequestParam("content") String content,
                                    HttpSession session,
                                    Model model) {

        User user = (User) session.getAttribute("user");
        if (user.getId().equals("admin")) {
            return "index/error";
        } else {
            // fixme
//            BoardContent boardContent = new BoardContent();
            BoardContent boardContent = null;
            boardContentService.writeBoardContent(boardContent);
        }
        return "index/boardList";
    }


    // 보드 글 복구
    @GetMapping("/boardRollBack/rollBack/{contentSerialNumber}")
    public String rollBackBoardContent(@PathVariable int contentSerialNumber,
                                       HttpSession session,
                                       Model model) {

        User user = (User) session.getAttribute("user");
        if (!user.getId().equals("admin")) {
            return "index/error";
        } else {
            boardContentService.rollBackBoardContentByAdmin(user.getId(), contentSerialNumber);
            return "index/boardWrite";
        }
    }

    // 좋아요 등록

    // 좋아요 취소


}
