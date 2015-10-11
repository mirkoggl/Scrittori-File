package pacco;

import java.io.*;

public class Threaddino extends Thread{
	private DataOutputStream outStream;
	private int num = 0;
	private String mex = null;
	
	public Threaddino(DataOutputStream s, int x, String n){
		
		outStream = s;
		num = x;
		mex = n;
		
	}
	
	public void run(){
		
		for (int i=0; i<100; i++)
			scriviString();
			System.out.println("scritto..");
				
	}
	
	public synchronized void scriviInt(){
		
		try {
			
			outStream.writeInt(num);
			outStream.writeUTF(" ");

			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void scriviString(){
		
		try {
			
			outStream.writeUTF(mex);

			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
