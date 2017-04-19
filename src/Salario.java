import java.util.Calendar;

public interface Salario {
	int salario = 0;
	int pagaTotal = 0;
	void calcularSalarioTotal();
	int devolverPagoTotal();
	boolean correspondePagar(Calendar fecha);
	

}