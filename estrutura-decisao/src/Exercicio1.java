import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
         //Faça um algaritmo que exiba quantas pessoas possuem mais de 18 anos.
		//O algoritmo deverá receber a quantidade de pessoas por teclado.
		
		Scanner entrada = new Scanner(System.in);
		int idade;
		int quantidade;
		int temDezoito = 0;
		int naoTemDezoito = 0;
		int controle =1;
		
		System.out.println("Quantas pessoas irão informar a idade? ");
		quantidade = entrada.nextInt();
		
		//Processamento de dados
		
		while (controle <= quantidade) {
			System.out.println("Informe a idade: ");
			idade = entrada.nextInt();
			
		if (idade == 18) {
			temDezoito++;
			controle++;
			} else {
				naoTemDezoito++;
				controle++;
			}
		}
		//Saída de Dados
		System.out.println("Quantas tem 18: "+ temDezoito);
		System.out.println("Quantas não possuem 18: "+ naoTemDezoito);
	}

}
