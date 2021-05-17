function getEspecies (cultivo) {

var urlespecies ='http://localhost:8080/especies/'+encodeURI(cultivo);


$.getJSON(urlespecies,

     function(respuesta) {
		lista=$("."+cultivo);
        lista.append($("<ul class="+cultivo+"_u >"));
		lista=lista.find("ul");
		
		
		for (especie in respuesta){
			k = respuesta[especie].id+'_'+cultivo
			lista.append($('<li class='+ k+'>').html("<span class="+k+"_s>"+ respuesta[especie].nombreVulgar+"</span>"));	
				
			$("."+k+"_s").easyTooltip({
  content: "<span style='color:blue;'>"+ respuesta[especie].nombreCientifico +" </span>"
});
		   	$("."+k).append('<form> <input id="'+k+'" type="button" value="Mostrar Plagas" /> </form>');
			
			var boton=$("#"+k);	

			boton.click(function(){
				h=$(this).attr("id");
				if ($(this).attr("value")=="Ocultar"){
					$(this).attr("value","Mostrar Plagas");
					$("."+h+"_u").remove()
					
				}
				else{					
					getPlagas(h);
					$(this).attr("value","Ocultar");
				}
				
				
			});
			
		}
		
		
	});
};
