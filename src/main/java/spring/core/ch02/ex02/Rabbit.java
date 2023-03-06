package spring.core.ch02.ex02;

import org.springframework.stereotype.Component;

@Component
public class Rabbit {
	public Result sleep() {
		try {
			Thread.sleep((long)(Math.random()*1000));
		}catch(Exception e) {}
		
		Result result = new Result();
		result.setResult("zzz");
		
		return result;
	}
}
/*
@Component 어노테이션이 적용된 클래스는
Spring이 자동으로 빈으로 등록하게 됩니다.
따라서 이 클래스를 다른 클래스에서
주입(injection) 받아 사용할 수 있습니다.
*/