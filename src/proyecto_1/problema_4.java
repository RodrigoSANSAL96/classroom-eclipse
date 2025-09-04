package proyecto_1;
import java.util.Scanner;
public class problema_4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int ingresado;
		do {
			System.out.println("Ingrese un numero entero del 0 al 999. El 0 finaliza el programa");
			ingresado= teclado.nextInt();
			if(ingresado>=10 && ingresado<100) {
				System.out.println("El numero ingresado tiene 2 digitos");
			}else {
				if(ingresado>=100){
					System.out.println("El numero ingresado tiene 3 digitos");
				}else {
					System.out.println("El numero ingresado tiene 1 digito");
				}
			}
		} while(ingresado != 0);
	}
}
