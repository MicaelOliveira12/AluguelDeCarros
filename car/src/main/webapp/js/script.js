$(document).ready(function () {
		
    $.getJSON('https://gist.githubusercontent.com/MicaelOliveira12/f4d23b21bbaec1edc28e6113a552241b/raw/a8d8ac106a36b78eb9db33105f4909c33cbe8355/marcas.json', function (data) {
        var items = [];
        var options = '<option value="">Escolha a Marca</option>';	
        $.each(data, function (key, val) {
            options += '<option value="' + val.nome + '">' + val.nome + '</option>';
        });					
        $("#marcas").html(options);				
        
        $("#marcas").change(function () {				
        
            var options_modelos = '';
            var str = "";					
            
            $("#marcas option:selected").each(function () {
                str += $(this).text();
            });
            
            $.each(data, function (key, val) {
                if(val.nome == str) {							
                    $.each(val.modelos, function (key_city, val_city) {
                        options_modelos += '<option value="' + val_city + '">' + val_city + '</option>';
                    });							
                }
            });
            $("#modelo").html(options_modelos);
            
        }).change();		
    
    });

});