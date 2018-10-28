package com.yzk.hero;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Space{
	
	//你现在的水平和刚学编程时的水平有什么差别？你可以用编程实现那些操作？
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
				map.put("小明","23");
				map.put("小花","23");
				map.put("小流","26");
				map.put("小和","27");
				map.put("小明","28");
				
				boolean empty = map.isEmpty();
				boolean containsValue = map.containsValue("28");
				if(containsValue){
					System.out.println("zhetamashigeshneme");
				}
				
				if(!empty){
					System.out.println("caonimabidebiancheng");
				}
				Set<Entry<String,String>> entrySet = map.entrySet();
				for (Entry<String, String> entry : entrySet) {
					System.out.println(entry.getKey());
				}
				//s实现反射又怎么样？
				
	}

}
