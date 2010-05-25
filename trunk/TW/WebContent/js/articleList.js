$('#content').ready(function() {
	$("#checkbox_inbox_all").click(function() {
		if ($(this).attr("checked") == true) {
			$("input[name='checkbox_inbox']").each(function(){
				$(this).attr("checked", true);
			});
			$(".mark0").each(function() {
				$(this).addClass("lightBck");
			});
		}
		else {
			$("input[name='checkbox_inbox']").each(function(){
				$(this).attr("checked", false);
			});
			$(".mark0").each(function() {
				$(this).removeClass("lightBck");
			});
		}
	});
	
	$("input[name='checkbox_inbox']").click(function() {
		if ($(this).attr("checked") == true) {
			$(this).parent().parent().addClass("lightBck");
		}
		else {
			$(this).parent().parent().removeClass("lightBck");
		}
	});
	
	$("<a>全选</a>").click(function() {
		$("input[name='checkbox_inbox']").each(function(){
				$(this).attr("checked", true);
			});
			$(".mark0").each(function() {
				$(this).addClass("lightBck");
			});
	});
	
});

function selAll() {
	$("input[name='checkbox_inbox']").each(function(){
		$(this).attr("checked", true);
	});
	$(".mark0").each(function() {
		$(this).addClass("lightBck");
	});
}

function selConvert() {
	$("input[name='checkbox_inbox']").each(function(){
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
	$("input[name='checkbox_inbox']").each(function(){
		$(this).attr("checked", false);
	});
	$(".mark0").each(function() {
		$(this).removeClass("lightBck");
	});
}
