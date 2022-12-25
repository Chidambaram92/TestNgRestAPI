package com.test.testcases;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class NewTestCase {
	
	@Test(priority=1,groups={"smoke","get"})
	private void testRunPlaceHolder() {
		given().get("http://jsonplaceholder.typicode.com/posts/3")
		.then().statusCode(200).log().all();
	}
	@Test(priority=2,groups={"smoke","get"})
	private void testRunEmployee() {
		given().get("https://dummy.restapiexample.com/api/v1/employee/3")
		.then().statusCode(200).log().all();
	}
}
