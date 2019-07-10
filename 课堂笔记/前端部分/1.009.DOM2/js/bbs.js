function post(){
	document.getElementById("post").style.display = "block";
}

function postSuccess(){
	//获取标题
	var title = document.getElementById("title").value;
	//获取版块
	var sel = document.getElementById("sec").value;
	//获取时间
	var date = new Date();
	var str = date.getFullYear()+"-"+(date.getMonth()+1)+"-"+date.getDate()+" "+date.getHours()+":"+date.getMinutes();
	//获取头像
	var imgs = ["img/tou01.jpg", "img/tou02.jpg", "img/tou03.jpg", "img/tou04.jpg"];
	var num = Math.floor(Math.random()*4);
	
	//创建li标签
	var li = document.createElement("li");
	//创建div标签
	var div = document.createElement("div");
	//创建img标签并赋值
	var img = document.createElement("img");
	img.setAttribute("src", imgs[num]);
	//把img标签放入div中
	div.appendChild(img);
	
	var h1 = document.createElement("h1");
	h1.innerHTML = title;
	
	var p = document.createElement("p");
	var span1 = document.createElement("span");
	var span2 = document.createElement("span");
	span1.innerHTML = "所属版块：" + sel;
	span2.innerHTML = "发布时间：" + str;
	p.appendChild(span1);
	p.appendChild(span2);
	
	li.appendChild(div);
	li.appendChild(h1);
	li.appendChild(p);
	
	document.getElementById("postList").appendChild(li);
	
	document.getElementById("title").value = "";
	document.getElementById("content").value = "";
	document.getElementById("post").style.display = "none";
}
