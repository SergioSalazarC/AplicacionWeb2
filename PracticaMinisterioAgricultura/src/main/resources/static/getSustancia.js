/*Funcion que se va a encargar de generar el subarbol de las sustanciasactivas de la plaga que reciba como parametro asi como el boton que llamará a la funcion 
getProductos para obtener las Productos fitosanitarios de una de estas sustancias*/
function getSustancias (plaga) {
	
plagaId = plaga.split('_')[0];
var urlsustancias ='http://localhost:8080/sustancias/'+encodeURI(plagaId);


$.getJSON(urlsustancias,

     function(respuesta) {
		lista=$("."+plaga)
		/*la variable lista hace referencia a la raiz de nuestro subarbol que fue incluida en el script anterior. Con ella introduciremos como
		 ramas del arbol las sustancias activas de una plaga*/
		lista.append($("<ul class="+plaga+"_u >"));
		/*añadimos una raiz de arbol para poder generar nuestro subarbol que esta identificado como el id de su padre+_u para que se pueda localizar 
		en el arbol doom y el boton de la plaga padre pueda borrar la información*/
		lista=lista.find("ul")
		
		
		// A cada rama del subarbol le asociamos una clase con su identificador y el de su padre para poder identificar los elementos repetidos como entes diferentes
		for (sustancia in respuesta){
			k = respuesta[sustancia].id+'_'+plaga;
			lista.append($('<li class='+ k+'>').html(respuesta[sustancia].nombre));		
		   	$("."+k).append('<form> <input id="'+k+'" type="button" value="Mostrar Productos"  class="raise"/> </form>');
			var boton=$("#"+k);	

			boton.click(function(){
				h=$(this).attr("id");
				//el campo value a parte de ser el que marca la etiqueta del boton lo usamos para saber si este ha sido pulsado y borrar el subarbol o expandirlo según el caso
				if ($(this).attr("value")=="Ocultar"){
					$(this).attr("value","Mostrar Productos");
					$("."+h+"_u").remove()
					// esto quita la rama del arbol que se ha generado con la llamada a getSustancias ya que la etiqueta ul pertenece a la clase h_u
				}
				else{					
					getProductos(h);
					$(this).attr("value","Ocultar");
				}
				
				
			});
		}
		
		
	});
};