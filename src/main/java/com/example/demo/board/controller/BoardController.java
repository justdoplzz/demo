package com.example.demo.board.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.board.dto.BoardDto;
import com.example.demo.board.service.BoardService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/board")
public class BoardController {
        private BoardService boardService;
    

    // 생성자를 통해 boardSerivce를 주입
    public BoardController(BoardService boardService){
        this.boardService = boardService;
    }

    @GetMapping
    public ModelAndView openBoardList() throws Exception{
        
        ModelAndView mv = new ModelAndView("board/boardList");

        List<BoardDto> list = boardService.selectBoardList();
        mv.addObject("list", list);

        return mv;
    }
}
