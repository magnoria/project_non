package board.model.mapper;

import board.model.dto.BoardDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface BoardMapper {

    public boolean save(BoardDto boardDto);

    public ArrayList<BoardDto> findAll();



}
