package com.example.db.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;
@Alias("board")
@Data
public class BoardVo {
	
		   int b_idx;   //pk
		   String b_title;   //fk
		   String b_content;
		   String b_ip;
		   String b_readhit;
		   String b_regdate;
		   String b_modifydate;
		   int    mem_idx;
		   String mem_name;
		   int	  b_ref;
		   int	  b_step;
		   int    b_depth;
		   int	  b_type;
		   String b_use;
		   String b_moddate;
		   // 게시판 타입 (QnA / 공지사항 등)
	
		}


