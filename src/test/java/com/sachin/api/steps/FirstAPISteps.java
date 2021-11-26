package com.sachin.api.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;

public class FirstAPISteps {
    @Given("API server is up")
    public void apiServer(){
        baseURI = "http://localhost:8080/api/v3";
        given().get("/pet/10").then().statusCode(200);
//        baseURI.
    }

    @When("user tries to fetch the data")
    public void fetchdata(){

    }

    @Then("user gets successful response")
    public void apiResponse(){

    }
}
