package spring.core.ch02.ex02;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Timer {
   @Pointcut("execution(public * spring.core.ch02.ex02..*(..))")
   private void myPointcut() {}
   // 주가 돼서 clock이 실행될 이유가 없다, 해서 주가 아닌 종으로 실행되는 advice 라고 한다.
   @Around("myPointcut()") // clock 입장에서 rabbit의 sleep이 실행될때 Join 될것이다. advice가 결합될 지점이 JoinPoint이다.
   public Object clock(ProceedingJoinPoint jp) throws Throwable {
      System.out.println(jp.getSignature());
      
      long start = System.currentTimeMillis();
      Result result = (Result)jp.proceed();
      long end = System.currentTimeMillis();
      
      System.out.println("경과시간: " + (end - start));
      
      result.setResult(result.getResult() + "(clock)");
      return result;
   }
}
/*
@Aspect는 스프링 AOP에서 Aspect를 정의할 때 사용되는 어노테이션입니다. 
Aspect는 공통적으로 사용되는 기능(로깅, 보안 등)을 모듈화하여 
다수의 객체에 적용하기 위한 것입니다. 
Aspect는 Advice, Joinpoint, Pointcut, Introduction, Target 등으로 구성됩니다. 
@Aspect 어노테이션을 적용한 클래스는 Aspect로서 동작하게 됩니다. 
Aspect에서는 @Before, @After, @Around 등의Advice 어노테이션을 
이용하여 Joinpoint에서 실행될 기능을 정의할 수 있습니다.


@Around은 AOP에서 Advice의 종류 중 하나로, 대상 메서드의 호출 전/후로 실행되는 코드를 정의할 때 사용합니다.
@Around 어노테이션을 사용하면 Advice 메서드를 정의할 수 있으며, 이 메서드는 대상 메서드를 감싸고 있는 형태로 작성됩니다. 
Advice 메서드에서 대상 메서드를 직접 호출하고, 호출 전/후에 필요한 코드를 추가하여 대상 메서드의 동작을 변경할 수 있습니다.

Advice 메서드의 구현에는 ProceedingJoinPoint 객체를 이용하는 것이 일반적입니다. 이 객체는 대상 메서드의 실행을 제어할 수 있는 메서드들을 제공합니다. 
Advice 메서드에서 대상 메서드를 호출하려면 proceed() 메서드를 사용해야 합니다.

@Around 어노테이션을 사용하려면 먼저 @Aspect 어노테이션이 적용된 클래스가 필요합니다. 
이 클래스에서 Advice 메서드를 구현하고, @Around 어노테이션을 적용하여 대상 메서드를 감싸는 코드를 작성합니다. 
마지막으로, @Aspect 어노테이션이 적용된 클래스를 스프링 컨테이너에 등록하면 Advice가 적용됩니다.

Pointcut은 AOP에서 Advice를 적용할 Join Point를 결정하는 방법을 정의하는 역할을 합니다. 
즉, Pointcut은 Advice가 적용될 대상 메소드를 지정하는 일종의 필터 역할을 수행합니다.

Pointcut은 일반적으로 표현식 또는 어노테이션을 사용하여 정의할 수 있습니다. 
표현식을 사용하는 경우 AspectJ 표현식을 기반으로 합니다. 
어노테이션을 사용하는 경우, 해당 어노테이션을 포함하는 클래스 또는 메소드를 대상으로 하는 Pointcut을 정의할 수 있습니다.

Pointcut은 Advice가 적용될 Join Point를 결정하는 데 사용됩니다. 
Join Point는 메소드 호출, 객체 생성 및 필드 접근 등과 같은 애플리케이션 실행 시점의 특정 시점을 의미합니다.
*/