function getPlagas (especie) {
var urlplagas ='http://localhost:8080/plagas/'+encodeURI(especie);


$.getJSON(urlplagas,

     function(respuesta) {
		console.log(respuesta);
		lista=$("."+especie)
        lista.append($("<ul>"))
		lista=lista.find("ul")
		
		
		
		for (plaga in respuesta){
			k = respuesta[plaga].id+'_'+especie;
			lista.append($('<li class='+ k+'>').html(respuesta[plaga].nombre));		
		   	$("."+k).append('<form> <input id="boton" type="button" value="Ocultar titulo" /> </form>');
		}
		
		
	});
};
