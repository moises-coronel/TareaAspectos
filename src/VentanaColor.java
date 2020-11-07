import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observer;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaColor extends JFrame implements ActionListener {
	JPanel miPanelColor;
	JLabel titulo,mensaje;
	JButton amarillo,azul,rojo;
	int colorSeleccionado;
	ButtonGroup grupo;
	public VentanaColor()
	{
		
	  titulo= new JLabel();
	  titulo.setText("SELECCIONE COLOR");
	  titulo.setBounds(130, 10, 150, 25);
	  
	  mensaje= new JLabel();
	  mensaje.setText("NO HA SELECCIONADO UN COLOR");
	  mensaje.setBounds(10, 60, 250, 25);
		
	  miPanelColor=new JPanel();
	  miPanelColor.setBounds(5, 66, 380, 190);
	  
	  amarillo=new JButton();
	  amarillo.setText("Amarillo");
	  amarillo.setBounds(5, 40, 100, 25);
	  amarillo.addActionListener(this);
	  
	  azul=new JButton();
	  azul.setText("Azul");
	  azul.setBounds(130, 40, 100, 25);
	  azul.addActionListener(this);
	  
	  rojo=new JButton();
	  rojo.setText("Rojo");
	  rojo.setBounds(255, 40, 100, 25);
	  rojo.addActionListener(this);
	  
	  
	  grupo = new ButtonGroup();
	  grupo.add(amarillo);
	  grupo.add(azul);
	  grupo.add(rojo);
	
	  
	  add(amarillo);
	  add(azul);
	  add(rojo);
	  add(mensaje);
	  add(titulo);
	  add(miPanelColor);
	  
	  setSize(400,300);
	  setTitle("Ventana Color");
	  setLocation(280, 300);
	  setLayout(null);
	  setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==amarillo) 
			miPanelColor.setBackground(Color.yellow);
		if (e.getSource()==azul) 
			miPanelColor.setBackground(Color.blue);
					//mensaje.setText("azul");
		if (e.getSource()==rojo) 
			miPanelColor.setBackground(Color.red);
					//mensaje.setText("rojo");

	}
	public static void main(String[] args) {
		
		VentanaColor miVentana = new VentanaColor();
		
		
	}


}
