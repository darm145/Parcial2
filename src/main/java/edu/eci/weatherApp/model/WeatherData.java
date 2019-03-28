package edu.eci.weatherApp.model;

import java.io.Serializable;

public class WeatherData implements Serializable{
	private String city;
	private int Temperature;
	private int maxTemperature;
	private int minTemperature;
	private float humidity;
	private int preasure;
	private int speed;
	private float degrees;
	public WeatherData() {
		
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getTemperature() {
		return Temperature;
	}
	public void setTemperature(int temperature) {
		Temperature = temperature;
	}
	public int getMaxTemperature() {
		return maxTemperature;
	}
	public void setMaxTemperature(int maxTemperature) {
		this.maxTemperature = maxTemperature;
	}
	public int getMinTemperature() {
		return minTemperature;
	}
	public void setMinTemperature(int minTemperature) {
		this.minTemperature = minTemperature;
	}
	public float getHumidity() {
		return humidity;
	}
	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}
	public int getPreasure() {
		return preasure;
	}
	public void setPreasure(int preasure) {
		this.preasure = preasure;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public float getDegrees() {
		return degrees;
	}
	public void setDegrees(float degrees) {
		this.degrees = degrees;
	}
	
}
