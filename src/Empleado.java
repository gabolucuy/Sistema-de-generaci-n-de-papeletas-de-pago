import java.util.Calendar;

public class Empleado {
	private String nombre;
	private String apellido;
	private Salario tipo_De_salario;
	private String tipoEmpleado;
	private Calendar lastPaymentDay = Calendar.getInstance();

	
	


	public Empleado(String nombre, String apellido, Salario tipo_De_salario) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipo_De_salario = tipo_De_salario;
		lastPaymentDay.set(Calendar.YEAR, 2017);
		lastPaymentDay.set(Calendar.MONTH, Calendar.APRIL);
		lastPaymentDay.set(Calendar.DAY_OF_MONTH, 12);
		
	}
	
	public void setTipoDeSalario(Salario nuevoTipoDeSalario){
    this.tipo_De_salario = nuevoTipoDeSalario;
  }
	public void mostrarTipoSalario(){
		tipo_De_salario.calcularSalarioTotal();
	}
	public boolean correspondePagar(){
	    return tipo_De_salario.correspondePagar(lastPaymentDay);
	  }

    
}