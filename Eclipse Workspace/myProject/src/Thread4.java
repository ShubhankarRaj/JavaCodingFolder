
public class Thread4 {
	public static void main (String[] args) {
		new Thread4().go();
		
	}
	public void go() {
		Thread t = new Thread();
		t.start();
		t.start();

		Runnable r = new Runnable() {
			
			public void run() {
				System.out.print("foo");
			}
			
		};
//		Thread t = new Thread(r);
//		t.start();
//		t.start();

	}
	
}
