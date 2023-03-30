package Paquete1;

import java.util.Scanner;

public class MenuCalculadora {
	public static void main(String[] args) {
		int i;

		do {

			Scanner sc = new Scanner(System.in);
			double numero1, numero2, resultado;

			resultado = 0;

			System.out.println("Introduce el primer numero");
			numero1 = sc.nextDouble();

			System.out.println("Introduce el segundo numero");
			numero2 = sc.nextDouble();

			System.out.println("");
			System.out.println("Selecciona una opcion ");
			System.out.println("1.-Suma");
			System.out.println("2.-Resta");
			System.out.println("3.-Multiplicacion");
			System.out.println("4.-Division");
			System.out.println("5.-Salir");
			System.out.println("");

			i = sc.nextInt();

			switch (i) {
				case 1:
					resultado = Calculadora.Sumar(numero1, numero2);
					System.out.println("El resultado de la suma es " + resultado);
					break;
				case 2:
					resultado = Calculadora.Restar(numero1, numero2);
					System.out.println("El resultado de la resta es " + resultado);
					break;
				case 3:
					resultado = Calculadora.Multiplicar(numero1, numero2);
					System.out.println("El resultado de la multiplicación es " + resultado);
					break;
				case 4:
					resultado = Calculadora.Dividir(numero1, numero2);
					System.out.println("El resultado de la división es " + resultado);
					break;
				case 5:
					break;
			}

			System.out.println("Marque 0 para volver");
			System.out.println("Marque 5 para salir");
			System.out.println("");

			i = sc.nextInt();
		} while (i != 5);
	}
}
