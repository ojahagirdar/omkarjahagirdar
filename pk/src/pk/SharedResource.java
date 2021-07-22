package pk;

public class SharedResource {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharedResource1 r = new SharedResource1();
		MyThread t1 = new MyThread(2,5,r);
		MyThread t2 = new MyThread(3,5,r);
		t1.start();
		t2.start();
	}

}
class SharedResource1 {
	synchronized  void doPrint(int n1, int n2) {
		for(int i=0;i<=n2;i++) {
			System.out.print(n1+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println();
	}
}

class MyThread extends Thread{
	int num1,num2;
    SharedResource1 r;

	public MyThread(int num1, int num2, SharedResource1 r) {
	super();
	this.num1 = num1;
	this.num2 = num2;
	this.r = r;
}

	
	 @Override
	 public void run() {
	 	// TODO Auto-generated method stub
	 	r.doPrint(num1, num2);
	}
}
