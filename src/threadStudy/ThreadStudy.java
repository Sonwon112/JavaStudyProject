package threadStudy;

public class ThreadStudy {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//-----------------------------(12.4)-------------------------------
		// ������ü ���� �����尣�� �������� ������ �ʴ� ����� ������ ���� �����ϱ� ���� 
		//syncronized(����ȭ)�� ����Ͽ� �Ӱ迵���� �����ϴ� ����
		ThreadA aThread_1 = new ThreadA();
		ThreadA aThread_2 = new ThreadA();
		
		aThread_1.flagNum = 1;
		aThread_2.flagNum = 2;
		
		aThread_1.start();
		aThread_2.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}	
		//System.out.println("1 ����");
		aThread_1.work = false;
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		//System.out.println("1 �����");
		aThread_1.work = true;
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		
		aThread_1.stop = true;
		aThread_2.stop = true;
		/**
		* Memory memory = new Memory();
		Thread A = new Thread(new Runnable() {
			public void run() {
				memory.setData(50);
				System.out.println( memory.getData());
			}
		});
		Thread B = new Thread(new Runnable() {
			public void run() {
				memory.setData(100);
				System.out.println( memory.getData());
			}
		});
		
		A.start();
		B.start();
		**/
		//-------------------------------------------------------------------
		
		//---------------------------------------------------------------
	}
}
