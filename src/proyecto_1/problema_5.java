package proyecto_1;
import java.util.Scanner;
public class problema_5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero,i,suma;
		float promedio;
		suma=0;
		i=0;
		do {
			System.out.println("Cargue valores enteros. El 0 detiene el programa");
			numero = teclado.nextInt();
			suma=suma+numero;
			if (numero!= 0) {
				i++;
			}
		} while (numero!=0);
		promedio=suma/i;
		System.out.println("El promedio es "+promedio);
	}
}
