package EscribirArchivo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Escoja una opcion: ");
			System.out.println("2) Para ingresar un nuevo movimiento de dinero. ");
			System.out.println("0) Para salir. \n\n");
			
			int opcion = sc.nextInt();
		
			if(opcion == 0) {
				sc.close();
				return;
			}
		
			if(opcion == 2) {
				String nombreArchivo = "movimientoDinero.txt";
			
				System.out.println("Ingrese la cantidad de dinero: ");
				double dinero = sc.nextDouble();
			
				System.out.println("ingrese una descripcion:");
				String descripcion = sc.next();
			
				String linea = descripcion + ", " + dinero + "\n";
			
				agregarLinea(nombreArchivo, linea);
			}
		}

	}
	
	public static void pruebaLlaves() {
		{
			int a = 10;
			System.out.println(a);
		}
		
		//System.out.println(a); // daproblemas no est'a en el ambito de la variable
	}
	
	public static void agregarLinea(String nombreArchivo, String contenido) {
		
		try {
			FileWriter fw = new FileWriter("escribeArchivo.txt", true);
			fw.write(contenido);
			fw.close(); //que sucede si hay un error?
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	public static void crearArchivo(String fileName) {
		File file = new File(fileName);
		System.out.println(file.getAbsolutePath());
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
