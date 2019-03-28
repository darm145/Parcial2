package edu.eci.weatherApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import edu.eci.weatherApp.model.WeatherData;
import edu.eci.weatherApp.services.contracts.IWeatherServices;

@RestController
@RequestMapping("/Weathers")
public class WeatherController {
	@Autowired
	private IWeatherServices WeatherServices;
	
	
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getWeatherInfo(){
    	
        try{
            return new ResponseEntity<>(WeatherServices.findAll(), HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(e.getStackTrace(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @RequestMapping(method = RequestMethod.GET,path="/{name}")
    public ResponseEntity<?> getCityInfo(@PathVariable String name){
        try{
            return new ResponseEntity<>(WeatherServices.SearchByCity(name), HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(e.getStackTrace(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @RequestMapping(method = RequestMethod.PUT, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> createNewConsult(@RequestBody WeatherData data){
        try{
            return new ResponseEntity<>(WeatherServices.save(data), HttpStatus.CREATED);
        }catch(Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
        }
    }
}
