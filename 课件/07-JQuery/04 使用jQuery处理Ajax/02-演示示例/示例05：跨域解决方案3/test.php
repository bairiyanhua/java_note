<?php
	header("Content-type: text/html;charset=utf-8");
	//header("Access-Control-Allow-Origin:*");
	//echo '哈哈哈';
	$callback=$_GET['kyFn'];
	echo $callback.'("哈哈哈")';
	//echo 'fn("哈哈哈")';
	//echo 'haha("哈哈哈")';
?>