package pacco;

import java.io.IOException;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scrittore s = new Scrittore("prova.txt",3);
		s.todo();
		
		Lettore l = new Lettore("prova.txt");
		try {
			l.leggi();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
