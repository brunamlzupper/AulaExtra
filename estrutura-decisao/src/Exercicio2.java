import java.util.Random;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// Definir Variáveis
		Scanner entrada = new Scanner(System.in);
		int valorA;
		int valorB;

		System.out.println("Informe o valor de A:");
		valorA = entrada.nextInt();

		System.out.println("Informe o valor de B:");
		valorB = entrada.nextInt();
		
		System.out.println(igualAlgum(valorA, valorB));
	}

	public static boolean igualAlgum(int valorA, int valorB) {

		Random aleatorio = new Random();

		int valorC = aleatorio.nextInt(10);

		if (valorA == valorC || valorB == valorC) {
			return true;
		} else {
			return false;
		}

	}

}
