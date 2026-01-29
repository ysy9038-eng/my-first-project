package com.example.db.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.db.vo.BoardVo;

@Mapper
public interface BoardDao {

	//List<boardVo> selectList();
		
		List<BoardVo> selectList();
		List<BoardVo> selectOneFromIdx(int mem_idx);
		BoardVo		  selectOneFromId(int idx);
		int 		  insert(BoardVo vo);
		int 		  update(BoardVo vo);
		int			  delete(int mem_idx);
}

/*public interface BoardDao {
    // 여기에 이미지 2에 적힌 메서드 명칭을 넣습니다.
    List<BoardVo> getBoardList(); //
    BoardVo getBoardDetail(int board_idx); //
    int insertBoard(BoardVo vo); //
    int updateBoard(BoardVo vo); //
    int deleteBoard(int board_idx); //
}*/
