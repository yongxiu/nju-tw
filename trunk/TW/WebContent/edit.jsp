<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script type="text/javascript" src="<%=request.getContextPath()%>/ckeditor/ckeditor.js"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CKEditor Test</title>
</head>
<body>
<textarea  name="content" id="content" class="ckeditor" rows="16" cols="100"></textarea>
<script type="text/javascript">   
        CKEDITOR.replace('content',{filebrowserUploadUrl : '/ckeditor/ckeditor/uploader?Type=File',   
filebrowserImageUploadUrl : '<%=request.getContextPath()%>/uploader?Type=Image',   
filebrowserFlashUploadUrl : '/uploader?Type=Flash'  
        });   
</script> 
</body>
</html>