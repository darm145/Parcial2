package edu.eci.weatherApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan(basePackages="{edu.eci}")
public class WeatherAPIApplication 
{
    public static void main( String[] args )
    {
        SpringApplication.run(WeatherAPIApplication.class, args);
    }
}
