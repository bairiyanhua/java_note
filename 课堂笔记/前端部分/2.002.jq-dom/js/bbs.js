$(function(){
	$("header span").click(function(){
		$(".post").show();
	})
	
	$(".btn").click(function(){
		var title = $(".title").val();
		var sel = $("select").val();
		
		var date = new Date();
		var str = date.getFullYear()+"-"+(date.getMonth()+1)+"-"+date.getDate()+" "+date.getHours()+":"+date.getMinutes();
		
		//获取头像
		var imgs = ["img/tou01.jpg", "img/tou02.jpg", "img/tou03.jpg", "img/tou04.jpg"];
		var num = Math.floor(Math.random()*4);
		
		var li = $("<li></li>");
		var div =$("<div><img src='"+imgs[num]+"'></div>");
		var h1 = $("<h1>"+title+"</h1>");
		var p = $("<p><span>所属版块："+sel+"</span>发布时间："+str+"<span></span></p>");
		var input = $("<input type='button' class='input' value='删除'/>");
		
		
		li.append(div).append(h1).append(p).append(input);
		$("ul").append(li);
		
		$(".title").val("");
		$("textarea").val("");
		$(".post").hide();
	})
	
	$(".input").live("click",function(){
		$(this).parent().remove();
	})
	
	
	
})

