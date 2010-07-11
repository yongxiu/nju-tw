$('#content').ready(function() {
	$("input[name='checkId']").each(function(){
		if ($(this).attr("checked") == true) {
			$(this).parent().parent().addClass("lightBck");
		}
	});
	
	
	$("input[name='checkId']").click(function() {
		$("input[name='checkId']").each(function(){
			if ($(this).attr("checked") == true) {
				$(this).parent().parent().addClass("lightBck");
			} else {
				$(this).parent().parent().removeClass("lightBck");
			}
		});
	});
	
});

function selAll() {
	$("input[name='checkId']").each(function(){
		$(this).attr("checked", true);
	});
	$(".mark0").each(function() {
		$(this).addClass("lightBck");
	});
}

function selConvert() {
	$("input[name='checkId']").each(function(){
		if ($(this).attr("checked") == true) {
			$(this).attr("checked", false);
			$(this).parent().parent().removeClass("lightBck");
		} else {
			$(this).attr("checked", true);
			$(this).parent().parent().addClass("lightBck");
		}
	});
}

function selNone() {
	$("input[name='checkId']").each(function(){
		$(this).attr("checked", false);
	});
	$(".mark0").each(function() {
		$(this).removeClass("lightBck");
	});
}

function delUser(url) {
	var val = window.confirm("确定要删除吗？");
    if(val) {
    	window.location.href= (url);
    }
}
