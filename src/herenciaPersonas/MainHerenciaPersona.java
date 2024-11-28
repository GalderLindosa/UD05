package herenciaPersonas;

public class MainHerenciaPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new Persona("1234","Alex");
		p1.visualizar();
		Cliente c1 = new Cliente(19,"Igor","4321");
		c1.visualizar();
		Trabajador t1 = new Trabajador(20000,"Iker","1324");
		t1.visualizar();
		
	}
}
