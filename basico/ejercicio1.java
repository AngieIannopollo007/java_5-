package mejorcodigo12;
import java.util.Scanner;
public class trabajo {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
//1 Comparar dos números: Solicitar dos números distintos y mostrar cual es el mayor,
//tener en cuenta el caso de que sean iguales.
System.out.println("Ingrese un número: ");
int num1 = sc.nextInt();
System.out.println("Ingrese un número: ");
int num2 = sc.nextInt();
if(num1 < num2) {
System.out.println("es más grande " + num2);
}if(num1 > num2) {
System.out.println("es más grande " + num1);
} if(num1 == num2) {
System.out.println("son iguales");
}
//2 Verificación de edad: Escribir un programa que determine si una persona puede votar
//(mayor de 16 años) si está obligado a votar (mayor de 18 años) o si no puede votar.
System.out.println("Ingrese su edad");
int edad = sc.nextInt();
if(edad < 16) {
System.out.println("No puede votar todavía");
}if(edad >= 16) {
System.out.println("Usted ya puede votar");
}if( edad >= 18) {
System.out.println("Usted tiene que votar obligatoriamente");
}
//3. Autenticación de usuario: Pedir un nombre de usuario y contraseña, y verificar si
//coinciden con un usuario y contraseña guardado.

String usuario1 = "profesor.1";
System.out.println("Ingrese usuario: ");
String usuario = sc.nextLine();
if(usuario1.equals(usuario)) {
System.out.println("Usuario correcto");
}else {
System.out.println("Usuario incorrecto");
}
String contrasena1 = "48464018";
System.out.println("Ingrese contraseña: ");
String contrasena = sc.nextLine();
if(contrasena1.equals(contrasena)) {

System.out.println("Contraseña correcto");
}else {
System.out.println("Contraseña incorrecta");
}
//4. Validación de número positivo: Comprobar si un número ingresado es positivo,
negativo o cero.
System.out.println("ingrese un numero");
int numero = sc.nextInt();
if(numero < 0) {
System.out.println("numero negativo");
}if(numero > 0) {
System.out.println("numero positivo");
}if(numero == 0) {
System.out.println("Es cero");
}
//5. Calculo del modulo: Pedir un número y determinar si es par o impar
System.out.println("Ingrese un numero");
int numero1 = sc.nextInt();
int resto = numero1 % 2;
if(resto == 0) {
System.out.println("Es numero par");
}else {
System.out.println("numero impar");
}
//6. Alumno Aprobado: Determinar si un alumno cumple con el 80% de
asistencia(faltas>15) y
//un promedio mayor a 6 para aprobar una materia (&&)
System.out.println("Ingrese faltas del alumno");
double faltas = sc.nextDouble();
System.out.println("Ingrese el promedio");
double prom = sc.nextDouble();
if(faltas >= 15 && prom >= 6) {
System.out.println("El alumno está aprobado");
}else {
System.out.println("El alumno esta desaprobado");
}
}
}