package com.yzk.sort;

/*
 * �鲢�����㷨
 * 1.mergeSort()��������Ϊfirst��second��������,��������Ĳ�����������;
 * ʹ��System.arraycopy��list��ֳ���������,��ÿ������ֻ��һ��Ԫ��ʱ����,�ݹ����,
 * 2.merge()����ֵ���������,�Լ�Դ������Ϊ�������ݽ���;������������,����������Ԫ��,��Ԫ�ؽ�Сʱ����temp����,�ڵ�Ԫ�رȽϴ�С;
 */
public class MergeSort {
		//�������
		public static void mergeSort(int[] list){
			//�жϷ�ұ���ϳ���
			if(list.length >1){
				//�����������ǰ���
				int[] firstHalf = new int[list.length/2];
				//����ǰ�������
				System.arraycopy(list, 0, firstHalf, 0, list.length/2);
				//�ݹ����
				mergeSort(firstHalf);
				
				//��һ�γ���
				int secondHalfLength = list.length-list.length/2;
				//����������պ���
				int[] secondHalf = new int[secondHalfLength];
				
				System.arraycopy(list, list.length/2, secondHalf, 0, secondHalfLength );
				mergeSort(secondHalf);
				
				merge(firstHalf,secondHalf,list);
				
			}
		}
		
	//�ϲ���������
		public static void merge(int[] list1,int[] list2,int[] temp){
			
			int current1 =0 ;
			int current2 = 0;
			int current3 = 0;
			//ѭ������ǰ������
			while(current1 <list1.length && current2 <list2.length){
				//��ǰ����Ԫ�ش��ڵڶ�������ʱ,������ʱ����
				if(list1[current1] <list2[current2]){
					temp[current3++] = list1[current1++];
				}else{
					temp[current3++] = list2[current2++];
				}
			}
			//��ʣ��Ԫ�ش�����ʱ����
			while(current1 <list1.length){
				temp[current3++] = list1[current1++];
				
			}
			//
			while(current2 <list2.length){
				temp[current3++] = list2[current2++];
				
			}
					
		}
		//����
		public static void main(String[] args) {
			int[] list = {95,56,-45,90,2,5,9,8,55};
			mergeSort(list);
			
			for (int i = 0; i < list.length; i++) {
				System.out.println(list[i]);
			}
		}
}
