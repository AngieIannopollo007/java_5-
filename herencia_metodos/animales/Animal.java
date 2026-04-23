--CLASE PRINCIPAL ANIMAL
package elMejorCodigopt14;

public class Animal {
	String nombre;
	String especie;
	double vida;
	double fuerza;
		
	public Animal(String nombreP, String especieP, double vidaP, double fuerzaP) {
			this.nombre = nombreP;
			this.especie = especieP;
			this.vida = vidaP;
			this.fuerza = fuerzaP;
		}
		
	void mostrar() {
	System.out.println("Nombre: " + this.nombre + "\nEspecie: " + this.especie + "\nVida: " + this.vida +"\nFuerza: " + this.fuerza);
}
	public static void main(String[] args) {
		
		
		
	}
}