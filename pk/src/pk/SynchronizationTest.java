package pk;

public class SynchronizationTest {

	public static void main(String[] args) {
//		Printer p = new Printer();
//		PC1 pc1 = new PC1(p);
//		PC2 pc2 = new PC2(p);
//		pc1.start();
//		pc2.start();
		
		new Thread() {
			
			public void run() 
			{
				Printer.doPrint("java");
			}
		}.start();
		
		new Thread() {
			public void run() {
				Printer.doPrint("Python");
			}
		}.start();
		
	}
}

class Printer {

	synchronized static void doPrint(String doc) {		
		for(int i=1;i<=10;i++) {
			System.out.println("Printing "+doc+":"+i);
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}		
	}

	/*
	 * void doPrint(String doc) {
	 * 
	 * synchronized (this) {
	 * 
	 * for (int i = 1; i <= 10; i++) { System.out.println("Printing " + doc + ":" +
	 * i); try { Thread.sleep(500); } catch (InterruptedException e) {
	 * System.out.println(e.getMessage()); } } } }
	 */

}

//class PC1 extends Thread {
//	Printer p;
//
//	public PC1(Printer p) {
//		this.p = p;
//	}
//
//	@Override
//	public void run() {
//		p.doPrint("Java");
//	}
//}
//
//class PC2 extends Thread {
//	Printer p;
//
//	public PC2(Printer p) {
//		this.p = p;
//	}
//
//	@Override
//	public void run() {
//		p.doPrint("Python");
//	}
//}
