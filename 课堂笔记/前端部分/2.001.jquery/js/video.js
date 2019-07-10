$(function(){
	$("ul>li:not(ul>li:last)").css("margin-right","10px");
	$("ul>li:last").css("background-color","#f0f0f0");
	$("ul>li>span, ol>li:first span").css("background-color","#f0a30f");
//	$("ol>li:not(ol>li:first) span").css("background-color","#a4a3a3");
	$("ol>li:gt(0) span").css("background-color","#a4a3a3");
	$("ol>li:lt(5)").css("background","url(img/orange.jpg) right -4px no-repeat");
	$("ol>li:gt(4)").css("background","url(img/green.jpg) right -4px no-repeat");
	$("ol>li:eq(1)").css("background","url(img/green.jpg) right -4px no-repeat");
	
	$("ol>li").mouseenter(function(){
		$(this).find("p").show();
	}).mouseleave(function(){
		$(this).find("p").hide();
	})
})
