package restassuredcrudtests;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;

public class PostRequest {
	
	
	public String requestBody = "{\r\n"
			+ "    \"name\": \"neha\",\r\n"
			+ "    \"job\": \"Project Manager\"\r\n"
			+ "}";
	
	public String baseURI = "https://reqres.in/api/users";
	
	@Test
	public void PostBDDExample()
	{
		ValidatableResponse response = RestAssured.given()
			.baseUri(baseURI)
			.contentType(ContentType.JSON)
			.body(requestBody)
			
			//When Condition
			
			.when()
			.post()
			
			//then
			
			.then()
			.assertThat()
			.statusCode(201)
		
			.log().all();
		  System.out.println(response);
			//To check if the response is coming within specified seconds
		
		  response.time(Matchers.lessThan(15000L));
			response.statusCode(201);
		
	}
}
