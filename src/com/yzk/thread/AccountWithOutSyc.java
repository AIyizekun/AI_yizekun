package com.yzk.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//ģ���̲߳���ȫ������

public class AccountWithOutSyc {

		private static Account account = new Account();
	//main����
	public static void main(String[] args) {
		
		ExecutorService exe = Executors.newCachedThreadPool();
		
		for (int i = 0; i < 100; i++) {
			exe.execute(new AddPenny());
			
		}
		exe.shutdown();
		
		while (!exe.isTerminated()) {
		
			
		}
		System.out.println("�ж���Ǯ:" + account.getRmb());
	}
	
	private static class AddPenny implements Runnable{

		@Override
		public void run() {
			account.deposit(1);
			
		}
		
	}
		
		private static class Account{
			private int rmb = 0;
			
			public int getRmb(){
				return rmb;
			}
			public synchronized void deposit(int amo){
				int newrmb = amo + rmb;
			try {
				Thread.sleep(5);
			} catch (Exception e) {
				
			}	
			rmb = newrmb;	
			}
		}
}

	
