package bl.services;

import static com.jayway.restassured.RestAssured.when;

import com.jayway.restassured.response.Response;

public class WeatherService {
	
	public static final String APP_ID = "673c5650a20311041c26d61291b186ae";
	public static final String WEATHER_SERVICE_URL = "http://api.openweathermap.org/data/2.5/weather?q=";
	
	public static Response getWeatherByCity(String city)
	{
		Response res = when().get(WEATHER_SERVICE_URL + city + "&appid=" + APP_ID);
		return res;
	}

}
