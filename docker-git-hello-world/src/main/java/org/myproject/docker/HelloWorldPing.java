package org.myproject.docker;

public class HelloWorldPing {
	
	public static void main(String args[]) throws Exception{
		for(int i = 0 ; i < 100; i++){
			System.out.println("Hello world test 2 Ping " + i );
			Thread.sleep(1000);
		}
	}
}
