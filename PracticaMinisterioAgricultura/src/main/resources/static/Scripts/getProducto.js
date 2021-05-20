//Funcion que se va a encargar de generar el subarbol de los productos fitosanitarios de la sustancia activa que reciba como parametro 
function getProductos (sustancia) {
	
sustanciaId = sustancia.split('_')[0];
var urlproductos ='http://localhost:8080/productos/'+encodeURI(sustanciaId);


$.getJSON(urlproductos,

     function(respuesta) {
		lista=$("."+sustancia)
		/*la variable lista hace referencia a la raiz de nuestro subarbol que fue incluida en el script anterior. Con ella introduciremos como
		 ramas del arbol los productos fitosanitarios de unasustancia activa*/
		lista.append($("<ul class="+sustancia+"_u >"));
		/*añadimos una raiz de arbol para poder generar nuestro subarbol que esta identificado como el id de su padre+_u para que se pueda localizar 
		en el arbol doom y el boton de la sustancia activa padre pueda borrar la información*/
		lista=lista.find("ul")
		
		
		
		for (producto in respuesta){
			k = respuesta[producto].id+'_'+sustancia;
			lista.append($('<li class='+ k+'>').html("<span >"+ respuesta[producto].nombre +"</span>"+"</br>"+"<a class='url' href= '"+respuesta[producto].url+"' target='_blank' >"+respuesta[producto].url  +"</a>"));	
			
		}	
		
	});
};