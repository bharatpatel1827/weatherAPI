package restAssuredTest.weatherAPI;

import static io.restassured.RestAssured.*;
//import static org.hamcrest.Matchers.*;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.cucumber.core.gherkin.messages.internal.gherkin.internal.com.eclipsesource.json.JsonObject;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojo.AddingContent;
import pojo.Hour;

public class GetRequest {
	
	@Test
	public void getWeatherAPI() {
		
		RestAssured.baseURI="http://api.weatherapi.com/v1/forecast.json";
		//RequestSpecification httprequest = RestAssured.given();
		
		AddingContent ad = given()
		.queryParam("key", "583e8a80228d4becb52145447211510")
		.queryParam("q", "Southampton")
		.queryParam("days", "2")
		.queryParam("aqi", "no")
		.queryParam("alerts", "no").expect().defaultParser(Parser.JSON)
		.when().get("http://api.weatherapi.com/v1/forecast.json")//.then().log().all().statusCode(200);
		.as(AddingContent.class);
		
		System.out.println(ad.getForecast().getForecastday().get(1).getDate());
		double wind= ad.getForecast().getForecastday().get(1).getHour().get(1).getWind_kph();
		System.out.println(wind);
		
		
		List<Hour> feelLike = ad.getForecast().getForecastday().get(1).getHour();
		for (int i=0;i<feelLike.size();i++) {
			System.out.println(feelLike.get(i).getCloud());
			
		}
		
		//System.out.println(httprequest);
		//Response resp = httprequest.request(Method.POST, "/forecast.json");
		
//		int respbody = resp.getStatusCode();
//		System.out.println(respbody);
//		Assert.assertEquals(respbody, 401);
//			.when()
//				.get("http://api.weatherapi.com/v1/forecast.json?key=583e8a80228d4becb52145447211510&q=Southampton&days=2&aqi=yes&alerts=yes")
//			.then().statusCode(200);
//			//.assertThat().body("q", equalTo("Southampton"));
			
		
	}

}
