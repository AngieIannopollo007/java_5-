package elMejorCodigopt18;

public class BebeDragon extends Carta{

	public BebeDragon(String nombreC, int elixirC) {
		super(nombreC, elixirC);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void invocar() {
		System.out.println("Ataque aereo en área");
	}
	
	@Override
	public String toString(){
		return super.toString() 
				+ "\nVuela y lanza fuego";
	}
}
ECHO est� activado.
