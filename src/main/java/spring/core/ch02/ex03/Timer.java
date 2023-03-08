package spring.core.ch02.ex03;

import java.time.LocalDateTime;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Timer {
   @Before("execution(* spring..*(int))")
   public void clockStart(JoinPoint jp) {
      System.out.println(jp.toShortString());
      System.out.println("시작 시각: " + LocalDateTime.now());
   }
   
   @After("within(spring..Calculator)")
   public void clockEnd(JoinPoint jp) {
	   System.out.println(jp.toShortString());
	   System.out.println("종료 시각:" + LocalDateTime.now());
   }
   
   @AfterReturning(pointcut="bean(calc*)",returning="result")
   public void printResult(JoinPoint jp, int result) {
	   System.out.println(jp.toShortString()+ ":" + result);
   }
}

/*
@AfterReturning은 AOP에서 사용하는 어노테이션 중 하나로, 
메서드가 성공적으로 반환되면(즉, 예외가 발생하지 않은 경우) 
실행되는 advice(어드바이스)를 정의할 때 사용합니다. 
이 어노테이션은 실행할 advice 메서드를 지정하며, 
해당 advice 메서드는 메서드 실행 결과를 참조할 수 있습니다. 
예를 들어, 메서드가 반환하는 값에 대한 로그를 기록하거나, 
반환된 값에 대해 특정한 연산을 수행하는 등의 작업을 수행할 수 있습니다.
*/