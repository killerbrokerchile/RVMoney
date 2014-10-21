package cl.openti.herencia;

import javax.swing.JOptionPane;

public class Nieto extends Hijo{

	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		//super.dormir();
		JOptionPane.showMessageDialog(null, "Nieto " + nombre + " Dormiendo!!!");	
		
	}

	
	
	
	
}
