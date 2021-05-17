


$(function() {

	var urlcultivos ='http://localhost:8080/listaCultivos';


	$.getJSON(urlcultivos,
     function(respuesta) {
		lista=$(".listaCultivos")
        
		
		for (cultivo in respuesta){
			k = respuesta[cultivo].id
			lista.append($('<li class='+ k +'>').html(respuesta[cultivo].nombre));		
		   	$("."+k).append('<form> <input id="'+k+'" type="button" value="Mostrar Especies" /> </form>');
			
					
			var boton=$("#"+k);	

			
			boton.click(function(){
				h=$(this).attr("id");
				if ($(this).attr("value")=="Ocultar"){
					$(this).attr("value","Mostrar Especies");
					$("."+h+"_u").remove()
					
				}
				else{					
					getEspecies(h);
					$(this).attr("value","Ocultar");
				}
				
				
			});
		}
		
		
  });

});


