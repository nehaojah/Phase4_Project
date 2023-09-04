package restassuredcrudtests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;

public class GetRequest {
	@Test

	public void GetBookingBDD()
	{
		//Given Method
		ValidatableResponse Response = RestAssured.given()
		 .baseUri("https://reqres.in")
		 
		 //When - We to tell what is the API Method
		  .when().get("/api/users?page=2")
		
		 //Then - We define the assertions or test case
		 .then()
		 .statusCode(200)
		 .log()
		 .all();
		System.out.println(Response);
		Response.statusCode(200);
		
		
	}

}
