package proyecto_1;

public class problema_2 {
	public static void main(String[] args) {
		int aleatorio = 2+ (int)(Math.random()*99);
		int x=2;
		System.out.println(aleatorio);
		while (x<=aleatorio) {
			System.out.println(x);
			x=x+2;
		}
	}
}
