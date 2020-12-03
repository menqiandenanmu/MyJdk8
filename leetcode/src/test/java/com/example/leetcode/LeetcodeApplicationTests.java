package com.example.leetcode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LeetcodeApplicationTests {

    @Test
    void contextLoads() {
    }
    @Test
    void sayHello(){

        MathOpration mathOpration = (int a, int b) -> a + b;;
        System.out.println(mathOpration.oprate(1,2));
    }

}
