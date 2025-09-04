package proyecto_1;

public class Clase1_Problema1 {
	public static void main(String[] args) {
		int valor1=(int)(Math.random()*1000);
		System.out.println("El primer valor aleatorio es: "+valor1);
		if (valor1 < 10) {
			System.out.println("El valor aleatorio tiene 1 digito");
		} else {
			if (valor1>=100 && valor1 < 1000) {
				System.out.println("El valor aleatorio tiene 3 digitos");
			} else {
				if (valor1 >=10 && valor1 < 100) {
					System.out.println("El valor aleatorio tiene 2 digitos");
				} else {
					System.out.println("El valor aleatorio tiene 4 digitos");
				}
			}
		}
	}
}
