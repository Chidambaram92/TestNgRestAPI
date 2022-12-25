package com.test.testcases;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class EmployeeRestVerification {
	
	@Test(priority=1,groups={"test"})
	private void testRunPlaceHolder() {
		given().get("https://dummy.restapiexample.com/api/v1/employees")
		.then().statusCode(200).log().all();
		// Another Approach
		RestAssured.baseURI="https://dummy.restapiexample.com/api/v1/employees";
		RequestSpecification requestObj= RestAssured.given();
		Response response=requestObj.request(Method.GET);
		ResponseBody responseBody=response.getBody();
	}
}
