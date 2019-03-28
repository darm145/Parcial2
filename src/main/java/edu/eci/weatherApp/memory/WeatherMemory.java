package edu.eci.weatherApp.memory;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import edu.eci.weatherApp.memory.Interfaces.IWeatherMemory;
import edu.eci.weatherApp.model.WeatherData;
@Component
@Qualifier("WeatherMemory")
public class WeatherMemory implements IWeatherMemory{
	public static ArrayList<WeatherData> consulted;
	
	public static ArrayList<WeatherData> getContainer(){
		if(consulted==null) {
			consulted=new ArrayList<WeatherData>();
		}
		return consulted;
	}
	
	@Override
	public List<WeatherData> findAll() {
		return consulted;
	}

	@Override
	public WeatherData find(String id) {
		synchronized(consulted) {
			for(WeatherData wd:consulted) {
				if(wd.getCity().equals(id)) return wd;
			}
			return null;
		}
		
	}

	@Override
	public String save(WeatherData entity) {
		synchronized(consulted) {
			boolean replaced=false;
			for(WeatherData wd:WeatherMemory.getContainer()) {
				if(wd.getCity().equals(entity.getCity())) {
					
				}
			}
			return entity.getCity();
		}
	}

}
