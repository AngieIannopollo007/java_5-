package elMejorCodigo4;
import java.util.Scanner;
public class tp1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	// 1- Ingresar una letra y mostrar si corresponde a una opción: A. Atacar, B. Bloquear, C. Correr.
	System.out.println("Ingrese un opcion (A, B o C: ");
	String opcion = sc.nextLine();
	switch(opcion) {
	case "A": 
		System.out.println("A. ATACAR");
		break;
	case "B": 
		System.out.println("B. BLOQUEAR");
	break;
	case "C":
		System.out.println("C. CORRER");
	break;
	default: 

		System.out.println("No se vale xd");
	}
	//2 Hacer un Menú: 1. Sumar, 2. Restar, 3. Multiplicar – pedir dos números y aplicar operación.
    // //3 Agregar un bucle do-while para que el menu se repita, tmbien agrega la opcion 4 para salir del menu.
		
	//3
			System.out.println("ingrese un numero");
			int num1 = sc.nextInt();
			System.out.println("ingrese otro numero");
			int num2 = sc.nextInt();
			System.out.println("ingrese 1. Sumar, 2. Restar, 3. Multiplicar");
			int op = sc.nextInt();
		do {
			
			switch(op) {
			case 1: 
				int suma = num1 + num2;
				System.out.println("La suma es " + suma);
			break;
			case 2: 
				int resta = num1 + num2;
				System.out.println("El resto es " + resta);
			break;
			case 3:
				int mult = num1 * num2;
				System.out.println("La multiplicacion es " + mult);
			break;
			case 4:
				System.out.println("SALLIR");
				break;
			default:
				System.out.println("No es valido");
			}
			System.out.println("ingrese un numero");
			num1 = sc.nextInt();
			System.out.println("ingrese otro numero");
			 num2 = sc.nextInt();
			System.out.println("ingrese 1. Sumar, 2. Restar, 3. Multiplicar");
			 op = sc.nextInt();
		    }while(op != 4);
			
//3 Ingresar números hasta que el usuario ingrese un 0. Mostrar la suma total.

		System.out.println("Ingrese el numero");
		int num3 = sc.nextInt();
		int con = 0;
		do {
			 con = con + num3;
			System.out.println("Ingrese el numero");
			 num3 = sc.nextInt();
		} while(num3 != 0);
		
		System.out.println("La suma de todo es: " + con);
//4 Pedir contraseñas hasque que se escriba "latzina123"
        String contraseña = "latzina123";
        System.out.println("Ingrese contraseña");
        String contra = sc.nextLine();
        do{
        System.out.println("Contraseña incorrecta");
        System.out.println("Ingrese contraseña");
        String contra = sc.nextLine();
        }while(!contrasena.equals(contra));
	        
	        System.out.println("Contraseña correcta");
        
        
//5 Leer edades hasta que se ingrese una negativa. Mostrar cuantas personas se ingresaron
	         
	        System.out.println("Ingrese su edad: ");
	        int edad = sc.nextInt();
	        int cont = 0;
	        
	        do {
	        	
	        	cont = cont + 1;
	        	System.out.println("Ingrese su edad: ");
		        edad = sc.nextInt();
	        	 
	         }while(edad > 0);
	        
	        System.out.println("Se ingresaron " + cont + " edades");
	//6 Menu de opciones: jugar, ver estadisticas, configuracion, salir. Repetir hasta que elija salir
		   
		    System.out.println("Ingrese I : jugar,  II : ver estadisticas, III : configuracion, IV : salir.");
		    String opcion = sc.nextLine();
		    String opcion1 = "IV";
		    
		    do {
		    	switch (opcion){
		    	 case "I": 
		    		 System.out.println("JUEGA");
		    	 break;
		    	 case "II":
		    		 System.out.println("ESTADÍSTICAS");
		    	 break;
		    	 case "III":
		    		 System.out.println("CONFIGURACION");
		    	 break;
		    	 case"IV":
		    		 System.out.println("SALIR");
		    	 break;
		    	 default: 
		    		 System.out.println("te equivocate papito");
		    	 break;	 
		    	}
	    	System.out.println("Ingrese I : jugar,  II : ver estadisticas, III : configuracion, IV : salir.");
		    opcion = sc.nextLine();
		    }while(!opcion.equals(opcion1));
		    System.out.println("YA SALIO");*/
		    
	// 8 Solicitar una clave numerica. Reintentar hasta acertar
		    
		    System.out.println("Ingrese la clave");
		    String contra2 = sc.nextLine();
		    String contraseña1 = "1234";
		    
		    do {
		    	 System.out.println("incorrecto");
		         System.out.println("Ingrese la clave");
				 contra2 = sc.nextLine();
		    }while(!contraseña1.equals(contra2));
		    System.out.println("correcto");
	}
} 
