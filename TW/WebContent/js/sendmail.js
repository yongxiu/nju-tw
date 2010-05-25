$('#form_comments').ready(function() {
	$('#author').blur(function() {
		var $parent = $(this).parent();
		$parent.find(".formtips").remove();
		if(this.value=="") {
			var errorMsg = '请输入您的称谓。';
			$parent.append('<span class="formtips onError">' + errorMsg + '</span>');
		}
	});

	$('#mailfrom').blur(function() {
		var $parent = $(this).parent();
		$parent.find(".formtips").remove();
		if(this.value=="") {
			var errorMsg = '请输入您的Email。';
			$parent.append('<span class="formtips onError">' + errorMsg + '</span>');
		} else if(this.value !="" && !/.+@.+.+\.[a-zA-Z]{2,4}$/.test(this.value)) {
			var errorMsg = '请输入正确的Email。';
			$parent.append('<span class="formtips onError">' + errorMsg + '</span>');
		}
	});

	$('#subject').blur(function() {
		var $parent = $(this).parent();
		$parent.find(".formtips").remove();
		if(this.value=="") {
			var errorMsg = '请输入主题。';
			$parent.append('<span class="formtips onError">' + errorMsg + '</span>');
		}
	});

	$('#comment').blur(function() {
		var $parent = $(this).parent();
		$parent.find(".formtips").remove();
		if(this.value=="") {
			var errorMsg = '请输入回复内容。';
			$parent.append('<p><span class="formtips onError onLast">' + errorMsg + '</span></p>');
		}
	});

	$('#input_comments_submit').click(function() {
		$("#form_comments .input").trigger('blur');
		var numError = $("#form_comments .onError").length;
		if(numError) {
			return false;
		}
	});
});