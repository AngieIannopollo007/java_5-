package elMejorCodigo3;
import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//1 Motrar todos los numeros del 1 al N (ingresado por usuario)
	/*System.out.println("Ingrese un numero: ");
	int n = sc.nextInt();
	int i ;
	for( i = 1; i <= n; i++) {
		System.out.println("Numero: " + i);
	}
	
	// 2 Mostrar los numeros del 100 al 1 de forma descendente
	int n1 = 100;
	for(int i = 1; i < n1; n1 = n1 - i) {
	System.out.println(n1);
	}*/
	//3 Mostrar los numeros impares del 1 al N
	System.out.println("Ingrese un numero: ");
	int n2 = sc.nextInt();
	for(int i = 1; i < n2; i++) {
		int resto = n2 % 2;
		
	}if(resto == 1) {
			System.out.println("Es impar");
		}else {
			System.out.println("Es par");
		}

	}

} 
