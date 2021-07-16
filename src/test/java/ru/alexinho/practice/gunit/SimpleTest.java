package ru.alexinho.practice.gunit;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class SimpleTest {
    @Test
    void test1(){
        Response response = RestAssured.get("https://ya.ru");
        Assertions.assertEquals(200, response.getStatusCode());
    }

    @Test
    void test2(){
        given().baseUri("https://ya.ru")
                .basePath("/")
                .when().get()
                .then().statusCode(200);
    }
}
