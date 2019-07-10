;(function($){

	$.fn.ScrollPic=function(obj){


		var count = {

			num:3,   //张数
			time:500, //动画速度
			uls:".uls li",  //图片
			right:"#right", //右侧按钮
			left:"#left",    //左侧按钮
			parent:".uls"   //父级

		}

		var ob = $.extend(count,obj);


 		lg = ob.num;

 		imgW = $(ob.uls).innerWidth();   
 	 	
		$(ob.right).click(function(){

			$(ob.parent).animate({"marginLeft":-imgW*lg},ob.time,function(){

				$(ob.uls).slice(0,lg).appendTo(ob.parent);

				$(ob.parent).css("marginLeft","0px");

			});
		})
		$(ob.left).click(function(){

			$(ob.parent).css("marginLeft",-imgW*lg);
			$(ob.uls).slice(-lg).prependTo(ob.parent);
			$(ob.parent).animate({"marginLeft":"0px"},ob.time);

		})


	}


})(jQuery);