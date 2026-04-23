package elMejorCodigopt18;

public abstract class Carta {
	String nombre;
	int elixir;
	public Carta(String nombreC, int elixirC) {
		this.nombre = nombreC;
		this.elixir = elixirC;
	}
	
	@Override 
	public String toString() {
		return "Nombre: " + this.nombre + "\nElixir: " + this.elixir;
	}
	public abstract void invocar();


}ECHO est� activado.
