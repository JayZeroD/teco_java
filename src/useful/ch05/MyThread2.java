package useful.ch05;

import javax.swing.JFrame;

/**
 * 쓰레드를 만드는 2번째 방법 Runnable 인터페이스를 
 * 활용하는 방법
 * 
 */
public class MyThread2 extends JFrame implements Runnable{

	// Thread 클래스에서 start 메서드가 호출 되면
	// 동작하는 부분 // 약속되어 있음.
	@Override
	public void run() {
		int i = 0;
		while(i < 10) {
			System.out.println("i : " + i);
			i++;
			try {
				MyThread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
}
