import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
	
		Scanner pregunta=new Scanner(System.in);
		int op;
		
		Scanner operacion= new Scanner(System.in);
		int opcion;
		
		do
		{
			System.out.println("--| CALCULADORA |--");
			
			
			System.out.println("Que operacion desea realizar?");
			System.out.println("1- Suma \n 2- Resta \n 3- Multiplicacion \n 4- Division");
			opcion=operacion.nextInt();
			
			switch(opcion)
			{
			case 1:
				
				Scanner suma= new Scanner(System.in);
				int num1, num2;
				int resultado;
				
				System.out.println("Ingrese un numero para la suma: ");
				num1=suma.nextInt();
				System.out.println("Ingrese otro numero para la suma: ");
				num2=suma.nextInt();
				resultado=num1 + num2;
				
				System.out.println("La suma es "+ resultado);
				break;
				
			case 2:
				
				Scanner resta= new Scanner(System.in);
				
				int num3, num4;
				int resultado2;
				
				System.out.println("Ingrese un numero para la resta: ");
				num3=resta.nextInt();
				System.out.println("Ingrese otro numero para la resta: ");
				num4=resta.nextInt();
				resultado2=num3 - num4;
				
				System.out.println("La resta es "+ resultado2);
				break;
				
			case 3:
				
				Scanner multiplicacion= new Scanner(System.in);
				
				int num5, num6;
				int resultado3;
				
				System.out.println("Ingrese un numero para la multiplicacion: ");
				num5=multiplicacion.nextInt();
				System.out.println("Ingrese otro numero para la multiplicacion: ");
				num6=multiplicacion.nextInt();
				resultado3=num5 * num6;
				
				System.out.println("La multiplicacion es "+ resultado3);
				break;
				
			case 4:
				
				Scanner division=new Scanner(System.in);
				
				int num7, num8;
				int resultado4;
				
				System.out.println("Ingrese un dividendo: ");
				num7=division.nextInt();
				System.out.println("Ingrese un divisor: ");
				num8=division.nextInt();
				resultado4=num7 / num8;
				
				System.out.println("La cociente es "+ resultado4);
				break;
			}
			
			
			
			System.out.println("Desea seguir utilizando la calculadora? 1- SI | 0- NO");
			op=pregunta.nextInt();
			
		}
		while(op==1);
		
		operacion.close();
		
		
	}

}