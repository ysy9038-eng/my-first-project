package com.example.demo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Getter @Setter
//@Data = @Getter + @Setter + @toString()
@Data
@AllArgsConstructor	//모든필드포함 생성자
@NoArgsConstructor	//기본생성자
public class PersonVo {


	String name;
	int		age;
	String  tel;
	
}
