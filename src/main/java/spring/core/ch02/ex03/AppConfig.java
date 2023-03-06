package spring.core.ch02.ex03;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("spring.core.ch02.ex03")
@EnableAspectJAutoProxy
public class AppConfig {

}
/*
@EnableAspectJAutoProxy는 
Spring의 Java-based configuration에서 
AspectJ AOP를 사용할 때 활성화하는 어노테이션입니다. 
이 어노테이션은 @Configuration 클래스에 선언하여 
AspectJ AOP 지원을 활성화합니다. 이를 통해, 
Spring은 AspectJ AOP를 사용하여 코드 실행 시 
필요한 코드를 자동으로 생성합니다. 이때, 
AspectJ AOP는 Spring AOP와 달리 프록시 객체 대신 
직접 타겟 객체에 대한 코드를 수정하므로, 
더 빠르고 정교한 AOP를 제공합니다.
*/