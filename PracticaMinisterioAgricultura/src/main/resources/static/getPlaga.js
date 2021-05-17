function getPlagas (especie) {
	
especieId = especie.split('_')[0];
var urlplagas ='http://localhost:8080/plagas/'+encodeURI(especieId);


$.getJSON(urlplagas,

     function(respuesta) {
		lista=$("."+especie)
        lista.append($("<ul class="+especie+"_u >"));
		lista=lista.find("ul")
		
		
		
		for (plaga in respuesta){
			k = respuesta[plaga].id+'_'+especie;
			lista.append($('<li class='+ k+'>').html("<span class="+k+"_s>"+ respuesta[plaga].nombre +"</span>"));		
			
			$("."+k+"_s").easyTooltip({
  content: "<span style='color:blue;'>"+ respuesta[plaga].nombreCientifico +" </span>"
});
			
			
			
		   	$("."+k).append('<form> <input id="'+k+'" type="button" value="Mostrar Sustancias" /> </form>');
			var boton=$("#"+k);	

			boton.click(function(){
				h=$(this).attr("id");
				if ($(this).attr("value")=="Ocultar"){
					$(this).attr("value","Mostrar Sustancias");
					$("."+h+"_u").remove()
					
				}
				else{					
					getSustancias(h);
					$(this).attr("value","Ocultar");
				}
				
				
			});
		}
		
		
	});
};
