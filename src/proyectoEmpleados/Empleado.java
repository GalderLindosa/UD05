package proyectoEmpleados;

public class Empleado {

	protected static final String EMPRESA="Electrica S. A.";
	protected String dni;
	protected String nombre;
	protected int mes_entrada;
	protected int año_entrada;
	protected double aumento;
	protected static double sueldo=1000;
	protected static int contador=0;
	
	public Empleado(String d, String n, int m, int a, double au) {
		this.dni=d;
		this.nombre=n;
		this.mes_entrada=m;
		this.año_entrada=a;
		this.aumento=au;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getmes_entrada() {
		return mes_entrada;
	}

	public void setmes_entrada(int mes_entrada) {
		this.mes_entrada = mes_entrada;
	}

	public int getaño_entrada() {
		return año_entrada;
	}

	public void setaño_entrada(int año_entrada) {
		this.año_entrada = año_entrada;
	}

	public double getAumento() {
		return aumento;
	}

	public void setAumento(double aumento) {
		this.aumento = aumento;
	}

	public static double getSueldo() {
		return sueldo;
	}

	public static void setSueldo(double sueldo) {
		Empleado.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", nombre=" + nombre + ", mes_entrada=" + mes_entrada + ", año_entrada=" + año_entrada
				+ ", aumento=" + aumento + "]";
	}
	public double sueldoFinal(int fechaActual) {
		double sueldoFinal=(sueldo+(sueldo*this.aumento));
		if(fechaActual-this.año_entrada>=6) {
			sueldoFinal=sueldoFinal+100;
		}
		return sueldoFinal;
	}


}
