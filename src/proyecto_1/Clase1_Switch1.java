package proyecto_1;

public class Clase1_Switch1 {
	public static void main(String[] args) {
		int valor1=1+(int)(Math.random()*10);
		System.out.println("El numero aleatorio es "+valor1);
		switch (valor1) {
		case 5:
			System.out.println("Gano un auto");
			break;
		case 7:
			System.out.println("Gano una heladera");
			break;
		case 9:
			System.out.println("Gano un televisor");
			break;
		default:
			System.out.println("No ha ganado nada");
		}
	}
}
