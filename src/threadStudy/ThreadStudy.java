package threadStudy;

public class ThreadStudy {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Memory memory = new Memory();
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
	}
}
