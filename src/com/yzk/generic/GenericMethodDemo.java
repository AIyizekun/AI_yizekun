package com.yzk.generic;

/*
 * ���ͷ���
 * ���ͷ������ŵ�������?
 * ����ѧ��java�������еĻ���������ƾ͵�һ���ʱ��,����һ��Ҫ����;
 * ���ڻ�����ѵ�������,��ȫ�ǰ�������,ǿ�й���;����ȡ,���濪ʼ��ѧ;
 * �����ܽ����͵����д���������,�о��е�����;������!!!
 * 
 * 
 */
public class GenericMethodDemo {

	public static void main(String[] args){
		
		Integer[] integer ={12,23,56};
		String[]  str = { "����","�Ϻ�","����","�人"};
		
		genericMethod(str);
		genericMethod(integer);
	}
	
	public static <T> void genericMethod(T[] o){
		for(int i = 0;i<o.length;i++){
			
			System.out.println(o[i].toString());
		}
	}
}
