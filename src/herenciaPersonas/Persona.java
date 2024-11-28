package herenciaPersonas;

public class Persona {

	protected String dni;
	protected String Nombre;
	
	public Persona (){
		this.dni="";
		this.Nombre="";
	}
	
	public Persona (String d, String n) {
		this.dni=d;
		this.Nombre=n;
	}

	public String getdni() {
		return dni;
	}

	public void setdni(String dni) {
		dni = dni;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", Nombre=" + Nombre + "]";
	}
	
	public void visualizar() {
		System.out.println("El nombre es "+ this.Nombre);
		System.out.println("el DNI es: "+this.dni);
	}
	
}
