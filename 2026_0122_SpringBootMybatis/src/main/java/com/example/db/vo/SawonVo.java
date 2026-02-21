package com.example.db.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;
//@Data = @Setter + @Getter + @toString()
@Data
@Alias("sawon")
public class SawonVo {

	int sabun;
	String saname;
	String sagender;
	int deptno;
	String sajob;
	String sahire;
	int    samgr;
	int		sapay;
	
}
