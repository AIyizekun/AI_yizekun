package com.yzk.generic;

/*
 * 泛型方法
 * 泛型方法的优点在哪里?
 * 真正学完java敲完所有的基础代码估计就得一年的时间,基础一定要打牢;
 * 现在回想培训班的生活,完全是拔苗助长,强行灌输;不可取,下面开始自学;
 * 今晚能将泛型的所有代码敲完吗,感觉有点困难;尽力吧!!!
 * 
 * 
 */
public class GenericMethodDemo {

	public static void main(String[] args){
		
		Integer[] integer ={12,23,56};
		String[]  str = { "北京","上海","广州","武汉"};
		
		genericMethod(str);
		genericMethod(integer);
	}
	
	public static <T> void genericMethod(T[] o){
		for(int i = 0;i<o.length;i++){
			
			System.out.println(o[i].toString());
		}
	}
}
