package ru.alexinho.practice.gunit.ParametrizedTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class TestMethodSource {

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void testCalculation(int expected, int param1, int param2){
        MyObject myObject = new MyObject();
        Assertions.assertEquals(expected, myObject.addition(param1, param2));
    }


    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(10, 7, 3),
                arguments(15, 10, 5)
        );
    }
}
