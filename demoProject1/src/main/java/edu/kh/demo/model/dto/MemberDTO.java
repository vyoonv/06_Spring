package edu.kh.demo.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


// Lombok : 자주 사용하는 코드를 컴파일시 자동 완성해주는 라이브러리 
// -> DTO(기본생성자, getter/setter, toString) + Log


@ToString      // toString 오버라이딩 자동완성 
@NoArgsConstructor  //기본 생성자
@Getter   // getter 자동완성
@Setter	  // setter 자동완성
public class MemberDTO {
	
	
	private String memberId; 
	private String memberPw; 
	private String memberName; 
	private int memberAge; 
	

	

}
