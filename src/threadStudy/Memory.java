package threadStudy;

public class Memory {
	private int data;
	
	public Memory() {
		
	}
	
	public  void setData(int data) {
		synchronized (this) {
			this.data = data;
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e){
				System.out.println(this.data);
			}
		}
	}
	
	public int getData() {
		return data;
	}
}
