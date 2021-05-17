
/*Funcion que se va a encargar de generar el arbol de las Categorias de cultivos asi como el boton que llamará a la funcion 
getEspecies para obtener las especies de una de las categorias*/

$(function() {

	var urlcultivos ='http://localhost:8080/listaCultivos';


	$.getJSON(urlcultivos,
     function(respuesta) {
		lista=$(".listaCultivos")
		//la variable lista hace referencia a la raiz de nuestro arbol que viene incluida en el html por defecto. Con ella introduciremos como ramas del arbol las categorias de cultivo
		
		for (cultivo in respuesta){
			k = respuesta[cultivo].id
			//A cada rama del arbol le asociamos una clase con su identificador y el de sus padre para poder identificar los elementos repetidos como entes diferentes
			lista.append($('<li class='+ k +'>').html(respuesta[cultivo].nombre));
			//Al boton le asociamos el identificador tambien para que sepa con respecto a que categoría cultivo debe expandir el arbol con sus especies 		
		   	$("."+k).append('<form> <input id="'+k+'" type="button" value="Mostrar Especies" /> </form>');
			
					
			var boton=$("#"+k);	

			
			boton.click(function(){
				//el campo value a parte de ser el que marca la etiqueta del boton lo usamos para saber si este ha sido pulsado y borrar el subarbol o expandirlo según el caso
				h=$(this).attr("id");
				if ($(this).attr("value")=="Ocultar"){
					$(this).attr("value","Mostrar Especies");
					$("."+h+"_u").remove()
					// esto quita la rama del arbol que se ha generado con la llamada a getEspecies ya que la etiqueta ul pertenece a la clase h_u
				}
				else{					
					getEspecies(h);
					$(this).attr("value","Ocultar");
				}
				
				
			});
		}
		
		
  });

});


