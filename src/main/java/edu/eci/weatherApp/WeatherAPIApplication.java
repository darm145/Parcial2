package edu.eci.weatherApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import edu.eci.weatherApp.http.HttpConnectionExample;

/**
 * Hello world!
 *
 */
@SpringBootApplication

public class WeatherAPIApplication 
{
    public static void main( String[] args )
    {
        SpringApplication.run(WeatherAPIApplication.class, args);
       
    }
}
