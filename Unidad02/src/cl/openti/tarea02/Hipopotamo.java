package cl.openti.tarea02;

import javax.swing.JOptionPane;

public class Hipopotamo extends Animal{
	
	@Override
	public void dormir() {

		JOptionPane.showMessageDialog(null, "El Hipopotamo " + nombre + " se fue a dormir");
	}
	
	@Override
	public void comer()
	{
		
		JOptionPane.showMessageDialog(null, "La comida que recibir‡ en la ma–ana " + nombre + " ser‡ " + comida);
	}
	
	

}
