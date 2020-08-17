package com.typicode.jsonplaceholder;

import org.testng.annotations.BeforeMethod;

import static com.typicode.jsonplaceholder.Endpoints.*;
import static io.restassured.RestAssured.baseURI;


public class BaseApiTest {

    @BeforeMethod(alwaysRun = true)
    public void setUpMethod() {
        baseURI = BASE_URI;
    }
}

