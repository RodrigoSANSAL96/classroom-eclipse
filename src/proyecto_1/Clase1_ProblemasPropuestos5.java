package proyecto_1;
import java.util.Scanner;
public class Clase1_ProblemasPropuestos5 {
	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("Ingrese un valor entero");
		int entero=teclado.nextInt();
		if (entero==0) {
			System.out.println("Nulo");
		} else {
			if (entero < 0) {
				System.out.println("Negativo");
			} else {
				System.out.println("Positivo");
			}
		}
	}
}
