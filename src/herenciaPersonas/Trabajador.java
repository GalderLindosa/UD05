package herenciaPersonas;

public class Trabajador extends Persona{

	private double salario;

	public Trabajador() {
		super();
		this.salario=0;
	}
	public Trabajador(int s) {
		super();
		this.salario=s;
	}
	public Trabajador(int s, String d, String n) {
		super(n,d);
		this.salario=s;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "Trabajador [salario=" + salario  + super.toString() + "]";
	}
	public void visualizar() {
		super.visualizar();
		System.out.println("El salario es: " +this.salario);
	}
}
