package elMejorCodigopt12;
import java.util.ArrayList;


public class Cartas {
	
	String nombre;
	double costo;
	double ataque;
	double defensa;
	
	public Cartas (String nombreP, double costoP, double ataqueP, double defensaP){
	
		this.nombre = nombreP;
		this.costo = costoP;
		this.ataque = ataqueP;
		this.defensa = defensaP;
	}
	
	void mostrar() {
		
			System.out.println("Nombre: " + this.nombre + " Costo: " + this.costo + " Ataque: " + this.ataque + " Defensa: " + this.defensa);	
	}
	
	void defensaDestruida() {
		if(defensa <= 0) {
			boolean destruida = true;
			System.out.println("Le queda defensa: " + destruida);
		}else {
			return;
		}
	}
	
	void recibirAtaque(int daño) {
		
		this.defensa -= daño;
		System.out.println("Defensa después del ataque: " + this.defensa);
	}
	
	void atacar(Cartas oponente) {
		
		(this.nombre + " atacó a " + oponente.nombre);
		oponente.recibirAtaque(this.ataque);
		oponente.mostrar();
	}
	
	public static void Main() {
		Cartas c1 = new Cartas("VICKY", 19000.0, 5.0, 10.0);
		Cartas c2 = new Cartas("LUNA", 16000.0, 6.0, 9.0);
		c1.mostrar();
		c2.mostrar();
		
		c1.atacar(c2);
		c2.mostrar();
		
		
	}

}
/*Clase carta, tiene nombre, costo, ataque y defensa. Tiene constructor metodo void para mostrar los estados de las cartas.
   Un metodo boolean si la defensa es destruida si la defensa es menor o igual a 0. 
   Un metodo atacar que sea void que reste 1 a la defensa caundo lo invocas. */
