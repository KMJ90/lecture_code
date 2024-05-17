package com.ohgiraffers.section01.scope.subsection01.singleton;

import com.ohgiraffers.common.Beverage;
import com.ohgiraffers.common.Bread;
import com.ohgiraffers.common.Product;
import com.ohgiraffers.common.ShoppingCart;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

    @Bean
    public Product carpBread() {
        return new Bread("붕어빵", 1000, new java.util.Date());  // new java.util.Date() : 음식은 날짜로 표현
    }

    @Bean
    public Product milk() {
        return new Beverage("바나나우유", 1500, 500);  // capacity : 음료는 용량으로 표현
    }

    @Bean
    public Product water() {
        return new Beverage("지리산암반수", 3000, 500);  // capacity : 음료는 용량으로 표현
    }

    @Bean
    public ShoppingCart cart() {
        return new ShoppingCart();
    }
}
