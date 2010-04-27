// JavaScript Document

window.onload = initForms;

function initForms(){
	
	for(var i = 0; i < document.forms.length; i++){
		document.forms[i].onsubmit = function(){return validForm();};	
	}
}

function validForm(){
	var allGood = true;
	var allTags = document.getElementsByTagName("*");
	
	for(var i = 0; i < allTags.length; i++){
		if(!validTag(allTags[i])){
			allGood = false;	
		}
	}
	return allGood;
	
	function validTag(thisTag){
		var outClass = "";
		var allClasses = thisTag.className.split(" ");
	
		for(var i= 0; i< allClasses.length; i ++){
			outClass += validBasedOnClass(allClasses[i]) + " ";	
		} 
	
		thisTag.className = outClass;
		if(outClass.indexOf("invalid") > -1){
			thisTag.focus();
			if(thisTag.nodeName == "input" || thisTag.nodeName == "textarea"){
				thisTag.select();	
			}
			
			alert("输入有误，请正确填写后重新发送！");
			return false;
			
		}
			
		return true;
		function validBasedOnClass(thisClass){
			var classBack = "";
			switch(thisClass){
			
				case "":
				case "invalid":	
					break;
				case "reqd":
					if(allGood && thisTag.value == ""){
						classBack += "invalid ";
					}
					classBack += thisClass;
					break;
				case "email":
					if(allGood && !validEmail(thisTag.value)){
						classBack += "invalid ";
					}
				default:
					classBack += thisClass;
			}
			
			return classBack;
		}
		
		function validEmail(email){
			var invalidChars = "/:,;";
			if(email == ""){
				return false;	
			}
			
			for(var k = 0; k < invalidChars.length; k++){
				var badChar = invalidChars.charAt(k);
				if(email.indexOf(badChar) > -1){
					return false;
				}
			}
			
			var atPos = email.indexOf("@", 1);
			if(atPos == -1){
				return false;	
			}
			
			if(email.indexOf("@", atPos + 1) != -1){
				return false;	
			}
			
			var periodPos = email.indexOf(".", atPos);
			if(periodPos == -1){
				return false;	
			}
			
			if(periodPos + 3 > email.length){
				return false;	
			}
			return true;
		}
	}
}