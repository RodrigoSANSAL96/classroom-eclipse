package proyecto_1;
import java.util.Scanner;
public class Clase_1_Problema2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el primer numero");
		int numero1 = sc.nextInt();
		System.out.println("Ingrese el segundo numero");
		int numero2 = sc.nextInt();
		System.out.println("Ingrese el tercer numero");
		int numero3 = sc.nextInt();
		System.out.println("Los numeros ingresados son: "+numero1+", "+numero2+ " y "+numero3);
		int suma= numero1+numero2+numero3;
		float promedio = suma/3;
		System.out.println("El promedio de los numeros ingresados son: "+promedio);
		sc.close();
		
		if (promedio >= 5) {
			System.out.println("El promedio es mayor o igual a 5");
		} else {
			System.out.println("El promedio es menor a 5");
		}
	}
}
