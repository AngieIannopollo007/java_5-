--SUB CLASE PERRO
package elMejorCodigopt14;

public class Perro extends Animal{

	String raza;
	
	public Perro(String nombreP, String especieP, double vidaP, double fuerzaP, String razaP) {
		super(nombreP, especieP, vidaP, fuerzaP);
		this.raza = razaP;
	}
	
	void ladrar() {
		System.out.println("WOOF WOOF");
	}
	
	@Override
	
	 public String toString() {
		return "Nombre: " + this.nombre + "\nEspecie: " + this.especie + "\nVida: " + this.vida +"\nFuerza: " + this.fuerza + "\nRaza: " + this.raza;
		
	}

	public static void main(String[] args) {
		Perro lupo = new Perro("Lupo", "Mamífero", 14.0, 25, "Puddle");
		 System.out.println(lupo.toString());
	
	
	}

} 
