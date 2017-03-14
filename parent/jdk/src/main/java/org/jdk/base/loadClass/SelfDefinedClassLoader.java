package org.jdk.base.loadClass;
/***
 * 
 * java *.class loader  《双亲委派 模式》
 * 
 * 1. bootstrap the root classLoader responsible for the load the class in the JAVA_HOME/lib,for it is the inner function 
 *    so that you can not reference in your applocation
 * 
 * 2.
 * 
 * 3.
 * @author lw
 *
 */
public class SelfDefinedClassLoader {
	
	public static void main(String[] args) {
		
	final Thread task1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true){
//					System.out.println("just for test");
//					try {
//						Thread.sleep(100);
//					} catch (InterruptedException e) {
//						System.err.println(Thread.currentThread().getName());
//					}
				}
			}
		});
		
		
	final Thread task2 = new Thread(new Runnable() {
		
		int count = 0;
		@Override
		public void run() {
			while(count++ <= 5){
				System.out.println("check the task1 is null");
				if (count == 5) {
					task1.interrupt();
					System.out.println(task1.interrupted());
				}
			}
		}
	});
	
	task1.start();
	task2.start();
	
	
	}

}
