/* 
 * JQuery de la page Tree
 */
$('#zoomer').click(function(){
    if($('#zoomer').text() == "- Smaller Image"){
        $('#zoomer').text("+ Larger Image");
        $('#imgTree').attr('width','700');
        $('#imgTree').attr('height','525');  
    }else{
        $('#zoomer').text("- Smaller Image");
        $('#imgTree').attr('width','1100');
        $('#imgTree').attr('height','750');  
    }
});