package elMejorCodigopt13;

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
		System.out.println("Especie: " + this.especie + " Vida: " + this.vida + " Fuerza: " + this.fuerza);
	}
		
	void alimentarse() {
		this.vida = vida * 2;
		System.out.println("Su vida ahora es de: " + this.vida);
	}
	
	void cura( int cura) {
		this.vida = vida + cura;
		System.out.println("Su vida ahora es: " + this.vida);
	}
	
	void recibirAtaque( double ataque) {
		this.vida -= ataque;
		System.out.println("Su vida despues del ataque es: " + this.vida);
	}
	
	void atacar(Animal oponente) {
		System.out.println(this.nombre + " atacó a " + oponente.nombre);
		oponente.recibirAtaque(this.fuerza);
		oponente.mostrar();
	}
	
	void reproducirse(Animal papa) {
		if (this.especie == papa.especie){
			System.out.println("Se pueden reproducir, su especie es: " + this.especie);
			this.nombre = "hijo";
			Animal hijo = new Animal(this.nombre, this.vida / 2, this.especie, this.fuerza / 2);
			mostrar();
		}else {
			System.out.println("No se pueden reproducir");
		}
		
	}
	void estado(){
		System.out.println("Vida: "+ this.vida +"| Especie: " + this.especie +"| Fuerza: " + this.fuerza);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal gato = new Animal("nelson gato", "felino", 10, 20);
		Animal caballo = new Animal("Antonio caballo", "Mamífero", 20, 30);
		gato.mostrar();
		caballo.mostrar();
		gato.alimentarse();
		caballo.cura(30);
		gato.recibirAtaque(5);
		caballo.atacar(gato);
		gato.reproducirse(gato);
		gato.reproducirse(caballo);
	}

} 
