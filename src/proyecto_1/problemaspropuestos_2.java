package clase_2;
import java.util.Scanner;
public class problemaspropuestos_2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de alturas que ingresará");
		int cantidad, i;
		cantidad = teclado.nextInt();
		float altura,suma,promedio;
		i=1;
		suma= 0;
		while (i<=cantidad) {
			System.out.println("Ingrese la altura");
			altura = teclado.nextFloat();
			suma = suma + altura;
			i++;
		}
		System.out.println("La suma total de las alturas es "+suma);
		promedio=suma/cantidad;
		System.out.println("El promedio de las alturas ingresadas es "+promedio);
	}
}
