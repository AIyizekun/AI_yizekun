package com.yzk.thread;

public class TaskThreadDemo {

	public static void main(String[] args) {
		Task task1 = new Task(100, "aa");
		Task task2 = new Task(100, "bb");
		PrintNum task3 = new PrintNum(100);

		Thread one = new Thread(task1);
		Thread two = new Thread(task2);
		Thread thr = new Thread(task3);

		one.start();
		two.start();
		thr.start();
		
		
	}

}

class Task implements Runnable {

	private int times;
	private String ch;

	public Task(int t, String c) {
		times = t;
		ch = c;
	}

	@Override
	public void run() {

		for (int i = 0; i < times; i++) {
			System.out.print(ch);
			if (i%10== 0) {
				System.out.println();
			}
		}

	}

}

class PrintNum implements Runnable {
	private int num;

	public PrintNum(int t) {
		num = t;
	}

	@Override
	public void run() {
		for (int i = 1; i < num; i++) {
			System.out.print(" "+i);
			if (i%10== 0) {
				System.out.println();
			}
		}

	}

}