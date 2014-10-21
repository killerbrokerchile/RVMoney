package cl.openti.jcf;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class JCFTaller {
	
	static int i = 0;
	
	// codigo ascii 65 A |  66 B 
	static int[] edades = {10,11,12,13,'p',15,15};
	int[][] vedades = {{10,11},{10,11},{10,11},{10,11}};
	Integer[] Iedades = {10,11,12,new Integer(13),14,15,15};
	
	
	char[] ascii = {'a','b','c',65};
	char[][] vascii = {{'b','c'},{10,11},{10,11},{10,11}};
	Character[][] Cascii = {{'b','c'},{10,11},{10,11},{10,11}};
	
	
	// IndexAboundException
	
	// Lista
	List lista = new ArrayList();
	Vector vector = new Vector();
	Hashtable hashtable = new Hashtable();
	Map mapas = new HashMap();
	Set order = new HashSet();
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JCFTaller instancia = new JCFTaller();
		
		instancia.cargarLista();
		
		instancia.display();
		
		
	}
	
	
	void cargarLista()
	{
		
		lista.add(new Empleado("Ricardo", new Date(),2500000));
		
		lista.add(new Empleado("Ricardo2", new Date(),3500000));
		
		lista.add(new Empleado("Ricardo3", new Date(),4500000));
		
		lista.add(new Empleado("Ricardo4", new Date(),5500000));
	
		lista.add(new Empleado("Ricardo5", new Date(),6500000));
		
		
	}
	
	
	void display()
	{
		
		// Iterator
		Iterator it = lista.iterator();
		
		while(it.hasNext())
		{
			   Empleado e = (Empleado)it.next();
			
			   System.out.printf("%s \t %s \t %d \n", e.nombre, e.date,e.sueldo);
			
		}
			
		
		
		
		
		
	}
	
	
	
	void arreglo(){
		
		
		try{
			
			for( int i=0; i <= 10 ; i++)
			{
			   	System.out.print("Edad: " + edades[i]);
				
				
			}
		
		}catch(IndexOutOfBoundsException ee )
		{
			// solucion 2
			// notificar el jededa 
		}
		catch(NullPointerException ee )
		{
			// solucion 1
			
		}
		catch(Exception e)
		{
			// solucion 3
			
			
		}
		
	}
	
	
	
	
	
	

	
	
	
	
	
	
}
class Empleado {
	
	
	String nombre;
	Date date;
	long sueldo=0;
	
	
	public Empleado(String nombre, Date date, long sueldo) {
		super();
		this.nombre = nombre;
		this.date = date;
		this.sueldo = sueldo;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}