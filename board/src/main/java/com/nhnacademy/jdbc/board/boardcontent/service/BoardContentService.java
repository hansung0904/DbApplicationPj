package com.nhnacademy.jdbc.board.boardContent.service;

import com.nhnacademy.jdbc.board.boardContent.domain.BoardContent;

import java.util.List;
import java.util.Optional;

public interface BoardContentService {

    // 전체 조회
    List<BoardContent> getBoardContents();

    // 글 1개 조회
    Optional<BoardContent> getBoardContent(String id);

    // 등록
    int registerBoardContent(BoardContent boardContent);

    // 수정
    int modifyBoardContent(BoardContent boardContent);

    // 삭제 - 관리자
    int deleteBoardContentByAdmin(int contentSerialNumber);

    // 삭제 - 글 작성자
    int deleteBoardContentByWriter(int contentSerialNumber, String id);


    // 복구
    int rollBackBoardContentByAdmin(int contentSerialNumber);

    // 파일
    // FIXME
    int uploadFile(String id);

    // 좋아요 - 누르기
    int upLike(String id);

    // 좋아요 - 취소
    int downLike(String id);

    // 댓글
    // FIXME


}
