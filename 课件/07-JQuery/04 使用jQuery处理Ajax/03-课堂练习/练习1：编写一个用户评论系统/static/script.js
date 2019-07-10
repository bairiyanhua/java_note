$("#submitBtn").click(function(evt){
	evt.preventDefault();
	$.ajax("/api/add_comment",{
		type:"POST",
		data:{
			username: $("#username").val(),
			comment: $("#comment").val()
		},
		success: function(result){
			var comments = JSON.parse(result);
			console.log(comments);
			console.log("提交成功");
		}
	})
	return false;
})