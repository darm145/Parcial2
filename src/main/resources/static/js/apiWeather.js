apiWeather=(function(){
	return {
		getWeatherConsulted:function(callback){
			$.get("/Weathers",function(data){
				callback(data);
			});
		},
		getCityInfo:function(name,callback){
			$.get("/Weathers/"+name,function(data){
				callback(data);
			});
		}
	}
	
})();