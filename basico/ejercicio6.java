package elMejorCodigopt7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    //Ingreso de usuario y contraseña
      //Solicitar nombre de usuario.
      //Solicitar contraseña.
    /*Validación contra un registro
      Comprobar si el usuario y contraseña coinciden con los
      registrados.
      Mensajes de validación
      Si el login es correcto, mostrar mensaje de bienvenid a.
      Si el login es incorrecto,
      mostrar mensaje de error.*/
    String usuario = "123user";
    String contraseña = "1234";
    int n = 5;
     
    
    System.out.println("Ingrese el usuario: ");
    String user = sc.nextLine();
    if(usuario.equals(user)) {
    	System.out.println("Bienvennido. Usuario permitido");
        System.out.println("Ingrese la contraseña: ");
        String contra = sc.nextLine();
        if(contraseña.equals(contra)) {
    	System.out.println("Es correcta la contraseña");
           }else {
    	        System.out.println("Es incorrecta la contraseña");
               }
        }else {
    	System.out.println("Usuario no registrado");
    }
    }
    

}
 
