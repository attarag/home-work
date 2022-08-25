package com.sbrf.reboot;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class CalculatorTest {
    @BeforeAll
    static void beforeAll(){
        System.out.println("<<Before All CalculatorTest>>");
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5})
    void sum(int i) {
        Assertions.assertDoesNotThrow(()->Calculator.sum(i,10));
        Assertions.assertEquals(i+10, Calculator.sum(i,10));
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5})
    void sub(int i) {
        Assertions.assertDoesNotThrow(()->Calculator.sub(i,10));
        Assertions.assertEquals(i-10, Calculator.sub(i,10));
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5})
    void multiply(int i) {
        Assertions.assertDoesNotThrow(()->Calculator.multiply(i,10));
        Assertions.assertEquals(i*10, Calculator.multiply(i,10));
    }

    @ParameterizedTest
    @ValueSource(ints = {10,20,30,40,50})
    void divide(int i) {
        Assertions.assertDoesNotThrow(()->Calculator.divide(i,3));
        Assertions.assertEquals(i/3.0, Calculator.divide(i,3));
    }

    @ParameterizedTest
    @ValueSource(doubles = {10.0,20.0,30.0,40.0,50.0})
    void sin(double i) {
        Assertions.assertDoesNotThrow(()->Calculator.sin(i));
        Assertions.assertEquals(Math.sin(i), Calculator.sin(i));
    }

    @ParameterizedTest
    @ValueSource(doubles = {10.0,20.0,30.0,40.0,50.0})
    void cos(double i) {
        Assertions.assertDoesNotThrow(()->Calculator.cos(i));
        Assertions.assertEquals(Math.cos(i), Calculator.cos(i));
    }


    @AfterAll
    static void afterAll(){
        System.out.println("<<After All CalculatorTest>>");
    }
}