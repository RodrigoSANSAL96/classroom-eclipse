package proyecto_1;
import java.util.Scanner;
public class problemaspropuestos_5 {
	public static void main(String[] args) {
		int suma,x,valor;
		suma=0;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println("Ingrese valores. El programa se termina al poner 9999");
			valor = teclado.nextInt();
			if (valor!=9999) {
				suma= suma+valor;
			}else {
				System.out.println("Ha finalizado la carga");
			}
		}while(valor!=9999);
		System.out.println("La suma total es "+suma);
		if (suma <0) {
			System.out.println("La suma es menor a cero");
		}else {
			if(suma>0) {
				System.out.println("La suma es mayor a cero");
			}else {
				System.out.println("La suma es cero");
			}
		}
	}
}
