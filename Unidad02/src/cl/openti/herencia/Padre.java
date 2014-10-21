package cl.openti.herencia;

import javax.swing.JOptionPane;

public class Padre extends Abuelo{

	
	
	@Override
	 void dormir() {
		// TODO Auto-generated method stub
		//super.dormir();
		JOptionPane.showMessageDialog(null, "Padre " + nombre + " Dormiendo!!!");	
		
	}

	
	
	
}
