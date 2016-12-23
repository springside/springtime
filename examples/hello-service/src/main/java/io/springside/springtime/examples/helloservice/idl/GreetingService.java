package io.springside.springtime.examples.helloservice.idl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("Greeting Service")
public interface GreetingService {

	
	public static class HelloRequest {
		public String name;
	}

	public static class HelloResponse {
		public String message;
	}

	public static class WeatherRequest {
		public City city;
	}

	public static class WeatherResponse {
		public String weather;
	}

	@ApiOperation(value = "hello")
	public HelloResponse hello(HelloRequest helloRequest);

	@ApiOperation(value = "weather")
	public WeatherResponse weather(WeatherRequest weatherRequest);

}
