
package elMejorCodigopt18;
import java.util.ArrayList;

public class Main {

	public static ArrayList <Carta> cartitas = new ArrayList<Carta>();
	
	public static void main(String[] args) {
	 
		Carta c1 = new Caballero("Gustavo", 40);
		Carta c2 = new BebeDragon("Ronaldo", 66);
		Carta c3 = new Arquera("Merlusio", 77);
		
		cartitas.add(c1);
		cartitas.add(c2);
		cartitas.add(c3);
		
		for(Carta c : cartitas) {
			c.invocar();
			System.out.println(c);
		}
	}

}
ECHO est� activado.
