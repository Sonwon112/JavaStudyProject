package threadStudy;

public class ThreadStudy {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//-----------------------------(12.4)-------------------------------
		// 공유객체 사용시 스레드간의 간섭으로 원하지 않는 결과가 나오는 것을 방지하기 위한 
		//syncronized(동기화)를 사용하여 임계영역을 지정하는 예제
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
		//System.out.println("1 정지");
		aThread_1.work = false;
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		//System.out.println("1 재시작");
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
