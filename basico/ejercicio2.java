package elMejorCodigo;
import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//Pasar de int a DOUBLE.
    int i = 7;
	double o = i;
	System.out.println("i =" + i);
	System.out.println("o =" + o);
	//Pasar de Double a INT.
	double myD = 8;
	int myI = (int) myD;
	System.out.println("MyD =" + myD);
	System.out.println("MyI = "+ myI);
	
	float maxPuntuacion = 500;
	int usuarioPuntuacion = 423;
    float porcentaje = (float) usuarioPuntuacion / maxPuntuacion * 100.0f;
    System.out.println("El porcentaje del usuario es: " + porcentaje + " %");
    
    int resultado = 10 % 3;
    System.out.println(resultado);
	}

}
 
