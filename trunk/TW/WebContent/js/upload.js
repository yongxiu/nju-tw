$(document).ready(function() {
	$('#file').change(function() {
		var index1 = this.value.lastIndexOf("\\") + 1;
		var index2 = this.value.lastIndexOf(".");
		var str = this.value.substring(index1, index2);
		$('#name').val(str);
		if(this.value != "") {
			$(this).parent().parent().parent().find(".formtips").remove();
		}
	});
	
	$('#file').blur(function() {
		var $parent = $(this).parent();
		$parent.parent().find(".formtips").remove();
		if(this.value=="") {
			var errorMsg = '请选择要上传的文件！';
			$parent.before('<p><span class="formtips onError">' + errorMsg + '</span></p>');
		}
	});
	
	$('#name').blur(function() {
		var $parent = $(this).parent();
		$parent.parent().find(".formtips").remove();
		if(this.value=="") {
			var errorMsg = '请输入要保存的名称！';
			$parent.before('<p><span class="formtips onError">' + errorMsg + '</span></p>');
		}
	});
	
	$('#submit').click(function() {
		$(".filename").trigger('blur');
		var numError = $(".cent .onError").length;
		if(numError) {
			return false;
		}
	});
});