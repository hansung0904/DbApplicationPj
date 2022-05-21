package com.nhnacademy.jdbc.board.boardcontent.service.impl;

import com.nhnacademy.jdbc.board.boardcontent.domain.BoardContent;
import com.nhnacademy.jdbc.board.boardcontent.mapper.BoardContentMapper;
import com.nhnacademy.jdbc.board.boardcontent.service.BoardContentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DefaultBoardContentService implements BoardContentService {
    private final BoardContentMapper boardContentMapper;

    public DefaultBoardContentService(BoardContentMapper boardContentMapper) {
        this.boardContentMapper = boardContentMapper;
    }


    @Override
    public List<BoardContent> getBoardContents() {
        return boardContentMapper.getBoardContents();
    }

    @Override
    public Optional<BoardContent> getBoardContent(String id) {
        return boardContentMapper.getBoardContent(id);
    }

    @Override
    public int modifyBoardContent(BoardContent boardContent) {
        return boardContentMapper.modifyBoardContent(boardContent);
    }

    @Override
    public int registerBoardContent(BoardContent boardContent) {
        return boardContentMapper.registerBoardContent(boardContent);
    }

    @Override
    public int deleteBoardContentByAdmin(int contentSerialNumber) {
        return boardContentMapper.deleteBoardContentByAdmin(contentSerialNumber);
    }

    @Override
    public int deleteBoardContentByWriter(int contentSerialNumber, String id) {
        return boardContentMapper.deleteBoardContentByWriter(contentSerialNumber,id);
    }

    @Override
    public int rollBackBoardContentByAdmin(int contentSerialNumber) {
        return boardContentMapper.rollBackBoardContentByAdmin(contentSerialNumber);
    }

    @Override
    public int uploadFile(String id) {
        return 0;
    }

    @Override
    public int upLike(String id) {
        return boardContentMapper.upLike(id);
    }

    @Override
    public int downLike(String id) {
        return boardContentMapper.downLike(id);
    }
}
