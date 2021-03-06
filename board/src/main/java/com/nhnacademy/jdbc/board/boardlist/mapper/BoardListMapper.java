package com.nhnacademy.jdbc.board.boardlist.mapper;

import com.nhnacademy.jdbc.board.boardlist.domain.BoardList;
import java.util.List;
import java.util.Optional;

public interface BoardListMapper {
    // 전체 조회
    List<BoardList> getBoardLists();

    // 글 1개 조회 String id parameter 부분 기능을 명확히 하자
    Optional<BoardList> getBoardList(int contentSerialNumber);
}
