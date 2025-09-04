package proyecto_1;

public class Clase1_Switch {
	public static void main(String[] args) {
		int valor1= 1 + (int)(Math.random()*5);
		System.out.println("El numero aleatorio es "+valor1);
		switch (valor1) {
		case 1:
			System.out.println("El numero aleatorio es uno");
			break;
		case 2:
			System.out.println("El numero aleatorio es dos");
			break;
		case 3:
			System.out.println("El numero aleatorio es tres");
			break;
		case 4:
			System.out.println("El numero aleatorio es cuatro");
			break;
		case 5:
			System.out.println("El numero aleatorio es cinco");
		}
	}
}
