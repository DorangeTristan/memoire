console.log('clicked');
$(document).ready(function(){
	console.log('jQuery loaded');
	$('ul#shoplist li a').click(function() {
		shopInfos(this.id);
		var idshop = this.id;
		$('ul#shoplist li.active').each(function(index){
			$(this).removeClass('active');
			$('ul#shoplist li#'+idshop).addClass('active');
		});
	});
	$('a#activation').click(function() {
		console.log($('a#activation').attr('idshop'));
		$.ajax({
			url: '/sandwich/admin/activation/id/'+$('a#activation').attr('idshop'),
			success: function(data, textStatus, jqXHR) {
				console.log(data);
				if(data==1) {
					$('a#activation').html('Désactiver');
					$('ul#shoplist li#'+$('a#activation').attr('idshop')+' a').removeClass('disabled');
				} else if(data==0) {
					$('a#activation').html('Activer');
					$('ul#shoplist li#'+$('a#activation').attr('idshop')+' a').addClass('disabled');
				}
			}
		});
	});
});

function shopInfos(idshop){
	$.ajax({
		url: '/sandwich/shop/infos/id/'+idshop,
		dataType: 'json',
		success: function(data, textStatus, jqXHR){
			//console.log(data);
			$('h2#shopname').text(data.name);
			$('div#shopaddress').replaceWith('<div id=\'shopaddress\'>'+
				data.address+'<br/>'+
				data.zipcode+' '+data.city+'<br/>'+
				data.country+'<br/>'+
				data.telephone+'</div>');
			$('a#shopproductslink').attr('href','/sandwich/product/list/id/'+data.idshop);
			//$('a#activation').attr('href','/sandwich/admin/activation/id/'+data.idshop);
			$('a#activation').attr('idshop',data.idshop);
			if(data.active==1) {
				$('a#activation').html('Désactiver');
			} else {
				$('a#activation').html('Activer');
			}
			$('pre#shophours').text(data.hours);	
		}
	});
}
