package spring.core.ch01.ex05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class Shooter {
	@Autowired @Nullable private Gun pistol;
	@Autowired @Nullable private Gun rifle;
	
	public void fire() {
		try {
		pistol.fire();
		rifle.fire();
		}catch(NullPointerException e) {}
	}
}
//변수명이달라도된다.
/*
@Autowired는 Spring에서 객체를 자동으로 주입해주는 어노테이션입니다.
객체를 주입할 때 해당 타입의 객체가 없으면 에러가 발생합니다.
하지만 @Autowired에 @Nullable을 추가하면
해당 타입의 객체가 없더라도 에러가 발생하지 않고
null 값을 주입해줍니다. 즉, 
해당 변수가 없을 때에도 코드가 정상적으로 실행될 수 있도록 해줍니다.
*/