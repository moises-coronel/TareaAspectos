import java.util.Observable;
public aspect Observador {
	pointcut success() : execution(* actionPerformed*(..) );
    after() : success() {
    	System.out.println("ELIGIÓ COLOR");
    }
}
