package proyectoVehiculo;

public class Furgoneta extends Vehiculo {

	private double alto;
	private double tara;
	private static double carga=500;
	
	public static double getCarga() {
		return carga;
	}

	public static void setCarga(double carga) {
		Furgoneta.carga = carga;
	}

	public Furgoneta() {
		super();
		this.alto=0;
		this.tara=0;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	public double getTara() {
		return tara;
	}

	public void setTara(double tara) {
		this.tara = tara;
	}

	@Override
	public String toString() {
		return "Furgoneta [alto=" + alto + ", tara=" + tara + ", toString()=" + super.toString() + "]";
	}
		
	
}

