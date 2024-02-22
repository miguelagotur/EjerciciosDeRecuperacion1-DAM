import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese el numero de secuencias: ");
		int numSecuencias = scanner.nextInt();
		scanner.nextLine();

		int totalNumeros = 0;
		for (int i = 0; i < numSecuencias; i++) {
			System.out.print("Ingrese la cantidad de numeros en la secuencia " + (i + 1) + ": ");
			int cantidadNumeros = scanner.nextInt();
			totalNumeros += cantidadNumeros;
			scanner.nextLine();
		}

		int[] numeros = new int[totalNumeros];

		int indice = 0;
		for (int i = 0; i < numSecuencias; i++) {
			System.out.println("Ingrese la secuencia " + (i + 1) + ":");
			System.out.print("Cantidad de numeros: ");
			int cantidadNumeros = scanner.nextInt();
			scanner.nextLine();

			System.out.print("Ingrese los numeros separados por espacios: ");
			String secuencia = scanner.nextLine();
			String[] numerosStr = secuencia.split(" ");
			for (int j = 0; j < cantidadNumeros; j++) {
				numeros[indice++] = Integer.parseInt(numerosStr[j]);
			}
		}
		System.out.println("Numeros almacenados:");
		for (int num : numeros) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
