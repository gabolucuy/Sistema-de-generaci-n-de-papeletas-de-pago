import java.util.Calendar;

public class SalarioPorHora implements Salario {
	
	int horasPorDia[];
	public void calcularSalarioTotal() {
		System.out.println("Empleado con salario por horas");
		
	}

	public int devolverPagoTotal() {
		// TODO Auto-generated method stub
		return 0;
	}
	public boolean correspondePagar(Calendar fecha){
	    Calendar today = Calendar.getInstance();
	    if(Math.abs(today.get(Calendar.DAY_OF_MONTH)-fecha.get(Calendar.DAY_OF_MONTH))==7)
	    	return true;
	    else
	        return false;
	  }	
}
