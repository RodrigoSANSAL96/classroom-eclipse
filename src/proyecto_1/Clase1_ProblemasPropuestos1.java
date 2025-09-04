package proyecto_1;
import java.util.Scanner;
public class Clase1_ProblemasPropuestos1 {
	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("ingrese la cantidad de horas trabajadas");
		int horas= teclado.nextInt();
		System.out.println("Las horas trabajadas son "+horas);
		System.out.println("Ingrese el pago por hora");
		float pago=teclado.nextFloat();
		System.out.println("El pago por hora es "+pago);
		float sueldo=horas*pago;
		System.out.println("El sueldo del operario es de "+sueldo);
	}
}
