
public class ThreadTest {
	private static int cnt=1;
	public static void main(String[] args) {
		MyThread mythread=new MyThread();
		Thread thread1=new Thread(mythread);
		Thread thread2=new Thread(mythread);
		thread1.start();
		thread2.start();
		try {
			thread1.join();
			thread2.join();
		}catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	private static class MyThread implements Runnable{

		@Override
		public void run() {
			// TODO 自动生成的方法存根
			while(true) {
				synchronized (this) {
					this.notify();
					if(cnt<=100) {
						String currentThreadName=Thread.currentThread().getName();
						System.err.println(currentThreadName+":"+cnt++);
						try {
							this.wait();
						}
						catch (InterruptedException e) {
							// TODO: handle exception
							e.printStackTrace();
						}
					}
					else {
						return;
					}
				}
			}
		}
		
	}
}
