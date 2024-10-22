package sumagit;

import java.util.Scanner;

public class sumagit {

	public static void main(String[] args) {

		System.out.println("este programa suma dos numeros");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("dime el primer sumando");
		double numero1 = scanner.nextDouble();
		System.out.println("dime el segundo sumando");
		double numero2 = scanner.nextDouble();
		
		double resultado = numero1 + numero2;
		
		System.out.println("el resultado de la suma es: " + resultado);
	}

}
