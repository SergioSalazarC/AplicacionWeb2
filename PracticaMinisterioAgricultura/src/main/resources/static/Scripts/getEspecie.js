/*Funcion que se va a encargar de generar el subarbol de las especies de la categoria de cultivo que reciba como parametro asi como el boton que llamará a la funcion 
getPlagas para obtener las plagas de uno de estos cultivos*/

function getEspecies (cultivo) {

var urlespecies ='http://localhost:8080/especies/'+encodeURI(cultivo);


$.getJSON(urlespecies,

     function(respuesta) {
		lista=$("."+cultivo);
		/*la variable lista hace referencia a la raiz de nuestro subarbol que fue incluida en el script anterior. Con ella introduciremos como
		 ramas del arbol las especies de una categoria*/
		lista.append($("<ul class="+cultivo+"_u >"));
		/*añadimos una raiz de arbol para poder generar nuestro subarbol que esta identificado como el id de su padre+_u para que se pueda localizar 
		en el arbol doom y el boton de la categoria de cultivo padre pueda borrar la información*/
		lista=lista.find("ul");
		
		// A cada rama del subarbol le asociamos una clase con su identificador y el de su padre para poder identificar los elementos repetidos como entes diferentes
		for (especie in respuesta){
			k = respuesta[especie].id+'_'+cultivo
			/*A diferencia de los cultivos añadimos la especie entre una etiqueta span para que el nombre cientifico que se presenta con el easyTooltip
			 solo se muestre al colocarse sobre el nombre*/
			lista.append($('<li class='+ k+'>').html("<span class="+k+"_s>"+ respuesta[especie].nombreVulgar+"</span>"));	
				
			$("."+k+"_s").easyTooltip({
  				content: "<span>"+ respuesta[especie].nombreCientifico +" </span>"
			});
			
		   	$("."+k).append('<form> <input id="'+k+'" type="button" value="Mostrar Plagas"  class="raise"/> </form>');
			
			var boton=$("#"+k);	

			boton.click(function(){
				h=$(this).attr("id");
				//el campo value a parte de ser el que marca la etiqueta del boton lo usamos para saber si este ha sido pulsado y borrar el subarbol o expandirlo según el caso
				if ($(this).attr("value")=="Ocultar"){
					$(this).attr("value","Mostrar Plagas");
					$("."+h+"_u").remove()
					// esto quita la rama del arbol que se ha generado con la llamada a getPlagas ya que la etiqueta ul pertenece a la clase h_u
					
				}
				else{					
					getPlagas(h);
					$(this).attr("value","Ocultar");
				}
				
				
			});
			
		}
		
		
	});
};
