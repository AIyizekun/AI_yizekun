package com.yzk.generic;

import java.util.ArrayList;

/**
 * ʲô�Ƿ���?java��ΪʲôҪ��Ʒ��͵Ļ���,���������Щ����?�����ʹ�÷���?
 * �������Щ����,�𲽽ҿ��������ص���ɴ
 * 1.���Ͷ���java�н������ʱ���ͼ���
 * 2.����Ϊ�����е�ֵ�޶�����������,
 * @author Administrator
 *��һ�����ʣ�ǰ��ʱ������Ķ�������һ����ȫ�������ˡ�����ʲô�����
 */
public class Demo1 {
	public static void main(String[] args) {
		
		//�Զ�������Զ�װ��
		int a = 5;
		ArrayList<Integer> listt = new ArrayList<>();
		
		listt.add(a);
		
		int integer = listt.get(0);
		
		System.out.println(integer);
		
		
		
		//�Զ�װ��
		ArrayList<Double>  list = new ArrayList<>();
		
		list.add(3.0);
		list.add(5.3);
		
		double double1 = list.get(0);
		
		System.out.println(double1);
		
		//�����Լ�д��ջ
		
		GenericStack<String> stack = new GenericStack<>();
		
		stack.push("��û��");
		stack.push("����û!");
		stack.push("û����!");
		
		
		System.out.println(stack.getSize());
		
		
		
		System.out.println(stack.pop());
		
		System.out.println(stack.peek());
		
	}
}
