package RestAssuredDemo;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class SignUpTribe {

	@Test
	public void signUpApiTest() {

		JSONObject request = new JSONObject();
		baseURI = "https://dev.api.tribe.fitness";

		request.put("email", "subiii@yop.com");
		request.put("password", "subi123456");
		request.put("device_id", "df34dfer3");
		request.put("device_token", "3434erf43e");
		request.put("device_type", "WEB");
		request.put("app_version", "3.2");
		request.put("timezone_offset", "330");

		given().contentType("application/json").accept("application/json").body(request.toJSONString()).when()
				.post("/v1/member/sign-up").then().log().all().statusCode(200)
				.body("$.data.email", equalTo("subiii@yop.com"));

	}

}
