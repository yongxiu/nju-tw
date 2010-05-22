$(document).ready(function() {
	$('#file').change(function() {
		var index1 = this.value.lastIndexOf("\\") + 1;
		var index2 = this.value.lastIndexOf(".");
		var str = this.value.substring(index1, index2);
		$('#name').val(str);
	});
});