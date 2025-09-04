package proyecto_1;

public class Clase3 {
	public static void main(String[] args) {
		int valor1=(int)(Math.random()*10);
		int valor2=(int)(Math.random()*10);
		System.out.println("El primer valor aleatorio generado es: "+valor1);
		System.out.println("El segundo valor aleatorio generado es: "+valor2);
		if(valor1==valor2) {
			System.out.println("Los valores generados son iguales");
		} else {
				if(valor1>valor2) {
					System.out.println("El valor mas grande es: "+valor1);
				} else {
						System.out.println("El valor mas grande es: "+valor2);
					}
				}
			}
		}
