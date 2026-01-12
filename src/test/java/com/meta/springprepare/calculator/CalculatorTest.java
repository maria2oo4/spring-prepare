package com.meta.springprepare.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@Nested
@DisplayName("계산기 테스트")

class CalculatorTest {
    @Test
    @DisplayName("더하기 테스트")
    void test1() {
        // Given/when/Then 패턴으로 작성해야 좋다.
        // Given
        Double num1 = 8.0;
        String op = "+";
        Double num2 = 2.0;
        Calculator calculator = new Calculator();

        //when
        Double result = calculator.operate(num1, op, num2);
        System.out.println("result ="+ result);

        //Then
        Assertions.assertEquals(10, result);
    }

    @Test
    @DisplayName("빼기 테스트")
    void test2() {
        // Given/when/Then 패턴으로 작성해야 좋다.
        // Given
        Double num1 = 8.0;
        String op = "-";
        Double num2 = 2.0;
        Calculator calculator = new Calculator();

        //when
        Double result = calculator.operate(num1, op, num2);
        System.out.println("result ="+ result);

        //Then
        Assertions.assertEquals(6, result);
    }

    @Test
    @DisplayName("곱하기 테스트")
    void test3() {
        // Given/when/Then 패턴으로 작성해야 좋다.
        // Given
        Double num1 = 8.0;
        String op = "*";
        Double num2 = 2.0;
        Calculator calculator = new Calculator();

        //when
        Double result = calculator.operate(num1, op, num2);
        System.out.println("result ="+ result);

        //Then
        Assertions.assertEquals(16, result);
    }

    @Test
    @DisplayName("나누기 테스트")
    void test4() {
        // Given/when/Then 패턴으로 작성해야 좋다.
        // Given
        Double num1 = 8.0;
        String op = "/";
        Double num2 = 2.0;
        Calculator calculator = new Calculator();

        //when
        Double result = calculator.operate(num1, op, num2);
        System.out.println("result ="+ result);

        //Then
        Assertions.assertEquals(4, result);
    }

    @Test
    @DisplayName("잘못된 연산자 입력 테스트")
    void test5() {
        // Given/when/Then 패턴으로 작성해야 좋다.
        // Given
        Double num1 = 8.0;
        String op = "-";
        Double num2 = 0.0;
        Calculator calculator = new Calculator();

        //when
        IllegalAccessException thrown = Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> calculator.operate(num1, op, num2)
        );


        //Then
        Assertions.assertEquals(expected:10, result);
    }
}

