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
	
});