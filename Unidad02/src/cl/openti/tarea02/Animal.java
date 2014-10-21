package cl.openti.tarea02;

import javax.swing.JOptionPane;

public class Animal {
	
	final String RESTRICCION = DuenoZoo.COMMAND.split("[")[0].trim();
	
	//Estados
	String nombre=null;
	String comida=null;
	
	
	public void dormir()
	{
        
		JOptionPane.showMessageDialog(null, "El/la " + nombre + " se fue a dormir");
		
	}
	
	public void comer()
	{
		JOptionPane.showMessageDialog(null, "La comida que recibir‡ en la ma–ana ser‡ " + comida);
	}
	
	public void salir()
	{
		if(nombre.equals(RESTRICCION))
		{
			
			JOptionPane.showMessageDialog(null,"Hasta la Vista Baby!!!");
			System.exit(0);
			
		}	
		
	}

}