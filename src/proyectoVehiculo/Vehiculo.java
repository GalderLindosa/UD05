package proyectoVehiculo;

public class Vehiculo {

	protected String matricula;
	protected String marca;
	protected String modelo;
	protected static final String COLOR="negro";
	protected double antiguedad;
	protected double precio;
	protected static int contador=0;



	public  Vehiculo() {
		this.matricula="";
		this.marca="";
		this.modelo="";
		this.antiguedad=0;
		this.precio=0;
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(double d) {
		this.antiguedad = d;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", antiguedad=" 
	+ antiguedad + ", precio=" + precio + "]";
	}

	
	
}