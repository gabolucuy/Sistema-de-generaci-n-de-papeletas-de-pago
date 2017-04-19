import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Empleado empleado1 = new Empleado("Juan","Pedro",new SalarioPorHora());
		empleado1.mostrarTipoSalario();
		if(empleado1.correspondePagar())
			System.out.println("Toca Pagar");
			else
				System.out.println("No toca Pagar");	
		}
	

}

