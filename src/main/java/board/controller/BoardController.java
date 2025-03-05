package board.controller;


import board.model.dto.BoardDto;
import board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
@RequestMapping("/board")
public class BoardController {

    @Autowired
    private BoardService boardService;

    // [1] 등록
    @PostMapping("")
    public boolean save(@RequestBody BoardDto boardDto){
        System.out.println("BoardController.save");
        System.out.println("boardDto = " + boardDto);

        return boardService.save(boardDto);

    }

    //[2] 전체조회
    @GetMapping("")
    public ArrayList<BoardDto> findAll(){
        System.out.println("BoardController.findAll");
        System.out.println();

        return boardService.findAll();
    }


}
