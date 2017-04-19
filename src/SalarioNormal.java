import java.util.Calendar;

public class SalarioNormal implements Salario{


	public void calcularSalarioTotal() {
		System.out.println("Empleado con salario fijo");
	}

	public int devolverPagoTotal() {
		return 0;
	}
	public boolean correspondePagar(Calendar fecha){
		Calendar today = Calendar.getInstance();
		if(Math.abs(today.get(Calendar.MONTH)-fecha.get(Calendar.MONTH))==1)
		    return true;
		else
		    return false; 
	}
}
