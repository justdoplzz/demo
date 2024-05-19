package com.example.demo.board.dto;

import lombok.Data;

@Data
public class BoardDto {
    
    private int boardIdx;
    private String title;
    private String contents;
    private int hitCnt;
    private String creatorId;
    private String createdDateTime;
    private String updateId;
    private String updatedDateTime;

    
}
