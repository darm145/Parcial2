package edu.eci.weatherApp.services.contracts;

import org.springframework.stereotype.Service;

import edu.eci.weatherApp.memory.Interfaces.DAO;
import edu.eci.weatherApp.model.WeatherData;
@Service
public interface IWeatherServices extends DAO<WeatherData,String>{
	
}
