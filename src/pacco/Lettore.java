package pacco;

import java.io.*;

public class Lettore {
	private FileInputStream file;
	private DataInputStream inStream;
	
	public Lettore(String nome){
		
		try{
			
			file = new FileInputStream(nome);
			inStream = new DataInputStream(file);
			
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public synchronized void leggi() throws IOException {
		String mex = null;
		
		while ((inStream.available()) != 0){
			mex = inStream.readUTF();
			System.out.println(mex+" ");
		}
		
	}

}
