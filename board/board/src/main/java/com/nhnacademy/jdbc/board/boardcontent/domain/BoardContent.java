package com.nhnacademy.jdbc.board.boardcontent.domain;

import java.time.LocalDateTime;

public class BoardContent {
    private final int contentSerialNumber;
    private final String title;
    private final int classNumber;
    private final String content;
    private final String file;
    private final LocalDateTime writeTime;
    private final int liked;
    private final int replyLimit;

    private final int rollBack;
    private final String id;

    public int getContentSerialNumber() {
        return contentSerialNumber;
    }

    public String getTitle() {
        return title;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public String getContent() {
        return content;
    }

    public String getFile() {
        return file;
    }

    public LocalDateTime getWriteTime() {
        return writeTime;
    }

    public int getLike() {
        return liked;
    }

    public int getReplyLimit() {
        return replyLimit;
    }

    public int getRollBack() {
        return rollBack;
    }

    public String getId() {
        return id;
    }


    public BoardContent(int contentSerialNumber, String title, int classNumber, String content, String file, LocalDateTime writeTime, int liked, int replyLimit, int rollBack, String id) {
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
