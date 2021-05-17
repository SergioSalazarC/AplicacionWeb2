/*Funcion que se va a encargar de generar el subarbol de las plagas de la especie que reciba como parametro asi como el boton que llamará a la funcion 
getSustancias para obtener las sustancias activas de una de estas plagas*/
function getPlagas (especie) {
	
especieId = especie.split('_')[0];
var urlplagas ='http://localhost:8080/plagas/'+encodeURI(especieId);


$.getJSON(urlplagas,

     function(respuesta) {
		lista=$("."+especie)
		/*la variable lista hace referencia a la raiz de nuestro subarbol que fue incluida en el script anterior. Con ella introduciremos como
		 ramas del arbol las plagas de una especie*/
		lista.append($("<ul class="+especie+"_u >"));
		/*añadimos una raiz de arbol para poder generar nuestro subarbol que esta identificado como el id de su padre+_u para que se pueda localizar 
		en el arbol doom y el boton de la especie padre pueda borrar la información*/
		lista=lista.find("ul")
		
		
		// A cada rama del subarbol le asociamos una clase con su identificador y el de su padre para poder identificar los elementos repetidos como entes diferentes
		for (plaga in respuesta){
			k = respuesta[plaga].id+'_'+especie;
			/*Al igual que con las especies añadimos la plaga entre una etiqueta span para que el nombre cientifico que se presenta con el easyTooltip
			 solo se muestre al colocarse sobre el nombre*/
			lista.append($('<li class='+ k+'>').html("<span class="+k+"_s>"+ respuesta[plaga].nombre +"</span>"));		
			
			$("."+k+"_s").easyTooltip({
  content: "<span style='color:blue;'>"+ respuesta[plaga].nombreCientifico +" </span>"
});
			
			
			
		   	$("."+k).append('<form> <input id="'+k+'" type="button" value="Mostrar Sustancias" /> </form>');
			var boton=$("#"+k);	

			boton.click(function(){
				h=$(this).attr("id");
				//el campo value a parte de ser el que marca la etiqueta del boton lo usamos para saber si este ha sido pulsado y borrar el subarbol o expandirlo según el caso
				if ($(this).attr("value")=="Ocultar"){
					$(this).attr("value","Mostrar Sustancias");
					$("."+h+"_u").remove()
					// esto quita la rama del arbol que se ha generado con la llamada a getSustancias ya que la etiqueta ul pertenece a la clase h_u
				}
				else{					
					getSustancias(h);
					$(this).attr("value","Ocultar");
				}
				
				
			});
		}
		
		
	});
};
