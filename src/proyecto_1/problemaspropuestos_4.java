package clase_2;
import java.util.Scanner;
public class problemaspropuestos_4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int i,cant,numeros,pares,impares;
		System.out.println("Ingrese la cantidad de numeros que va a ingresar");
		cant = teclado.nextInt();
		i=1;
		pares=0;
		impares=0;
		while (i<=cant) {
			System.out.println("Ingrese un numero");
			numeros= teclado.nextInt();
			if (numeros%2==0) {
				System.out.println("El numero "+numeros+" es par");
				pares=pares+1;
			}else {
				System.out.println("El numero "+numeros+" es impar");
				impares=impares+1;
			}
			i++;
		}
		System.out.println("Hay "+pares+" numeros pares y "+impares+" numeros impares");
	}
}
