package cl.openti.tarea03;

import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

@SuppressWarnings("serial") //Sugerencia del IDE
public class MySwing extends JFrame implements ActionListener {

    
	// DEFINICIONES O DECLARACION   
	DefaultListModel modeloDelJList = new DefaultListModel();
	DefaultListModel modeloDelJList2 = new DefaultListModel();
	
	List<Usuario> lista = new ArrayList<Usuario>(); //se crea un arraylist llamado lista
	List<Usuario> lista2 = new ArrayList<Usuario>();
	JList l1 = new JList();
	JList l2 = new JList();
	
	// Componentes Swing
	
	JLabel jlblMensajes = new JLabel();
			
	//////////////////////////// FIN DEFINICION ATRIBUTOS PUBLICOS
	
	
	public MySwing (String s)
	{
		//Frame Principal
		this.setTitle(s);
		this.setAlwaysOnTop(true);
		this.setLocationRelativeTo(null); //arrancar al centro de la pantalla
		this.setLayout(null);
		this.setBounds(10, 10, 540, 540);
		
		
		//Panel interno del frame
		JPanel panel = new JPanel();
		panel.setLayout(null); 
		panel.setBounds(5, 5, 520, 520);
		panel.setBackground(Color.gray);
		
		//Boton Mostrar
		JButton bg = new JButton("Mostrar");
		bg.addActionListener(this);
		bg.setBounds(280, 450, 100, 30);
		
		//Boton Cerrar
		JButton bc = new JButton("Cerrar");
		bc.setBounds(400, 450, 100, 30);
		
		//label boton traspasar
		
		JLabel jlbltraspasar = new JLabel("Traspasar");
		jlbltraspasar.setBounds(195, 130, 500, 200);
		
		
		//Boton Traspasar
		JButton bt = new JButton(">>");
		bt.setBounds(200, 250, 60, 30);
		
		
		//Boton Traspasar
		JButton bt2 = new JButton("<<");
		bt2.setBounds(200, 320, 60, 30);
				
		
		
		//label Con mensaje de mostrar
		
		jlblMensajes.setBounds(30, 300, 500, 200);
		
		
		l1.setBounds(20, 200, 150, 150);
		l1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // para seleccionar solo un elemento de la lista
		l1.setModel(modeloDelJList);
		
		
		//Lista Usuario equipo b
		l2.setBounds(290, 200, 150, 150);
		l2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		l2.setModel(modeloDelJList2);
		
		//Agregando componentes a la ventana
		panel.add(bg);
		panel.add(bc);
		panel.add(l1);
		panel.add(l2);
		panel.add(jlblMensajes);
		panel.add(bt);
		panel.add(bt2);
		panel.add(jlbltraspasar);
		this.add(panel);
		this.setVisible(true);
		
		////////////////////////		////////////		////////////		////////////
		
		bc.addActionListener(this);// Cerrar Button
		bg.addActionListener(this);// Guardar Button
		bt.addActionListener(this);// Traspasar Button
		bt2.addActionListener(this);// Volver Button
		
	}
			/**
			 * Unico Servicio de Action Botones Todos
			 */
			@Override  
			public void actionPerformed(ActionEvent e) {
				
				if (e.getSource() instanceof JButton) {
			           if(((JButton)e.getSource()).getText().equals("Cerrar"))
			           {
			        	   clickBotonCerrar(e);
			           }else
			           if(((JButton)e.getSource()).getText().equals("Mostrar"))
			           {
			        	   clickBotonMostrar(e);
			           }else
			           if(((JButton)e.getSource()).getText().equals(">>"))
			           {
			        	   clickBotonTraspasar(e);
			           }else
				           if(((JButton)e.getSource()).getText().equals("<<"))
				           {
				        	   clickBotonDevolver(e);
				           }
			           
			    }else{
			    
			    	if (e.getSource() instanceof JLabel) 
			    	{
			    		// ...
			    	}
			    }
			}
			
			private void clickBotonCerrar(ActionEvent e) {
				
				int respuesta = JOptionPane.showConfirmDialog(null,"ÀSeguro que desea salir ?", "Salir", JOptionPane.YES_NO_OPTION);
	            if (respuesta == JOptionPane.YES_OPTION)
	            {
	                System.exit(0);
	            }
			}

			private void clickBotonTraspasar(ActionEvent e)
			{
				if (l1.getSelectedValue()==null) {
					JOptionPane.showMessageDialog(null, "No existen datos");
					jlblMensajes.setText("Debe tener datos en la lista principal");
				}else{
				String nombre;
				nombre = (String) l1.getSelectedValue();
				modeloDelJList2.addElement(nombre);
				l2.setModel(modeloDelJList2);
				modeloDelJList.removeElement(l1.getSelectedValue());
				jlblMensajes.setText("Datos Traspasados!");
				}
			}
			
			private void clickBotonDevolver(ActionEvent e)
			{
				if (l2.getSelectedValue()==null) {
					JOptionPane.showMessageDialog(null, "No existen datos");
					jlblMensajes.setText("Debe tener datos en la lista 2");
				}else{
					String nombre;
					nombre = (String) l2.getSelectedValue();
					modeloDelJList.addElement(nombre);
					l1.setModel(modeloDelJList);
					modeloDelJList2.removeElement(l2.getSelectedValue());
					jlblMensajes.setText("Datos Devueltos!");
				}
			}
			
			
			private void clickBotonMostrar(ActionEvent e)
			{
				
				if(lista.isEmpty())
				{
					l1.setModel(modeloDelJList);
					cargarLista();
					mostrarLista();
					jlblMensajes.setText("Datos Mostrados");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Ya estan LISTOS!!");
					jlblMensajes.setText("Est‡ Ingresando datos duplicados");
				}
				//JOptionPane.showMessageDialog(null, "OK");
			}

	
	/*
	 * metodo cargar Lista
	 */
	public void cargarLista()
	{
			lista.add(new Usuario("ricardo"));
			lista.add(new Usuario("marisol"));
			lista.add(new Usuario("carol"));
			lista.add(new Usuario("gerardo"));
			lista.add(new Usuario("alejandro"));
	}
	
	/*
	 * metodo mostrar la lista
	 */
	public void mostrarLista()
	{
		Iterator<Usuario> it = lista.iterator();
		
		while (it.hasNext()) {
			Usuario usuario =  it.next();
			modeloDelJList.addElement(usuario.nombre);
			//System.out.printf("%s \n", usuario.nombre);
		}
	}
	
	
	/*
	 * MAIN
	 */
	
	
	public static void main(String[] args) {
		
		MySwing miframe = new MySwing("Swing");
		
	}
	

}

/*
 * Clase USUARIO
 */

	class Usuario {
	
	
		String nombre;
		
	
			public Usuario(String nombre) {
				super();
				this.nombre = nombre;
		}
	
	
			public String getNombre() {
				return nombre;
		}
	
	
			public void setNombre(String nombre) {
				this.nombre = nombre;
		}
	
	

}






