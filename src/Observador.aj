import java.awt.event.ActionEvent;

import javax.swing.JButton;
public aspect Observador {
	JButton amarillo,azul,rojo;
	pointcut success(ActionEvent clr) : execution(* actionPerformed*(ActionEvent))&& args(clr);
    after(ActionEvent clr) : success(clr) {	
    	System.out.println("se observa que eligio color: "+clr.getActionCommand());
    }
}
