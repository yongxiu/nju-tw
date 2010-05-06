/*
Copyright (c) 2003-2010, CKSource - Frederico Knabben. All rights reserved.
For licensing, see LICENSE.html or http://ckeditor.com/license
*/

CKEDITOR.editorConfig = function( config )
{
	config.language = 'zh-cn'; // 配置语言   
	config.uiColor = '#c2ceea'; // 背景颜色   
	config.width = '800px'; // 宽度   
	config.height = '300px'; // 高度   
	//config.skin = 'v2';//界面v2,kama,office2003   
	config.toolbar = 'Full';// 工具栏风格Full,Basic  
	
	config.toolbar_Full =
		[
		    ['Source','-','Save','NewPage','Preview','-','Templates'],
		    ['Cut','Copy','Paste','PasteText','PasteFromWord','-','Print', 'SpellChecker', 'Scayt'],
		    ['Undo','Redo','-','Find','Replace','-','SelectAll','RemoveFormat'],
		    '/',
		    ['Bold','Italic','Underline','Strike','-','Subscript','Superscript'],
		    ['NumberedList','BulletedList','-','Outdent','Indent','Blockquote','CreateDiv'],
		    ['JustifyLeft','JustifyCenter','JustifyRight','JustifyBlock'],
		    ['Link','Unlink'],
		    ['Image','Flash','Table','HorizontalRule','SpecialChar','PageBreak'],
		    '/',
		    ['Styles','Format','Font','FontSize'],
		    ['TextColor','BGColor'],
		    ['Maximize', 'ShowBlocks']
		];
	config.filebrowserUploadUrl = "ckupload.do?type=File";
	config.filebrowserImageUploadUrl = "ckupload.do?type=Image";
	config.filebrowserFlashUploadUrl = "ckupload.do?type=Flash";
	config.font_names='宋体/宋体;黑体/黑体;仿宋/仿宋 _GB2312;楷体/楷体_GB2312;隶书/隶书;幼圆/幼圆;微软雅黑/微软雅黑;'+ config.font_names;
};

