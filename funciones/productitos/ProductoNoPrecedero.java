package elMejorCodigopt17;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class ProductoNoPerecedero extends Producto{
	LocalDate fechavenc;
	
public ProductoNoPerecedero(int idP, String nombreP, int precioP, LocalDate fechavencP) {
		super(idP, nombreP, precioP);
		
		this.fechavenc = fechavencP;
	}
	
	@Override 
	public void calcularPrecioFinal() {
		super.calcularPrecioFinal();
		LocalDate hoy = LocalDate.of(2025, 06, 11);	
		long diaspdesc = ChronoUnit.DAYS.between(fechavenc, hoy);
		if(diaspdesc <= 10){
			System.out.println("No se le agrega el descuento, el precio sigue siendo " + this.precio);
		}else System.out.println("Es perecedero, te equivocaste");
	}
	
	@Override
	 public String toString() {
		 return "Id del producto = " + this.id + "\nNombre del producto = " + this.nombre + "\nPrecio del producto = " + this.precio + "\nFecha de vencimiento = " + this.fechavenc; 
	 }
	
	public static void main(String[] args) {
		

	}
}
ECHO est� activado.
