package cl.openti.herencia;

public class DuenaCasa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Nana nana = new Nana();
		
		//////////////////////////
		
		Hijo hijo = new Hijo();
		
		hijo.nombre = "Juan Pablo";
		
		nana.RolAcostar(hijo);
		
		//////////////////////////
		
		Padre padre = new Padre();
		
		padre.nombre = "Julio";
		
		nana.RolAcostar( padre );
		
		
		/////////////////////
		
		
		Abuelo abuelo = new Abuelo();

		abuelo.nombre = "Javier";

		nana.RolAcostar( abuelo );
		
		/////////////////////
		
		Nieto nieto = new Nieto();

		nieto.nombre = "felipe";

		nana.RolAcostar( nieto );
		

		
		
	}

}
