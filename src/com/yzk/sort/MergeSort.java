package com.yzk.sort;

/*
 * 归并排序算法
 * 1.mergeSort()将数组拆分为first和second两个部分,并将传入的参数按照索引;
 * 使用System.arraycopy将list拆分成两个数组,当每个数组只有一个元素时结束,递归调用,
 * 2.merge()将拆分的两个数组,以及源数组作为参数传递进来;定义三个变量,接收数组内元素,当元素较小时存入temp数组,内的元素比较大小;
 */
public class MergeSort {
		//拆分数组
		public static void mergeSort(int[] list){
			//判断分冶集合长度
			if(list.length >1){
				//创建数组接收前半段
				int[] firstHalf = new int[list.length/2];
				//复制前半段内容
				System.arraycopy(list, 0, firstHalf, 0, list.length/2);
				//递归调用
				mergeSort(firstHalf);
				
				//后一段长度
				int secondHalfLength = list.length-list.length/2;
				//创建数组接收后半段
				int[] secondHalf = new int[secondHalfLength];
				
				System.arraycopy(list, list.length/2, secondHalf, 0, secondHalfLength );
				mergeSort(secondHalf);
				
				merge(firstHalf,secondHalf,list);
				
			}
		}
		
	//合并排序数组
		public static void merge(int[] list1,int[] list2,int[] temp){
			
			int current1 =0 ;
			int current2 = 0;
			int current3 = 0;
			//循环遍历前后数组
			while(current1 <list1.length && current2 <list2.length){
				//当前数组元素大于第二个数组时,存入临时数组
				if(list1[current1] <list2[current2]){
					temp[current3++] = list1[current1++];
				}else{
					temp[current3++] = list2[current2++];
				}
			}
			//将剩余元素存入临时集合
			while(current1 <list1.length){
				temp[current3++] = list1[current1++];
				
			}
			//
			while(current2 <list2.length){
				temp[current3++] = list2[current2++];
				
			}
					
		}
		//测试
		public static void main(String[] args) {
			int[] list = {95,56,-45,90,2,5,9,8,55};
			mergeSort(list);
			
			for (int i = 0; i < list.length; i++) {
				System.out.println(list[i]);
			}
		}
}
