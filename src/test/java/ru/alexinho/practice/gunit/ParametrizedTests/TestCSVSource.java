package ru.alexinho.practice.gunit.ParametrizedTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestCSVSource {
    @ParameterizedTest
    @CsvSource("13,3,10")
    public void testCalculation(int expected, int param1, int param2){
        MyObject myObject = new MyObject();
        Assertions.assertEquals(expected, myObject.addition(param1, param2));
    }
}
