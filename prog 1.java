
public class Ejercicio1 {

    	System.out.print(" a continuacion se imprimiran todos los numeros del 1 al 100, aclarando los que son pares");
    	System.out.print(" \n ");
            
        for (int i = 1; i <= 100; i++) {
            System.out.print(i);
            if (i % 2 == 0) { // Verificar si el número es par
                System.out.print(" (par)");
            }
            if (i < 100) {
                System.out.print(", ");
            }
            System.out.print(" \n ");
        }
	
}
