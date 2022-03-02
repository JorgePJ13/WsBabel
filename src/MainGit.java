import java.util.Scanner;


public class MainGit {

	public static void main(String[] args) {
		System.out.println("Hola mundo Java con Git");
		Scanner sc = new Scanner(System.in);
		
		// Metodos Clase Suma
		Suma.sumar(5, 3);
		Suma.sumarAcum(10);
		Suma.sumaDouble(4.3, 10.4);
		
		// Metodos Clase Resta
		Resta.restar(9, 7);
		Resta.restaAcum(5);
		
		//Metodos Clase Mult
		Multiplicacion.mult(4, 5);
	}
}
