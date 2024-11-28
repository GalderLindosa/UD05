package herenciaPersonas;

public class Cliente extends Persona {

	private int edad;
	
	public Cliente() {
		super();
		this.edad=0;
	}
	public Cliente(int e) {
		super();
		this.edad=e;
	}
	public Cliente(int e, String d, String n) {
		super(n,d);
		this.edad=e;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Cliente [edad=" + edad  + super.toString() + "]";
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("La edad es: " +this.edad);
	}
}
