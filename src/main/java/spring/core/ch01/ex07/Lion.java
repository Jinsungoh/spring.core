package spring.core.ch01.ex07;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Lion implements InitializingBean, DisposableBean{
   @Override
   public void afterPropertiesSet() throws Exception {
      System.out.println("lion is born.");
   }
   
   public void shout() {
      System.out.println("lion shout.");
   }
   
   @Override
   public void destroy() throws Exception{
      System.out.println("lion is dead.");
   }

}
/*
1.Lion 클래스는 InitializingBean, DisposableBean 
인터페이스를 구현하여 빈 객체가 생성될 때와 소멸될 때 실행될 메서드를 정의합니다.
2.afterPropertiesSet() 메서드는
InitializingBean 인터페이스의 메서드로써,
빈 객체가 생성될 때 자동으로 실행됩니다.
해당 코드에서는 "lion is born." 문자열을 출력합니다.
3.
*/