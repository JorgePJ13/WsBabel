
public class Resta {

	public static void restar(int numero1, int numero2) {
		int resultado = numero1 - numero2;
		System.out.println("El resultado de la resta es: " +resultado);
	}
	
	public static void restaAcum(int valor) {
		int resta = 10;
		resta -= valor;
		System.out.println("El resultado de la resta acumulada es: " +resta);
	}
}
