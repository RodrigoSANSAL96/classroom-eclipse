package proyecto_1;

public class problemaspropuestos_1 {
	public static void main(String[] args) {
		int aleatorio = (int)(Math.random()*1000);
		System.out.println("El numero aleatorio es "+aleatorio);
		if (aleatorio <10) {
			System.out.println("El numero tiene 1 digito");
		}
		else {
			if(aleatorio>= 10 && aleatorio <100){
				System.out.println("El numero tiene 2 digitos");
			} else {
				System.out.println("El numero tiene 3 digitos");
			}
				
			}
	}
}
