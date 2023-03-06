package spring.core.ch02.ex02;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Timer {//aspect 클래스
	//advice라고 부른다,Around(주가되는 메소드를 먼저실행하겠다.) 를붙혀서 표현한다.
	@Around             //JoinPoint 는 어드바이스가 결합하는 주된메소드이다.
	public Object clock(ProceedingJoinPoint jp) throws Throwable{
		
	}
}
