package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// @Configuration : 해당 클래스가 bean 을 생성하는 클래스임을 표기
@Configuration
public class ContextConfiguration {

    // @Bean : 해당 메소드의 반환 값을 spring container 에 bean 으로 등록한다는 의미
    //         이름을 별도로 지정하지 않으면 메소드명을 bean 의 id로 자동 인식
    @Bean(name = "member")  // name 생략 가능
    public MemberDTO getMember() {
        return new MemberDTO(1, "user01", "pass01", "판다");
    }
}
