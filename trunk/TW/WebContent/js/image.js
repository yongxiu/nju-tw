var oriW = 0;
var oriH = 0;

$(document).ready(function() {
	$('#myimg').imgAreaSelect({aspectRatio: '476:301'});
	oriW = $('#myimg').width();
	oriH = $('#myimg').height();
	$('#myimg').attr("style", "width:300px");
	var w = $('#myimg').width();
	var h = $('#myimg').height();
	if((w / 476) > (h / 301)) {
		w = h / 301 * 476;
	} else {
		h = w / 476 * 301;
	}
	$('#myimg').imgAreaSelect({x1: 0, y1: 0, x2: w, y2: h});
	
	var scaleX = 238 / w;
    var scaleY = 150 / h;

    $('#preview img').css({
        width: Math.round(scaleX * $('#myimg').width()),
        height: Math.round(scaleY * $('#myimg').height()),
    });
	
	$('#x2').val(Math.round(w / 300 * oriW));
	$('#y2').val(Math.round(h / $('#myimg').height() * oriH));
});

function preview(img, selection) {
    if (!selection.width || !selection.height)
        return;
    
    var scaleX = 238 / selection.width;
    var scaleY = 150 / selection.height;

    $('#preview img').css({
        width: Math.round(scaleX * $('#myimg').width()),
        height: Math.round(scaleY * $('#myimg').height()),
        marginLeft: -Math.round(scaleX * selection.x1),
        marginTop: -Math.round(scaleY * selection.y1)
    });

	$('#x1').val(Math.round(selection.x1 / 300 * oriW));
	$('#y1').val(Math.round(selection.y1 / $('#myimg').height() * oriH));
	$('#x2').val(Math.round(selection.x2 / 300 * oriW));
	$('#y2').val(Math.round(selection.y2 / $('#myimg').height() * oriH));
}

$(function () {
    $('#myimg').imgAreaSelect({
        fadeSpeed: 200, onSelectChange: preview });
});
