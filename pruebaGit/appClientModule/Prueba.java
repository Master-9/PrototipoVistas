

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

class Fibonacci{
	private int nElem;
	private Vector <Integer> elems;
	
	public Fibonacci(int nElem){
		this.nElem= nElem;
		elems= new Vector <>();
		elems.ensureCapacity(nElem);
		for(int i=0;i<nElem;i++){
			elems.add(new Integer(-1));
		}
		init();
	}
	private void init(){
		System.out.println("son "+nElem+" elementos");
		System.out.println("Resul: "+dinamica(nElem));
	}
	public int recur(int n){
		if(n==1){
			return 1;
		}
		if(n==2){
			return 1;
		}
		else{
			return recur(n-1) + recur(n-2);
		}
	}
	
	public int dinamica(int n){
		if(n==1){
			return 1;
		}
		if(n==2){
			return 1;
		}
		else{
			int menosUno= elems.get(n-2);
			int menosDos= elems.get(n-3);
			if (menosUno== -1){
				menosUno= dinamica(n-1);
			}
			if (menosDos== -1){
				menosDos= dinamica(n-2);
			}
			elems.set(n-1,menosUno + menosDos);
			return elems.get(n-1);
		}
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