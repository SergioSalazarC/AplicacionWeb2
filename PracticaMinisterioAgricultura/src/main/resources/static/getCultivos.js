


$(function() {

	var urlcultivos ='http://localhost:8080/listaCultivos';


	$.getJSON(urlcultivos,
     function(respuesta) {
		lista=$(".listaCultivos")
        
		
		for (cultivo in respuesta){
			k = respuesta[cultivo].id
			lista.append($('<li class='+ k +'>').html(respuesta[cultivo].nombre));		
		   	$("."+k).append('<form> <input id="'+k+'" type="button" value="Ocultar titulo" /> </form>');
			
					
			var boton=$("#"+k);	

			
			boton.click(function(){
				h=$(this).attr("id");
				getEspecies(h);
			});
		}
		
		
  });

});


