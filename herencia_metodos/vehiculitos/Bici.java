package elMejorCodigopt16;

public class Bici extends Vehiculo{
	
	public Bici(String marcaV, String modeloV, boolean prenderV, int anoV) {
		super(marcaV, modeloV, prenderV, anoV);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	 public void encender() {
		super.encender();
			System.out.println("La bici " + this.modelo + " se encendió");
	}

	@Override 
	public String toString() {
		return "\nMarca: " + this.marca + "\nModelo: " + this.modelo + "\nAño: " + this.ano;
	}
	public static void main(String[] args) {
		Bici b = new Bici("Pinarello", "c-3", false, 2003);
		Bici b1 = new Bici("Pinarello", "c-4", true, 2006);
		Bici b2 = new Bici("Pinarello", "c-5", false, 2010);
		Bici b3 = new Bici("Pinarello", "c-53", true, 2014);
	}
}
ECHO est� activado.
