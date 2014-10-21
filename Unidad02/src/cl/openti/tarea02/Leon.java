package cl.openti.tarea02;

import javax.swing.JOptionPane;

public class Leon extends Animal{
	
	@Override
	public void dormir() {
		// TODO Auto-generated method stub
			JOptionPane.showMessageDialog(null, "El Leon " + nombre + " se fue a dormir");
	}
	
	
	@Override
	public void comer()
	{
		
		JOptionPane.showMessageDialog(null, "La comida que recibira en la ma–ana " + nombre + " ser‡ " + comida);
	}
	
	
	

}
