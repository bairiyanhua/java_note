$(function(){
	$(".d1").click(function(){
		$(".d2").show();
	})
})

$(function(){
	var tou=["img/tou01.jpg","img/tou02.jpg","img/tou03.jpg","img/tou04.jpg"]
	var date=new Date();
	var str=date.getFullYear()+"-"+parseInt(date.getMonth()+1)+"-"+date.getDate()+" "+date.getHours()+":"+date.getMinutes();
	var title=$("input[type='text']")
	var sel=$("select")
	var are=$("input[type='textarea']")
	var nums=Math.floor(Math.random()*4)
	var div=$("<div><img src=tou[nums] /> </div>")
	var h1=$("<h1>'+title.val()+'</h1>")
	var sp1=$("<span>'+sel.val()+'</span>")
	var sp2=$"<span>'+str+'</span>"
	var p=$("<p></p>")
	p.append(sp1);p.append(sp2);
	var li=$("<li></li>")
	li.append(div);
	li.append(h1);
	li.append(p);
	var ul=$("ul")
	ul.append(li)
	
	title.val()=""
	sel.val()=""
	are.val()=""
	
	
})