$(document).ready(function() {
	$('#myimg').imgAreaSelect({aspectRatio: '476:301'});
	var w = $('#myimg').width();
	var h = $('#myimg').height();
	if((w / 476) > (h / 301)) {
		w = h / 301 * 476;
	} else {
		h = w / 476 * 301;
	}
	$('#myimg').imgAreaSelect({x1: 0, y1: 0, x2: w, y2: h});
	
	var scaleX = 476 / w;
    var scaleY = 301 / h;

    $('#preview img').css({
        width: Math.round(scaleX * $('#myimg').width()),
        height: Math.round(scaleY * $('#myimg').height()),
    });
	
	$('#x1').val(0);
	$('#y1').val(0);
	$('#x2').val(w);
	$('#y2').val(h);
});

function preview(img, selection) {
    if (!selection.width || !selection.height)
        return;
    
    var scaleX = 476 / selection.width;
    var scaleY = 301 / selection.height;

    $('#preview img').css({
        width: Math.round(scaleX * $('#myimg').width()),
        height: Math.round(scaleY * $('#myimg').height()),
        marginLeft: -Math.round(scaleX * selection.x1),
        marginTop: -Math.round(scaleY * selection.y1)
    });
	
	$('#x1').val(selection.x1);
	$('#y1').val(selection.y1);
	$('#x2').val(selection.x2);
	$('#y2').val(selection.y2);
}

$(function () {
    $('#myimg').imgAreaSelect({
        fadeSpeed: 200, onSelectChange: preview });
});
