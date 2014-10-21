package cl.openti.tarea02;

import javax.swing.JOptionPane;

public class DuenoZoo {

	static final String  COMMAND = " 10 [Para Salir]";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creo al Cuidador
		Cuidador cuidador = new Cuidador();
		
		
		Object seleccion = JOptionPane.showInputDialog(
				   null,
				   "Seleccione Orden",
				   "Selector de ordenes",
				   JOptionPane.QUESTION_MESSAGE,
				   null, new Object[] { "Hacer Dormir", "Dar Comida"}, 
				   "Hacer Dormir");
				  
			
		if (seleccion.equals("Hacer Dormir"))
		{
			/**
			 * Para el leon
			 */
			
			
			 Leon leon = new Leon();
			 
			 for(;leon.nombre == null || leon.nombre.trim().length() ==0 ;)
			 {
				 leon.nombre = JOptionPane.showInputDialog(    
						null,"Ingrese Nombre del " + leon.getClass().getName().split("\\.")[3] + COMMAND,
						null
						);
				 leon.salir();
			 }
			
			cuidador.HacerDormir(leon);
			
			/*
			 * Para la jirafa
			 */
			Jirafa jirafa = new Jirafa();
			
			for(;jirafa.nombre == null || jirafa.nombre.trim().length() ==0;)
			{
			      jirafa.nombre = JOptionPane.showInputDialog(
					null,"Ingrese Nombre del " + jirafa.getClass().getName().split("\\.")[3]+ COMMAND,
					null
					);
			      
			      jirafa.salir();
			}     
			cuidador.HacerDormir(jirafa);
			
			/*
			 * Para el hipopotamo
			 */
			
			Hipopotamo hipopotamo = new Hipopotamo();
			
			for(;hipopotamo.nombre == null || hipopotamo.nombre.trim().length() ==0;)
			{
			  hipopotamo.nombre = JOptionPane.showInputDialog(
					null,"Ingrese Nombre del  " + hipopotamo.getClass().getName().split("\\.")[3]+ COMMAND,
					null
					);
			  hipopotamo.salir();
			} 
			cuidador.HacerDormir(hipopotamo);
			
			seleccion = null;
		}
		if (seleccion.equals("Dar Comida"))
		{
			
			/*
			 * para el leon
			 */
			Leon leon = new Leon();
			

			leon.nombre = JOptionPane.showInputDialog(
					null,"Ingrese Nombre del Animal"+ COMMAND,
					JOptionPane.QUESTION_MESSAGE
					);
			leon.comida = JOptionPane.showInputDialog(
					null, "Ingrese Alimento",
					JOptionPane.WARNING_MESSAGE
					);
			
			cuidador.DarCOmida(leon);

			
			/*
			 * para la jirafa
			 */
			Jirafa jirafa = new Jirafa();
			
			jirafa.nombre = JOptionPane.showInputDialog(
					null,"Ingrese Nombre del Animal"+ COMMAND,
					JOptionPane.QUESTION_MESSAGE
					);
			jirafa.comida = JOptionPane.showInputDialog(
					null, "Ingrese Alimento"+ COMMAND,
					JOptionPane.WARNING_MESSAGE
					);
			
			cuidador.DarCOmida(jirafa);
			
			
			/*
			 * Para el hipopotamo
			 */
			Hipopotamo hipopotamo = new Hipopotamo();
			
			hipopotamo.nombre = JOptionPane.showInputDialog(
					null,"Ingrese Nombre del Animal"+ COMMAND,
					JOptionPane.QUESTION_MESSAGE
					);
			hipopotamo.comida = JOptionPane.showInputDialog(
					null, "Ingrese Alimento"+ COMMAND,
					JOptionPane.WARNING_MESSAGE
					);
			
			cuidador.DarCOmida(hipopotamo);
			
			seleccion = null;
		}
		
		
		if(seleccion == null ) 
			JOptionPane.showMessageDialog(null, "Gracias, Nos vemos hasta la pr—xima...");
		
	}

}
