function getEspecies (cultivo) {

var urlespecies ='http://localhost:8080/especies/'+encodeURI(cultivo);


$.getJSON(urlespecies,

     function(respuesta) {
		lista=$("."+cultivo)
        lista.append($("<ul>"))
		lista=lista.find("ul")
		
		
		for (especie in respuesta){
			k = respuesta[especie].id+'_'+cultivo
			lista.append($('<li class='+ k+'>').html(respuesta[especie].nombreVulgar));		
		   	$("."+k).append('<form> <input id="boton" type="button" value="Ocultar titulo" /> </form>');;
		}
		
		
	});
};
