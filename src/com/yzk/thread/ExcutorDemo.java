package com.yzk.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//ʹ���̳߳���ִ������

public class ExcutorDemo {

	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		executor.execute(new Task(200,"aa"));
		executor.execute(new Task(200,"bb"));
		executor.execute(new PrintNum(200));
		
		executor.shutdown();
	}
}
