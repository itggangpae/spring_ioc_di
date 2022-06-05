package domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
public class User {
	private String id;
	private String pw;

	public void init() {
		System.out.println("User 생성");
	}
	public void exit() {
		System.out.println("User 소멸");
	}
}
