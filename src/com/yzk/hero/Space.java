package com.yzk.hero;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Space{
	
	//�����ڵ�ˮƽ�͸�ѧ���ʱ��ˮƽ��ʲô���������ñ��ʵ����Щ������
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
				map.put("С��","23");
				map.put("С��","23");
				map.put("С��","26");
				map.put("С��","27");
				map.put("С��","28");
				
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
				//sʵ�ַ�������ô����
				
	}

}
