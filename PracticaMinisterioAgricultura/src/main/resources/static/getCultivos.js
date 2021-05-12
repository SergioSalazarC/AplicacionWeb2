$(function() {

var urlcultivos ='http://localhost:8080/listaCultivos';


$.getJSON(urlcultivos,

     function(respuesta) {
		lista=$(".listaCultivos")
        
		
		for (cultivo in respuesta){
			lista.append($('<li >').html(respuesta[cultivo].nombre));		   
		}
		
		
  });
});
