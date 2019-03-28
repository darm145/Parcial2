apiWeather=(function(){
	return {
		getWeatherConsulted:function(callback){
			$.get("/Weathers",function(data){
				callback(data);
			});
		}
	}
	
})();