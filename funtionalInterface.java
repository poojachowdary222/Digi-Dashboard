package com.example.demo;

public class funtionalInterface {
public static void main (String args[]) {
	
	new Thread (new Runnable() {
		@Override public void run()
		{
			System.out.println("new thread created");
		}
	}).start();
}
}
