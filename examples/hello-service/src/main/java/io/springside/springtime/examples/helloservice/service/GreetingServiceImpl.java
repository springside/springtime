package io.springside.springtime.examples.helloservice.service;

import io.springside.springtime.examples.helloservice.idl.GreetingService;
import io.springside.springtime.springboot.SpringTimeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("greeting")
@SpringTimeService("greeting")
public class GreetingServiceImpl implements GreetingService {

	@Override
	@ApiOperation("hello")
	public HelloResponse hello(HelloRequest helloRequest) {
		HelloResponse response = new HelloResponse();
		response.message = "Hello " + helloRequest.name;
		return response;
	}

	@Override
	public WeatherResponse weather(WeatherRequest weatherRequest) {
		WeatherResponse response = new WeatherResponse();
		response.weather = "Sunny at " + weatherRequest.city.getName();
		return response;
	}
}
