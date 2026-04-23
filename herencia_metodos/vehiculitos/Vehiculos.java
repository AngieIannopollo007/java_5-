package elMejorCodigopt16;
import java.util.ArrayList;
public abstract class Vehiculo {

	String marca;
	String modelo;
	int ano;
	boolean prender;
	
	public Vehiculo(String marcaV, String modeloV, boolean prenderV, int anoV) {
		this.marca = marcaV;
		this.modelo = modeloV;
		this.ano = anoV;
		this.prender = prenderV;
	}
	
	public void encender() {
		System.out.println();
	}
	
	@Override
    public String toString() {
        return "Marca: " + this.marca + "\n" +
               "Modelo: " + this.modelo + "\n" +
               "Encendido: " + this.prender + "\n";
    }

	
	public static ArrayList<Vehiculo> medios = new ArrayList<Vehiculo>();
	
	public static void main(String[] args) {
		
		Vehiculo a1 = new Auto ("Chevrolet", "Cruze", false, 2015, 4);
		Vehiculo m1 = new Moto ("Honda", "CB500F", 2005, false, 456);
		Vehiculo b1 = new Bici("Pinarello", "c-3", false, 2003);
		
		medios.add(a1);
		medios.add(b1);
		medios.add(m1);
		for (Vehiculo  v : medios) {
            v.encender(); 
            System.out.println(v); 
        }
	}
}
ECHO est� activado.
