app=(function(){
	return{
		getCityInfo:function(name){
			return apiWeather.getCityInfo(name,function(weather){
				var data=$("#WeatherTable");
				
				var wd=JSON.parse(weather);
				console.log(wd.main);
				data.append("<tbody>"+
						"<tr>"+
							"<td>"+name+"</td>"+
							"<td>"+wd.main.temp+"</td>"+
							'<td>'+wd.main.temp_max+"</td>"+
							'<td>'+wd.main.temp_min+"</td>"+
							'<td>'+wd.main.humidity+"</td>"+
							'<td>'+wd.main.pressure+"</td>"+
							'</tr>'+"</tbody>"
							
						);
			});
		}
	}
})();