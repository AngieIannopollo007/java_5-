package elMejorCodigopt17;
import java.time.LocalDate;
import java.util.ArrayList;
public class Producto {
	int id;
	String nombre;
	int precio;
	
	public Producto(int idP, String nombreP, int precioP) {
		this.id = idP;
		this.nombre = nombreP;
		this.precio = precioP;
	}
	
	public void calcularPrecioFinal() {
		System.out.println();
	}
	 @Override
	 public String toString() {
		 return "Id del producto = " + this.id + "\nNombre del producto = " + this.nombre + "\nPrecio del producto = " + this.precio; 
	 }

	public static ArrayList<Producto> preductitos = new ArrayList<Producto>();
	
	public static void main(String[] args) {
		
		LocalDate fechita = LocalDate.of(2025, 05, 28);
		LocalDate fechita1 = LocalDate.of(2025, 06, 9);
		LocalDate fechita2 = LocalDate.of(2025, 06, 1);
		LocalDate fechita3 = LocalDate.of(2025, 04, 5);
		Producto p = new ProductoNoPerecedero(001, "Fideos", 2000, fechita1);
		Producto p1 = new ProductoPerecedero(002, "Detergente", 3150, fechita);
		Producto p2 = new ProductoNoPerecedero(003, "Té", 2500, fechita2);
		Producto p3 = new ProductoPerecedero(004, "Yerba mate", 4000, fechita3);

		preductitos.add(p);
		preductitos.add(p1);
		preductitos.add(p2);
		preductitos.add(p3);
		
		for(Producto a : preductitos) {
			a.calcularPrecioFinal();
			System.out.println(a);
		}
	}
}

ECHO est� activado.
