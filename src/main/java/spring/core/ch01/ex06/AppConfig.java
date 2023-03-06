package spring.core.ch01.ex06;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages="spring.core.ch01.ex06",
		excludeFilters=@Filter(type=FilterType.ANNOTATION,
				classes=(NoComponent.class)))
public class AppConfig {

}
/*
1.@ComponentScan 어노테이션은 패키지 내부에 있는 컴포넌트들을
자동으로 스캔하고 빈으로 등록해주는 역할을 합니다.
basePackages 속성으로 컴포넌트들이 위치한 패키지를 지정할 수 있습니다.
2.excludeFilters 속성으로 컴포넌트 스캔에서
제외할 대상을 지정할 수 있습니다.
위 코드에서는 @NoComponent 어노테이션이 붙은 클래스를
제외하도록 설정되어 있습니다. FilterType.ANNOTATION을
지정하여 어노테이션을 기준으로 제외 대상을 설정하고,
classes 속성으로 @NoComponent 어노테이션이 지정됩니다.
3.즉, spring.core.ch01.ex06 패키지 내부의
모든 컴포넌트를 스캔하되,
@NoComponent 어노테이션이 붙은 클래스는 빈으로 등록하지 않도록 설정된 것입니다.
*/