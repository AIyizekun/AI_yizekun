package com.yzk.sort;

/*
 * 插入排序
 * 1.遍历数组,将第一个元素与第二个元素比较,将较大值,作为当前值,
 */
public class InsertSort {

		public static void Insert(int[] array){
			
			for (int i = 1; i < array.length; i++) {
				
				int j;//当前值
				int currentvalue = array[i];
				
				for (j = i-1;j>=0 && array[j]>currentvalue; j--) {
					
					array[j+1] = array[j];
				}
				array[j+1] = currentvalue;
			}
		}
		
		public static void main(String[] args) {
			int[] list ={23,56,96,45,-5};
			
			Insert(list);
			
			for (int k = 0; k < list.length; k++) {
				System.out.println(list[k]);
			}
		}
}
