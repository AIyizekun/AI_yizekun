package com.yzk.generic;



/*
 * �����ܹ��������Ŀɿ��ԺͿɶ���
 * ����һ��������ͽӿ�
 * 
 */
public class GenericStack<T> {
	
	private java.util.ArrayList<T> list = new java.util.ArrayList<>();
	
	public int getSize(){
		return list.size();
	}
	
	public void push(T o){
		list.add(o);
	}
	
	public T peek(){
		return list.get(getSize() -1 );
	}
	
	public T pop(){
		T o = list.get(getSize() -1 );
			list.remove(getSize()-1);
			return o;
	}
	
	public boolean isEmpty(){
		
		return list.isEmpty();
		
	}

	@Override
	public String toString() {
		return "Stack [list=" + list + "]";
	}
	
}
