package pacco;

import java.io.*;

public class Scrittore {
	private int n;
	private FileOutputStream file;
	private DataOutputStream outStream;
	
	public Scrittore (String nome, int x){
		
		try {
			n = x;
			file = new FileOutputStream(nome);
			outStream =new DataOutputStream(file);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void chiudi(){
		
		try {
			
			outStream.close();
			file.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void todo() {
		
			Threaddino t = new Threaddino(outStream,n,"Ciao");
			Threaddino t1 = new Threaddino(outStream,n,"Hola");
			t.start();
			t1.start();
		
	}

}
