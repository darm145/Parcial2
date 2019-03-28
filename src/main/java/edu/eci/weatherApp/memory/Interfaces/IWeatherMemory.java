package edu.eci.weatherApp.memory.Interfaces;

import org.springframework.stereotype.Repository;

import edu.eci.weatherApp.model.WeatherData;


@Repository
public interface IWeatherMemory extends DAO<WeatherData,String>{
	
	
}
