package proyectoEmpleados;

import java.util.ArrayList;
import java.util.Scanner;

import proyectoVehiculo.Vehiculo;


public class MainEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System .in);
		ArrayList <Empleado> a = new ArrayList();
		int menu=0;
		do {
			menu=menu(teclado,menu);
			switch(menu) {
			case 1:
				introducir(teclado, a);
				break;
			case 2:
				if(a.isEmpty()) {
					System.out.println("No hay empleados");
				}
				else {
					visualizar(a);
				}
				break;
			case 3:
				if(a.isEmpty()) {
					System.out.println("No hay empleados");
				}
				else {
					visualizarJefe(a);
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
				break;
			case 9:
				System.out.println("AGUR!");
				break;
			default: 
				System.out.println("opcion incorrecta");
				break;
			}
		}while(menu!=10);
	}



	public static int menu(Scanner teclado, int menu) {
		System.out.println("---- MENU ----");
		System.out.println("1. Introducir empleado o jefe ");
		System.out.println("2. Visualizar datos d etodos los empleados.");
		System.out.println("3. Visualizar todos los jefes");
		System.out.println("4. Visualizar jefes de departamentos concretos");
		System.out.println("5. Introducir nombre o al menos un grupo de caracteres del nombre y visualizar el DNI/s y los años que lleva/n en la empresa indicando si es/son o no jefe. .");
		System.out.println("6. Mostrar empleador con salario mayor al introducido.");
		System.out.println("7. Introducir un nº de años y mostrar les jefes que lleven en la empresa esos o más años ");
		System.out.println("8. Dar de baja a un empleade/jefe a partir de su DNI. ");
		System.out.println("9. Introducir una matrícula y borrar dicho vehículo. ");
		System.out.println("10. Salir ");
		menu = teclado.nextInt();
		return menu;
	}
	;
	public static void introducir(Scanner teclado, ArrayList  <Empleado> a) {
		String respuesta;
		String dni;
		String nombre;
		int mes_entrada;
		int año_entrada;
		String departamento;
		System.out.println("Quieres introducir un Jefe o un Empleado?");
		respuesta=teclado.next();
		if(respuesta.equalsIgnoreCase("jefe")) {
			System.out.println("Introduce DNI:");
			dni = teclado.next();
			System.out.println("Introduce el Nombre:");
			nombre = teclado.next();
			System.out.println("Introduce el mes de entrada:");
			mes_entrada=teclado.nextInt();
			System.out.println("Introduce el año de entrada:");
			año_entrada=teclado.nextInt();
			System.out.println("Introduce el departamento al que pertenece:");
			departamento=teclado.next();
			a.add(new Jefe(dni, nombre, mes_entrada, año_entrada, año_entrada, departamento));
		}
		if(respuesta.equalsIgnoreCase("empleado")) {
			System.out.println("Introduce DNI:");
			dni = teclado.next();
			System.out.println("Introduce el Nombre:");
			nombre = teclado.next();
			System.out.println("Introduce el mes de entrada:");
			mes_entrada=teclado.nextInt();
			System.out.println("Introduce el año de entrada:");
			año_entrada=teclado.nextInt();
			a.add(new Empleado(dni, nombre, mes_entrada, año_entrada, año_entrada));
		}
	}

	public static void visualizar( ArrayList  <Empleado> a) {
		for (int i = 0; i<a.size();i++) {
			System.out.println(a.get(i));
		}
	}
	public static void visualizarJefe( ArrayList  <Empleado> a) {
		for (int i = 0; i<a.size();i++) {
			
			System.out.println(a.get(i));
		}
	}
}


