package ru.alexinho.practice.gunit.ParametrizedTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class TestCSVFileSource {
    @ParameterizedTest
    @CsvFileSource(resources = ("/testData.csv"))
    public void testCalculation(int expected, int param1, int param2){
        MyObject myObject = new MyObject();
        Assertions.assertEquals(expected, myObject.addition(param1, param2));
    }
}
