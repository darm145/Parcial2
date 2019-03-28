package edu.eci.weatherApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import edu.eci.weatherApp.memory.Interfaces.IWeatherMemory;
import edu.eci.weatherApp.model.WeatherData;
import edu.eci.weatherApp.services.contracts.IWeatherServices;
@Component
public class WeatherServices implements IWeatherServices{
	
	@Autowired
	@Qualifier("WeatherMemory")
	private IWeatherMemory WeatherMemory;

	@Override
	public List<WeatherData> findAll() {
		return WeatherMemory.findAll();
	}

	@Override
	public WeatherData find(String id) {
		
		return WeatherMemory.find(id);
	}

	@Override
	public String save(WeatherData entity) {
		return WeatherMemory.save(entity);
	}

}
