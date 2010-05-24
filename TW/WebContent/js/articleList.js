$('#content').ready(function() {
	$("#checkbox_inbox_all").click(function() {
		if ($(this).attr("checked") == true) {
			$("input[name='checkbox_inbox']").each(function(){
				$(this).attr("checked", true);
			});
			$(".mark0").each(function() {
				$(this).css("background-color", "#FFFFCA");
			});
		}
		else {
			$("input[name='checkbox_inbox']").each(function(){
				$(this).attr("checked", false);
			});
			$(".mark0").each(function() {
				$(this).css("background-color", "#FFFFFF");
			});
		}
	});
	
	
	
});