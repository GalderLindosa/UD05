package proyectoVehiculo;

import java.util.Scanner;

import ejercicio4.Cuentas;

public class MainVehiculos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System .in);
		Vehiculo a[]= new Vehiculo[10];
		int menu=0;
		do {
			menu=menu(teclado);
			switch(menu) {
			case 1:
				Vehiculo.contador=introducir(teclado, a);
				break;
			case 2:
				break;
			case 3:
				if(Vehiculo.contador>0) {
				mayorQue(teclado, a);
				}
				else {
					System.out.println("No hay vehiculos");
				}
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				mostrar(a);
				break;
			case 9:
				break;
			case 10:
				System.out.println("Hasta la vista");
				break;

			}
		}while (menu!=10);
	}

	public static int menu(Scanner teclado) {
		int menu;
		System.out.println("---- MENU ----");
		System.out.println("1. Introducir un nuevo vehículo ");
		System.out.println("2. Listar los datos de los coches que sean descapotables.");
		System.out.println("3. Pedir una tara al usuario y listar las furgonetas con una tara menor a la introducida");
		System.out.println("4. Pedir una nueva carga y modificarla para todas las furgonetas");
		System.out.println("5. Mostrar los datos de la furgoneta más antigua y más nueva.");
		System.out.println("6. Mostrar la antigüedad media de los coches, de las furgonetas y de los vehículos.");
		System.out.println("7. Ordenar el listado de furgonetas por tara y mostrarlo ");
		System.out.println("8. Listar todos los vehículos ordenados por matrícula. ");
		System.out.println("9. Introducir una matrícula y borrar dicho vehículo. ");
		System.out.println("10. Salir ");
		menu = teclado.nextInt();
		return menu;
	}

	public static int introducir(Scanner teclado, Vehiculo a[]) {
		String respuesta="";
		String Matricula;
		String tipo;
		String descapotable;
		if (Vehiculo.contador>a.length) {
			System.out.println("Error. No puedes introducir más vehiculos ");
		}else {
			for (int i = Vehiculo.contador; i < a.length && !respuesta.equalsIgnoreCase("no"); i++) {
				System.out.println("Que clase de vehiculo quieres introducir? (Coche o Furgoneta)");
				tipo = teclado.next();
				if (!tipo.equalsIgnoreCase("coche")&&!tipo.equalsIgnoreCase("Furgoneta")) {
					System.out.println("No fabricamos eso");
				}

				if (tipo.equalsIgnoreCase("coche")&&!tipo.equalsIgnoreCase("Furgoneta")) {
					Vehiculo a1 = new Coche();
					a[i]=a1;
					System.out.println("Escribe la matricula");
					Matricula=teclado.next();
					if(buscarMatricula(teclado,Matricula,a)==-1) {
						a[i].setMatricula(Matricula);
						System.out.println("Escribe la marca");
						a[i].setMarca(teclado.next());
						System.out.println("Escribe el modelo");
						a[i].setModelo(teclado.next());
						System.out.println("Escribe la antiguedad");
						a[i].setAntiguedad(teclado.nextDouble());
						System.out.println("Escribe el precio");
						a[i].setPrecio(teclado.nextDouble());
						System.out.println("Es descaootable?");
						descapotable=teclado.next();
						if(descapotable.equalsIgnoreCase("Si")) {
							((Coche)a[i]).setDescapotable(true);
							Vehiculo.contador++;
						}
						System.out.println("Coche introducido correctamente");
						do {
							System.out.print("Quieres seguir introduciendo vehiculos? ");
							respuesta = teclado.next();

							if (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("sí") && !respuesta.equalsIgnoreCase("no")) {
								System.out.println("Las opciones válidas son Si/No");
							}
						} while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("sí") && !respuesta.equalsIgnoreCase("no"));
					
					}
				}
				if (!tipo.equalsIgnoreCase("coche")&&tipo.equalsIgnoreCase("Furgoneta")) {
					Vehiculo a1 = new Furgoneta();
					a[i]=a1;
					System.out.println("Escribe la matricula");
					Matricula=teclado.next();
					if(buscarMatricula(teclado,Matricula,a)==-1) {
						a[i].setMatricula(Matricula);
						System.out.println("Escribe la marca");
						a[i].setMarca(teclado.next());
						System.out.println("Escribe el modelo");
						a[i].setModelo(teclado.next());
						System.out.println("Escribe la antiguedad");
						a[i].setAntiguedad(teclado.nextDouble());
						System.out.println("Escribe el precio");
						a[i].setPrecio(teclado.nextDouble());
						System.out.println("Escribe la altura");
						((Furgoneta)a[i]).setAlto(teclado.nextDouble());
						System.out.println("Escribe la tara");
						((Furgoneta)a[i]).setTara(teclado.nextDouble());
						System.out.println("Furgoneta introducida correctamente");
					}else {
						System.out.println("Ya hay un vehiculo con ese nombre ");
					}
					do {
						System.out.print("Quieres seguir introduciendo vehiculos? ");
						respuesta = teclado.next();

						if (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("sí") && !respuesta.equalsIgnoreCase("no")) {
							System.out.println("Las opciones válidas son Si/No");
						}
					} while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("sí") && !respuesta.equalsIgnoreCase("no"));
				}
			}

		}
		return Vehiculo.contador;
	}

	public static int buscarMatricula(Scanner teclado,String Matricula, Vehiculo a[]) {
		for (int i=0; i<Vehiculo.contador;i++) {
			if(Matricula.equalsIgnoreCase(a[i].getMatricula())) {
				return i;
			}
		}
		return -1;
	}	

	public static void mayorQue(Scanner teclado, Vehiculo a[]) {
		double tara;
		boolean hay=false;
		System.out.println("Introduce la tara: ");
		tara=teclado.nextDouble();
		for (int i=0; i<Vehiculo.contador;i++) {
			if (tara>=((Furgoneta) a[i]).getTara()) {
				hay=true;
				System.out.println(a[i].toString());
			}

			if (!hay) {
				System.out.println("No hay ninguna cuenta que supere esa cantidad");
			}
		}
	}


	public static void mostrar( Vehiculo a[]) {
		for (int i=0;i<Vehiculo.contador;i++) {
			System.out.println(a[i].toString());
		}
	}
	
	public static void descapotable(Vehiculo a[]) {
		for (int i=0;i<Vehiculo.contador;i++) {
			if ((Coche a[i]).descapotable()) {
				System.out.println((Coche a[i].toString);
			}
		}
	}
	
}
