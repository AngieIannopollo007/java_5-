-- 1 Crear un ArrayList de tipo Integer que permita agregar números a una lista hasta
-- que ingrese el numero 0. Imprimir el tamaño de la lista size()

package elMejorCodigopt11;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> jugadores = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresar numeros");
		int num = sc.nextInt();
		
		do {
			jugadores.add(num);
			System.out.println("Ingresar numeros");
			 num = sc.nextInt();
		}while (num != 0);
		
			System.out.println("Tamaño del array " + jugadores.size());

	}

}


/*Clase carta, tiene nombre, costo, ataque y defensa. Tiene constructor metodo void para mostrar los estados de las cartas.
   Un metodo boolean si la defensa es destruida si la defensa es menor o igual a 0. 
   Un metodo atacar que sea void que reste 1 a la defensa caundo lo invocas. */ 
  
