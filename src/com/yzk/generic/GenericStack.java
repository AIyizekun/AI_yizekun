package com.yzk.generic;



/*
 * 泛型能够提高软件的可靠性和可读性
 * 定义一个泛型类和接口
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
