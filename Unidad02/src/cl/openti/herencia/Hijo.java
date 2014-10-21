package cl.openti.herencia;

import javax.swing.JOptionPane;

public class Hijo extends Padre{

	@Override
	 void dormir() {
		// TODO Auto-generated method stub
		//super.dormir();
		JOptionPane.showMessageDialog(null, "Hijo " + nombre + "Dormiendo!!!");	
		
	}

	
	
	
	
}
