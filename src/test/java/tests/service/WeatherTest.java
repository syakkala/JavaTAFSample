package tests.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

import bl.services.WeatherService;

public class WeatherTest {
	
	@Test
	public void getWeatherByCity()
	{
		Response res = WeatherService.getWeatherByCity("London");
		Assert.assertEquals(res.getStatusCode(), 200);
	}
	
	@Test
	public void getWeatherDescriptionByCity()
	{
		Response res = WeatherService.getWeatherByCity("London");
		Assert.assertEquals(res.path("name"), "London");
	}
}
