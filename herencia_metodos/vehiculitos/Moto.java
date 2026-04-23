package elMejorCodigopt16;

public class Moto extends Vehiculo{
	

	int cilindrada;
	
	public Moto(String marcaV, String modeloV, int anoV, boolean prenderV, int cilindradaV) {
		super(marcaV, modeloV, prenderV, anoV);
		
		this.cilindrada = cilindradaV;
	}

	@Override
	public void encender() {
		super.encender();
		
			System.out.println("La moto " + this.modelo + " seencendió");
	}
	@Override
	public String toString() {
		return "\nMarca: " + this.marca + "\nModelo: " + this.modelo + "\nAño: " + this.ano + "\nCilindrada: "+ this.cilindrada ;
	}
	public static void main(String[] args) {
		Moto m = new Moto("Yamaha", "MT-03", 2001, true, 321);
		Moto m1 = new Moto("Honda", "CB500F", 2005, false, 456);
		Moto m2 = new Moto("Kawsaki", "Z900", 2013, true, 564);
	}
}
ECHO est� activado.
