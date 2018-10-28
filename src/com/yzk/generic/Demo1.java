package com.yzk.generic;

import java.util.ArrayList;

/**
 * 什么是泛型?java中为什么要设计泛型的机制,它解决了哪些问题?该如何使用泛型?
 * 请带着这些问题,逐步揭开泛型神秘的面纱
 * 1.泛型动机java中解决编译时类型检查的
 * 2.泛型为对象中的值限定了数据类型,
 * @author Administrator
 *有一个疑问，前段时间刚理解的东西，过一个月全部都忘了。这是什么情况？
 */
public class Demo1 {
	public static void main(String[] args) {
		
		//自动打包与自动装箱
		int a = 5;
		ArrayList<Integer> listt = new ArrayList<>();
		
		listt.add(a);
		
		int integer = listt.get(0);
		
		System.out.println(integer);
		
		
		
		//自动装箱
		ArrayList<Double>  list = new ArrayList<>();
		
		list.add(3.0);
		list.add(5.3);
		
		double double1 = list.get(0);
		
		System.out.println(double1);
		
		//测试自己写的栈
		
		GenericStack<String> stack = new GenericStack<>();
		
		stack.push("到没看");
		stack.push("看到没!");
		stack.push("没看到!");
		
		
		System.out.println(stack.getSize());
		
		
		
		System.out.println(stack.pop());
		
		System.out.println(stack.peek());
		
	}
}
