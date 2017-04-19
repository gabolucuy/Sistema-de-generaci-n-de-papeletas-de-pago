import java.awt.List;
import java.util.ArrayList;
import java.util.Calendar;

public class SalarioConComision  implements Salario{
	ArrayList<Venta> listaDeVentas = new ArrayList<Venta>();
	@Override
	public void calcularSalarioTotal() {
		System.out.println("Empleado con salario fijo mas comisiones");
		
	}

	@Override
	public int devolverPagoTotal() {
		// TODO Auto-generated method stub
		return 0;
	}
	public boolean correspondePagar(Calendar fecha){
	    Calendar today = Calendar.getInstance();
	    if(Math.abs(today.get(Calendar.DAY_OF_MONTH)-fecha.get(Calendar.DAY_OF_MONTH))==15)
	    	return true;
	    else
	        return false;
	    
	  }	
	
}
