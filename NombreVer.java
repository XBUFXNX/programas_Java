

import java.util.Scanner;

public class NombreVer {

	public static void main(String[] args) {
		
		Scanner string = new Scanner(System.in);
		String nombre;
		
		System.out.println("porfavor ingrese su nombre: ");
		nombre = string.next();
		
		System.out.println("su nombre es: " + nombre);
		string.close();

	}

}
