package proyecto_1;

public class Clase1_Problema3 {
	public static void main(String[] args) {
		int valor1=(int)(Math.random()*10);
		int valor2=(int)(Math.random()*10);
		int valor3=(int)(Math.random()*10);
		System.out.println("Los valores aleatorios son: "+valor1+", "+valor2+ " y "+valor3);
		if (valor1 < valor2 && valor1 < valor3) {
			System.out.println("El menor valor es: "+valor1);
		} else {
			if (valor2 < valor3 && valor2 < valor1) {
				System.out.println("El menor valor es: "+valor2);
			} else {
				System.out.println("El menor valor es: "+valor3);
			}
		}
	}
}
