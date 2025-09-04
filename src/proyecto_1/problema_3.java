package proyecto_1;
import java.util.Scanner;

public class problema_3 {
	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		int i,suma,valor;
		float promedio;
		suma = 0;
		i=0;
		while(i<5) {
			System.out.println("Ingrese un valor");
			valor = teclado.nextInt();
			suma = suma + valor;
			i++;
		}
		System.out.println("La suma total es: "+suma);
		System.out.println(i);
		promedio = suma/5;
		System.out.println("El promedio es: "+promedio);
	}
}
