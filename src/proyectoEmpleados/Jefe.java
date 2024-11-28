package proyectoEmpleados;

public class Jefe extends Empleado {

	private  static int PLUS=250;
	private String departamento;
	
	public Jefe(String d, String n, int m, int a, int au, String dp) {
		super(d, n, m, a, au);
		this.departamento="";
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Jefe [PLUS=" + PLUS + ", departamento=" + departamento + ", toString()=" + super.toString() + "]";
	}
	
}
