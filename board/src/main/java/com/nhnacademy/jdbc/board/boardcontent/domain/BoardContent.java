package com.nhnacademy.jdbc.board.boardcontent.domain;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Getter @Setter
public class BoardContent {
    private final int contentSerialNumber;
    private final String title;
    private final int classNumber;
    private final String content;
    private final String file;
    private final Timestamp writeTime;
    private final int liked;
    private final int replyLimit;

    private final int rollBack;
    private final String id;

    public BoardContent(int contentSerialNumber, String title, int classNumber, String content, String file, Timestamp writeTime, int liked, int replyLimit, int rollBack, String id) {
        this.contentSerialNumber = contentSerialNumber;
        this.title = title;
        this.classNumber = classNumber;
        this.content = content;
        this.file = file;
        this.writeTime = writeTime;
        this.liked = liked;
        this.replyLimit = replyLimit;
        this.rollBack = rollBack;
        this.id = id;
    }
}
