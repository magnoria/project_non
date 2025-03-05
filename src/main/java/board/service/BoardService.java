package board.service;

import board.model.dto.BoardDto;

import board.model.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class BoardService {

    @Autowired
    private BoardMapper boardMapper;

    public boolean save(BoardDto boardDto){
        System.out.println("BoardService.save");
        System.out.println("boardDto = " + boardDto);

        return boardMapper.save(boardDto);
    }

    public ArrayList<BoardDto> findAll(){
        System.out.println("BoardService.findAll");
        System.out.println();

        return boardMapper.findAll();

    }



}
