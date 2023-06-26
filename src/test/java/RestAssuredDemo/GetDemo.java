package RestAssuredDemo;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetDemo {

	@Test
	public void getRequest() {

		RestAssured.baseURI = "https://reqres.in/api";
		RestAssured.basePath = "unknown";

		Response response = RestAssured.given().
				when().get().then().extract().response();


		Assertions.assertEquals(200, response.getStatusCode());

	}

}
