package proyecto_1;
import java.util.Scanner;
public class Clase1_ProblemasPropuestos2 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Ingrese la medida de un lado del cuadrado");
		float lado= teclado.nextFloat();
		float perimetro=lado*4;
		System.out.println("El perímetro del cuadrado es "+perimetro);
	}
}
