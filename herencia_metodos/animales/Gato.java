--SUB CLASE GATO
package elMejorCodigopt14;

public class Gato extends Animal{
	int libertad;

	public Gato(String nombreG, String especieG, double vidaG, double fuerzaG, int libertadG) {
		super(nombreG, especieG, vidaG, fuerzaG);
		this.libertad = libertadG;
	}

	@Override
	public String toString() {
		return "Nombre: " + this.nombre + "\nEspecie: " + this.especie + "\nVida: " + this.vida +"\nFuerza: " + this.fuerza + "\nLibertad:" + this.libertad; 
	}
	void maullar() {
		System.out.println("MIAU MIAU");
		
	}
	
	void escapar() {
		if(this.libertad >= 8) {
			System.out.println("Se escapo!!");
		}
		return;	
	}
	public static void main(String[] args) {
		Gato pato = new Gato("Patricio", "Felino", 20.00, 23.00, 9);
		System.out.println(pato.toString() + "\n");
		pato.maullar();
		pato.escapar();
	}

} 
