package elMejorCodigopt7;
import java.util.Scanner;
public class Practica2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    /*Mostrar el menu principal las siguientes opciones
Consultar Saldo
Ingresar Dinero
Extraer Dinero 
Dolar
Salir*/
    double monto = 1500.3;
    double suma = 0.0;
    double resta = 0.0;
    double cotizacion = 1200.0;
    double cambio = 0.0;
    double mcd = 0.0;
    System.out.println("Ingrese una opcion: 1.Consultar sueldo, 2.Ingresar dinero, 3.Extraer Dinero, 4.Dolar,  5.Salir");
    int opc = sc.nextInt();
    do {
    switch(opc) {
        case 1:
        	System.out.println("El saldo actual de la cuenta es: " + monto);
        	break;
        case 2:
        	System.out.println("Ingrese el monto que quiera ingresar a la cuenta: ");
        	sc.nextLine();
        	double monto_ing = sc.nextDouble();
        	if(monto_ing > 0) {
        	suma = monto + monto_ing;
        	}
        	System.out.println("Su monto ahora es de: " + suma);
        	break;
        case 3:
        	System.out.println("Ingrese el monto que quiera extraer a la cuenta: ");
        	Double monto_ex = sc.nextDouble();
        	if(monto_ex <=  monto) {
        	resta = monto - monto_ex;
        	}
        	System.out.println("Su monto ahora es de: " + resta);
        	break;	
        case 4: 
        	System.out.println("Ingrese el monto que quiera cambiar: ");
        	Double peso_d = sc.nextDouble();
        	cambio = peso_d / cotizacion;
        	mcd = monto / cotizacion;
        	System.out.println("Lo que quiere cambiar son " + cambio + "dolares");
        	System.out.println("Su saldo actual es de " + monto + " y en dolares es " + mcd);
            break;
        default:
        	System.out.println("error ingrese devuelta");
        	break;
    }
    
    System.out.println("Ingrese una opcion: Consultar sueldo, Ingresar dinero, Extraer Dinero, Dolar,  Salir");
    opc = sc.nextInt();	
    
    }while(opc != 5);   
    System.out.println("Chau, muchas gracias por haber ingresado");
	}

} 
