package elmejorCodigoDelMundopt2;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
/*Calcular promedio de tres notas*/
Scanner sc = new Scanner(System.in);
System.out.println("Ingrese la nota ");
double nota1 = sc.nextDouble();
System.out.println("Ingrese la nota ");
double nota2 = sc.nextDouble();
System.out.println("Ingrese la nota ");
double nota3 = sc.nextDouble();
double promedio = (nota1 + nota2 + nota3) / 3;
System.out.println("El promedio es " + promedio);
/*Calcular el índice de masa corporal IMC= peso / (altura)2*/
System.out.println("Ingrese el peso");
double peso = sc.nextDouble();
System.out.println("Ingrese la altura");
double altura = sc.nextDouble();
double imc = peso / (altura * altura);
System.out.println("IMC = " + imc);
}
}
/*
System.out.println("Ingrese su nombre");
String nombre = sc.nextLine();
System.out.println("HOLAA " + nombre);
System.out.println("Ingrese el primer numero a calcular: ");
int numero1 = sc.nextInt();
System.out.println("Ingrese el siguinte: ");
int numero2 = sc.nextInt();
int resultado = numero1 + numero2;
System.out.println("El resultado es: " + resultado);*/ 
