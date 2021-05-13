function toggle(id_esp){
			getEspecies(id_esp);
		}


$(function() {

var urlcultivos ='http://localhost:8080/listaCultivos';


$.getJSON(urlcultivos,

     function(respuesta) {
		lista=$(".listaCultivos")
        
		
		for (cultivo in respuesta){
			k = respuesta[cultivo].id
			lista.append($('<li class='+ k +'>').html(respuesta[cultivo].nombre));		
		   	$("."+k).append('<form> <input id="boton_'+k +'" type="button" value="Ocultar titulo" /> </form>');

			
			
			var boton=$("#boton_"+k);	
			
			boton.click(toggle(k));
			
	
		}
		
		
		
		
		
		
  });



});


