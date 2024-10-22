package sumagit;

import java.util.Scanner;

public class sumagit {

	public static void main(String[] args) {

		System.out.println("este programa suma dos numeros");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("dime el primer sumando");
		double numero1 = scanner.nextDouble();
		
		if (numero1 % 2 == 0) {
			System.out.println("El numero es par");
		}
		else {
			System.out.println("el numero es impar");
		}
	}

}
