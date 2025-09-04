package proyecto_1;
import java.util.Scanner;
public class Clase1_ProblemasPropuestos3 {
	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("Ingrese el precio del articulo");
		float precio=teclado.nextFloat();
		System.out.println("Ingrese la cantidad de los articulos que lleva el cliente");
		int cantidad=teclado.nextInt();
		float pago=precio*cantidad;
		System.out.println("A pagar: $"+pago);
	}
}
