function getPlagas (especie) {
	
especieId = especie.split('_')[0];
var urlplagas ='http://localhost:8080/plagas/'+encodeURI(especieId);


$.getJSON(urlplagas,

     function(respuesta) {
		lista=$("."+especie)
        lista.append($("<ul>"))
		lista=lista.find("ul")
		
		
		
		for (plaga in respuesta){
			k = respuesta[plaga].id+'_'+especie;
			lista.append($('<li class='+ k+'>').html(respuesta[plaga].nombre));		
		   	$("."+k).append('<form> <input id="'+k+'" type="button" value="Mostrar Sustancias" /> </form>');
			var boton=$("#"+k);	

			boton.click(function(){
				h=$(this).attr("id");
				getSustancias(h);
			});
		}
		
		
	});
};
