$(document).ready(function() {	
	$('#username').blur(function() {
		var $parent = $(this).parent();
		$parent.find(".formtips").remove();
		if(this.value=="") {
			var errorMsg = '请输入用户名！';
			$parent.append('<span class="formtips onError">' + errorMsg + '</span>');
		}
	});
	
	$('#name').blur(function() {
		var $parent = $(this).parent();
		$parent.find(".formtips").remove();
		if(this.value=="") {
			var errorMsg = '请输入姓名！';
			$parent.append('<span class="formtips onError">' + errorMsg + '</span>');
		}
	});
	
	$('#submit').click(function() {
		$('.cent .input').trigger('blur');
		var numError = $(".cent .onError").length;
		if(numError) {
			return false;
		}
	});
});