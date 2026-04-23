-- Crear un programa que permita cargar 10 nombres en un ArrayList llamado jugadores y luego mostrarlos uno por uno.
-- Reemplazar al jugador en la posición 2 por un suplente usando set.
-- Eliminar a un jugador expulsado por nombre (remove("nombre")).
package elMejorCodigopt10;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<String> jugadores = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		int pos = 0;
		for( int i = 0; i < 10; i++) {
			System.out.println("Ingrese elnombre del jugador "+ i);
			String nombre = sc.nextLine(); 
			
			jugadores.add(nombre);
			pos = i;
			
		}
		jugadores.set(2, "DOU");
		jugadores.remove(3);
		
			System.out.println("Jugadores " + jugadores);

	}

}