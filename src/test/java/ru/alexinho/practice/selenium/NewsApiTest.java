package ru.alexinho.practice.selenium;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class NewsApiTest {

        final static String API_KEY = "1b487e042c5f45359e420a2cd1075010";

        @Test
        void test(){
            Response response = given().baseUri("https://newsapi.org/")
                    .basePath("v2/sources")
                    .queryParam("apiKey", API_KEY)
                    .log().all()

                    .when().get();

            JsonPath jsonPath = response.jsonPath();

            Assertions.assertEquals("ok", jsonPath.get("status"));
    }
}
