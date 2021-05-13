function getSustancias (plaga) {
	
plagaId = plaga.split('_')[0];
var urlsustancias ='http://localhost:8080/sustancias/'+encodeURI(plagaId);


$.getJSON(urlsustancias,

     function(respuesta) {
		lista=$("."+plaga)
        lista.append($("<ul>"))
		lista=lista.find("ul")
		
		
		
		for (sustancia in respuesta){
			k = respuesta[sustancia].id+'_'+plaga;
			lista.append($('<li class='+ k+'>').html(respuesta[sustancia].nombre));		
		   	$("."+k).append('<form> <input id="'+k+'" type="button" value="Mostrar Productos" /> </form>');
			var boton=$("#"+k);	

			boton.click(function(){
				h=$(this).attr("id");
				getProductos(h);
			});
		}
		
		
	});
};