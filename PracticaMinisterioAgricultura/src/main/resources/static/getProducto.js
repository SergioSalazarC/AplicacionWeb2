function getProductos (sustancia) {
	
sustanciaId = sustancia.split('_')[0];
var urlproductos ='http://localhost:8080/productos/'+encodeURI(sustanciaId);


$.getJSON(urlproductos,

     function(respuesta) {
		lista=$("."+sustancia)
        lista.append($("<ul>"))
		lista=lista.find("ul")
		
		
		
		for (producto in respuesta){
			k = respuesta[producto].id+'_'+sustancia;
			lista.append($('<li class='+ k+'>').html(respuesta[producto].nombre));	
		}	
		
	});
};