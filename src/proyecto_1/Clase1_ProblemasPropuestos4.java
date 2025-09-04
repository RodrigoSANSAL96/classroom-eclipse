package proyecto_1;
import java.util.Scanner;
public class Clase1_ProblemasPropuestos4 {
	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("Ingrese la primera nota del alumno");
		int nota1= teclado.nextInt();
		System.out.println("Ingrese la segunda nota del alumno");
		int nota2= teclado.nextInt();
		System.out.println("Ingrese la tercera nota del alumno");
		int nota3= teclado.nextInt();
		int suma=nota1+nota2+nota3;
		float promedio=suma/3;
		
		if (promedio>=7) {
			System.out.println("Aprobado");
		} else {
			System.out.println("Desaprobado");
		}
	}
}
