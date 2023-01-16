package threadStudy;

public class ThreadA extends Thread{
	
	public int flagNum = 0;
	public boolean stop = false;
	public boolean work = true;
	
	public void run() {
		while(!stop) {
			//System.out.println("work : "+work);
			if(work) {
				System.out.println(flagNum+" ÀÛ¾÷");
			}else {
				Thread.yield();
			}
		}
	}
	
}
