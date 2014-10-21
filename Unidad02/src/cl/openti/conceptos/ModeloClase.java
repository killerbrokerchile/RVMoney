package cl.openti.conceptos;  // ubicacion

// Biblioteca
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

import cl.openti.herencia.Hijo;


// Alcance definicion familia 
public class ModeloClase  {

	
	  static String novariableS1 =  "Alejandro";
	  static String variableS2 =  new String("Alejandro");
	  static String variableS3;
	  static String variableS4 = null;
	  static String variableS5 = Integer.toString(10);
	  static String variableS6 = Long.toString(10);
	  static String variableS7 = Double.toString(10);
	  static String variableS8 = Float.toString(10);
	  static String variableS9 = Boolean.toString(true);
	  static String variableS10 = Character.toString('p');
	  static String variableS11 = Character.valueOf('s').toString();
	  
	  
	  static Integer variableI1 =  10;
	  static Integer variableI2 =  new Integer("10");
	  static Integer variableI3 =  (char)(10);
	  static Integer variableI4 =  (int)('p');
	  static Integer variableI5 =  Integer.parseInt("10"); // devuelve un int
	  static Integer variableI6 =  Integer.valueOf("10");  // devuelve un Integer
	  static Integer variableI7 =  Integer.parseInt(Character.valueOf('o').toString());
	  static Integer variableI8 =  Integer.valueOf(Character.valueOf('o').toString());
	  static Integer variableI9 =  (int)Long.lowestOneBit(1000000000);
	  static Integer variableI10 =  Integer.bitCount(63512753);
	  
	  
	  
	  
	  static Date variableD1 = new Date();
	  
	  
	  
	  
	  static int pagosI =  10 ;
	  
	  
	  
	
	  List<String> lista = new ArrayList<String>();
	
	  List<Integer> listai = new ArrayList<Integer>();
	
	  
	  
	  public static void main(String[] args)
	  {
		  
		  System.out.println( pagosI );
		
	  }
	  
	  
	  /**
	   * Descripci—n MŽtodo Externo
	   * @param param
	   * @return
	   */
	  public String metodoExterno(String param)
	  {
		  return param;
		  
	  }
	
	  /**
	   * Descripci—n MŽtodo Externo
	   * @param param
	   * @return
	   */
	  private String metodoInterno(String param)
	  {
		  return param;
		  
	  }
	
	
}
