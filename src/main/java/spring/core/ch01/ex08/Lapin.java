package spring.core.ch01.ex08;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Lapin {

}
//prototype으로하면 객체를 콜할떄마다 새로생성한다.