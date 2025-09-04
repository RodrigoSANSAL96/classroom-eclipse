package proyecto_1;
import java.util.Scanner;
public class Clase1_EntradaDatosTeclado {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Ingrese el primer valor");
		float valor1=teclado.nextFloat();
		System.out.println("Ingrese el segundo valor");
		float valor2=teclado.nextFloat();
		
		float suma=valor1+valor2;
		System.out.println("La suma de los valores ingresados es "+suma);
	}
}
