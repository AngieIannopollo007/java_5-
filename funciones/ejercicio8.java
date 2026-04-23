package metodos;
import java.util.Scanner;

public class Main {
		 static void saludar() {
			System.out.println("Hola mundo");
		}
		 static void imprimirNombre(String nombre) {
			 System.out.println("Binvenida/o " + nombre);
		 }
		 static int multiplicar(int a, int b) {
			 
			 return (a * b);
			 
		 }
		 static int cuadrado(int ladoa, int ladob) {
			 
			 return (ladoa * ladob);
		 }
		 static double cuadrado(double ladoa, double ladob) {
			 
			 return (ladoa * ladob);
		 }

	public static void main(String[] args) {
		 
	Scanner sc = new Scanner(System.in);	
		
		saludar();
		imprimirNombre("Florencia Briasco");
		imprimirNombre("Santiago Trini");
		int resultado = multiplicar(5, 9);
		System.out.println("Resultados es : " + resultado);
		System.out.println("Ingreseel primer lado del cuadrado");
		int lados = sc.nextInt();
		System.out.println("Ingreseel segundo lado del cuadrado");
		int lado = sc.nextInt();
		int res = cuadrado(lados, lado);
		System.out.println("El area es : " + res);
		System.out.println("Ingrese el primer lado del rectángulo");
		double ladoa = sc.nextDouble();

		System.out.println("Ingrese el segundo lado del rectángulo");
		double ladob = sc.nextDouble();
		
		double area = cuadrado(ladoa, ladob);
		System.out.println("El area del rectángulo es: " + area);
	}

} 
