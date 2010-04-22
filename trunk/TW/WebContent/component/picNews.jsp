<%@ page  contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div id=nav>
<UL>
  <LI><IMG src="/TW/picNewsImg/1.jpg" text="中共十七届四中全会在京举行|中共十七届四中全会在京举行 中央政治局主持会议中央委员会总书记胡锦涛作重要讲话 全会听取和讨论胡锦涛受中央政治局委托作的工作报告 全会审议通过《中共中央关于加强和改进新形势下党的建设若干重大问题的决定》     .." pic="1">
  <DIV></DIV></LI>
  <LI><IMG src="/TW/picNewsImg/2.jpg" text="南京大学学生党员深入学习实践科学发展观活动实施方案|根据中央和部属高校深入学习实践科学发展观活动领导小组的部署，紧紧围绕培养中国特色社会主义合格建设者和可靠接班人的根本任务，按照学校“开拓创新求突破，科学发展建一流”的总体要求，结合学生特，制定我校学 .." pic="2">
  <DIV></DIV></LI>
  <LI><IMG src="/TW/picNewsImg/3.jpg" text="南京大学第十九次团代会召开|11月28日，我校共青团第十九次代表大会在大礼堂开幕。校党委书记洪银兴，校长陈骏，团省委书记练月琴、校党委副书记张异宾，党委常委、副校长闵铁军，党委常委、副校长张荣，党委常委、宣传部长朱庆葆，党委常委 .." pic="3">
  <DIV></DIV></LI>
  <LI><IMG src="/TW/picNewsImg/4.jpg" text="“K-Park”挑战杯|6月1日，从江苏省无锡市江南大学传来喜讯，在“K-Park”挑战杯第五届江苏省大学生创业计划竞赛决赛中，南京大学的三支代表队取得了两项特等奖和一项一等奖的骄人战绩，均获得进军2008年“挑战杯”中国大学生创业计划.." pic="4">
  <DIV></DIV></LI>
  <LI><IMG src="/TW/picNewsImg/5.jpg" text="南京大学学生党员深入学习实践科学发展观活动实施方案|根据中央和部属高校深入学习实践科学发展观活动领导小组的部署，紧紧围绕培养中国特色社会主义合格建设者和可靠接班人的根本任务，按照学校“开拓创新求突破，科学发展建一流”的总体要求，结合学生特点，制定我校 .." pic="5">
  <DIV></DIV></LI>
</UL>
<DIV id=frontTextBack></DIV>
<DIV id=frontText></DIV>
<DIV id=frontTextSub></DIV>
<DIV id=BG></DIV>

<DIV id=back><IMG height=330 src="" width=780></DIV>
</DIV>

<p>
  <SCRIPT type=text/javascript>
 <!--
 var num = 0;
 $("#nav").hide();
	$("li img").load(function(){
		num++;
		if (num==4)
		{
			$("#nav").show();
		}
	})
		.click(function(){
		
		//如果已经处于active状态，return
		if (this.className.indexOf("active")!=-1) return;
		
		//正文文字渐隐
		$("#frontText").fadeOut();
		$("#frontTextBack").fadeOut();
		$("#frontTextSub").fadeOut();

		//active状态的图片恢复原样
		$("li img.active").fadeTo(200,0.6)
		.removeClass("active")
		.animate({top:5,width:52,left:10},300)
		.parent().css({"color":"#aaa"});  //
		
		//获取数据
		var i = $(this).attr("pic");
		var t = $(this).attr("text").split("|");
		
		//当前
		$(this).animate({top:-5,width:70,height:40,left:1},100)
		.addClass("active")
		.fadeTo(200,1)
		.parent().css({"color":"white"});

		$("#back").children().addClass("gray").end()
					.fadeTo(500,0.1,function(){
										//var IMG = new Image();
										//IMG.s
										$(this).children("img").attr("src","/TW/picNewsImg/"+i+".jpg").removeClass("gray");	  //更改图片
										$(this).fadeTo(500,1,function(){
																$("#frontText").html(t[0]).fadeIn(200);	//更改正文文字
																$("#frontTextBack").html(t[0]).fadeIn(200);	//阴影文字
																$("#frontTextSub").html(t[1]).fadeIn(200)}	//副标题
																);
										})
		})

	//初始第一张图片
	
	var i =0;

	show();

	function show(){
		if (i==$("li img").size()) i = 0
		$("li img").eq(i).click();
		i++;
		//setTimeout(show(),1000);
	}

	document.oncontextmenu   =  function(e){return false}
	
	if (self.location.search!=""){
		var V = self.location.search;
		V = V.substr(1,V.length);
		eval(V);
		var json ="{";
		if (option.skin==0)
			$("#mask").hide();
		if (option.animate == 0){
		$("#nav ul").hide();
		}
		$("#nav").width(option.width?option.width:780);
		$("#nav").height(option.height?option.height:330);
		$("#back img").width($("#nav").width());
		$("#back img").height($("#nav").height());
		$(self.parent.document.getElementById("splash")).children().height($("#nav").height()).width($("#nav").width());
	}
		
 //-->
 </SCRIPT>
