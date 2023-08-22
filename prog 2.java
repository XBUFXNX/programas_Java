
	public class Primo{
	
		public static void main(String[] args) {
			for (int i = 50; i <= 100; i++) {
            
				if (esPrimo(i)) {
                System.out.println(i + " es primo");
            } 	
				else {
                System.out.print(i + " no es primo. Sus divisores son: ");
                listarDivisores(i);
                System.out.println();
            }
        }
    }
    

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void listarDivisores(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}