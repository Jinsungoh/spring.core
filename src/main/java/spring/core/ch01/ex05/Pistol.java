package spring.core.ch01.ex05;

import org.springframework.stereotype.Component;

@Component
public class Pistol implements Gun{
	@Override
	public void fire() {
		System.out.println("권총 탕탕.");
	}
}
//@Component 가붙은 IOC클래스를찾고 그 클래스가 Bean의 ID가 된다.