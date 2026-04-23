package elMejorCodigopt16;

public class Auto extends Vehiculo{
int cantp;
	
	public Auto(String marcaV, String modeloV, boolean prenderV, int anoV, int cantpV) {
		super(marcaV, modeloV, prenderV, anoV);
		
		this.cantp = cantpV;
	}
	
	@Override
	 public void encender() {
		super.encender();
		
		System.out.println("El auto " + this.modelo +  " se encendió");
	}
	@Override
	public String toString() {
	
		return "\nMarca: " + this.marca + "\nModelo: " + this.modelo + "\nAño: " + this.ano + "\nCantidad de puertas:" + this.cantp  ;
	}
	
	public static void main(String[] args) {
		Auto a = new Auto("Chevrolet", "Cruze", false, 2015, 4);
		Auto a1 = new Auto("Toyota", "corolla", true, 2016, 4); 
		Auto a2 = new Auto("Chrysler", "Neon", false, 2000, 4);
		
		System.out.println("Primer auto" + a.toString());
	}

}
