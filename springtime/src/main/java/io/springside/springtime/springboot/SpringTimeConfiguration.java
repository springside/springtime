package io.springside.springtime.springboot;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import io.springside.springtime.swagger.SpringFoxConfiguration;

@ComponentScan
@Configuration
@Import(SpringFoxConfiguration.class)
public class SpringTimeConfiguration {


}
