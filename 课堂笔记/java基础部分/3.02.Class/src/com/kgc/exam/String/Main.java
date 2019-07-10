package com.kgc.exam.String;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String aa = "我爱你中国，我爱你故乡";
		
		//长度
//		System.out.println(aa.length());
		
		//是否为空 当值为null的时候，没法判断，会出现空指针异常
//		System.out.println(aa.isEmpty());
		
		//通过下标找到对应的字符
//		System.out.println(aa.charAt(5));
		
		//把字符串变成byte类型数组
//		byte[] str = aa.getBytes();
//		aa = new String(aa.getBytes("gbk"), "iso-8859-1");
//		System.out.println(aa);
		
		//是否以指定字符串开头
//		System.out.println(aa.startsWith("我爱"));
		
		//是否以指定字符串结尾
//		System.out.println(aa.endsWith("国"));
		
		//找到指定字符串第一次出现的位置，如果没有，返回-1
//		System.out.println(aa.indexOf("你"));
		
		//找到指定字符串最后一次出现的位置
//		System.out.println(aa.lastIndexOf("你"));
		
		//截取字符串，如果是一个值，就截取出包括指定下标往后的所有
		//如果是两个值，就截取出两个值之间的字符串，包括第一个下标指定的字符
//		System.out.println(aa.substring(5, 8));
		
		//拼接字符串
		// + 和 concat 的区别
		// + 拼接可以是任何基本数据类型
		// concat 拼接只能是字符串
//		System.out.println(aa.concat("aaaaa"));
		
		//替换
//		System.out.println(aa.replace("，", "&&"));
//		System.out.println(aa.replaceAll("爱你", "%%"));
		
		//通过指定字符把字符串拆分成一个数组
		String[] bb = aa.split("");
		System.out.println(Arrays.toString(bb));
		
		//大写小写之间转换
//		String bb = "AbCdEf";
//		System.out.println(bb.toLowerCase());
//		System.out.println(bb.toUpperCase());
		
		//去前后空格, 中间的空格去不掉
//		System.out.println(aa.trim());
		
		
		
		
		
	}
}
