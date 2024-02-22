import java.util.*;

public class Ejercicio2 {
	public static void main(String[] args) {
		List<Integer> numerosAleatorios = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < 100; i++) {
			numerosAleatorios.add(random.nextInt(100) + 1);
		}

		System.out.println("N�meros aleatorios:");
		for (int numero : numerosAleatorios) {
			System.out.print(numero + " ");
		}
		System.out.println();

		Set<Integer> conjuntoSinRepetidos = new HashSet<>(numerosAleatorios);

		System.out.println("\nN�meros sin repetidos:");
		for (int numero : conjuntoSinRepetidos) {
			System.out.print(numero + " ");
		}
		System.out.println();

		Set<Integer> conjuntoOrdenadoSinRepetidos = new TreeSet<>(numerosAleatorios);

		System.out.println("\nN�meros ordenados y sin repetidos:");
		for (int numero : conjuntoOrdenadoSinRepetidos) {
			System.out.print(numero + " ");
		}
		System.out.println();
	}
}
