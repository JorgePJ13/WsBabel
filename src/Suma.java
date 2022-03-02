
public class Suma {

	public static void sumar(int numero1, int numero2) {
		int resultado = numero1 + numero2;
		System.out.println("La suma es: " +resultado);
	}
	
	public static void sumarAcum(int valor) {
		int suma = 5;
		suma+= valor;
		System.out.println("La suma acumulada es: " +suma);
	}
	
	public static void sumaDouble(double num1, double num2) {	
		double sumaDouble = num1 + num2;
		System.out.println("El resultado de la suma double es: " +sumaDouble);
	}
	
	/*
	 * public static int suma(int... numeros){	
	 * int valorAcumulado = 0;
	 * for (numero : numeros) {
	 *     valorAcumulado += numero;
	 * }
	 * return valorAcumulado;
	}*/
}
