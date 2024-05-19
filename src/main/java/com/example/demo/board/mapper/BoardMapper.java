package com.example.demo.board.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.board.dto.BoardDto;

import java.util.List;

@Mapper
public interface BoardMapper {
    @Select("SELECT board_idx, title, hit_cnt, created_datetime FROM t_board WHERE deleted_yn = 'N' ORDER BY board_idx DESC")
    List<BoardDto> selecBoardList() throws Exception;
}
