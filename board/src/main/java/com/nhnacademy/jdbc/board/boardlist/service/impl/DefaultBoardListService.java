package com.nhnacademy.jdbc.board.boardlist.service.impl;

import com.nhnacademy.jdbc.board.boardlist.domain.BoardList;
import com.nhnacademy.jdbc.board.boardlist.mapper.BoardListMapper;
import com.nhnacademy.jdbc.board.boardlist.service.BoardListService;
import java.util.List;
import java.util.Optional;

public class DefaultBoardListService implements BoardListService {
    private final BoardListMapper boardListMapper;

    public DefaultBoardListService(
        BoardListMapper boardListMapper) {
        this.boardListMapper = boardListMapper;
    }

    @Override
    public List<BoardList> getBoardLists() {
        return null;
    }

    @Override
    public Optional<BoardList> getBoardList(int contentSerialNumber) {
        return Optional.empty();
    }
}
