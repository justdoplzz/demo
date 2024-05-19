package com.example.demo.board.service;

import org.springframework.stereotype.Service;

import com.example.demo.board.dto.BoardDto;
import com.example.demo.board.mapper.BoardMapper;
import java.util.List;


@Service
public class BoardServiceImpl implements BoardService{
    
    private final BoardMapper boardMapper;

    // 생성자를 통해 의존성을 주입
    public BoardServiceImpl(BoardMapper boardMapper){
        this.boardMapper = boardMapper;
    }

    @Override
    public List<BoardDto> selectBoardList() throws Exception{
        return boardMapper.selecBoardList();
    }
    
    
}
