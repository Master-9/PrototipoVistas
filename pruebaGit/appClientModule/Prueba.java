

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

class Fibonacci{
	private int nElem;
	private ArrayList <Integer> elems;
	
	public Fibonacci(int nElem){
		this.nElem= nElem;
		init();
	}
	private void init(){
		System.out.println("son "+nElem+" elementos");
	}
}
		
public class Prueba {

	/**
	 * @param args the command line arguments
	 * @throws java.io.IOException
	 */
	public static void main(String[] args) throws IOException{
		// TODO code application logic here
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		byte z=Byte.parseByte(br2.readLine());  //no se debe usar esto: Byte.valueOf(br2.readLine()).byteValue(); 
		ArrayList <Fibonacci> casos=new ArrayList<>();

		for(byte i=0;i<z;i++){
	        casos.add(new Fibonacci(i + 3));  
		}
		        
		//casos.stream().forEach((a) -> {     //usando programacion funcional
			//a.solve();
		//});
		        
		System.out.println("Success");
	}
		    
		
		
		
		// TODO Auto-generated method stub

	/* (non-Java-doc)
	 * @see java.lang.Object#Object()
	 */
	public Prueba() {
		super();
	}

}