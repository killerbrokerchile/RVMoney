package cl.openti.tarea02;

import javax.swing.JOptionPane;

public class Jirafa extends Animal{
	
	

	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "La Jirada " + nombre + " se fue a dormir");
	}
	
	@Override
	public void comer()
	{
		JOptionPane.showMessageDialog(null, "La comida que recibir‡ en la ma–ana " + nombre + " ser‡ " + comida);
	}
	
	
	

}
