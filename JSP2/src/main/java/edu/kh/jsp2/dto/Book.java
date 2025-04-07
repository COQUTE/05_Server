package edu.kh.jsp2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Getter
//@Setter
//@ToString
@Data // Getter + Setter + toString
@NoArgsConstructor // 기본 생성자
@AllArgsConstructor // 모든 필드 초기화용 매개변수 생성자
public class Book {
	
	// 필드
	private String title;	// 제목
	private String writer;	// 작성자
	private int price;		// 가격
	
	// 메서드(생성자, getter/setter/toString())
}
