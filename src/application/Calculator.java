package application;

import java.util.Scanner;

public class Calculator {

	public Calculator() {
		
	}

	public static void main(String[] args) {
		
	try (Scanner entrada = new Scanner(System.in)) {
		float AnuncioOriginal = 0;
		float AnuncioCompartilhado = 0;
		float Clicks = 0;
		float QtDePessoas = 0;
		double ValorInvestido = 0;
		float soma = 0;
		

		System.out.print("Digite o valor investido: ");
		ValorInvestido = entrada.nextInt();
		
		AnuncioOriginal = (float) (ValorInvestido * 30);
		Clicks = (float) (AnuncioOriginal * 12) / 100;
		//QtDePessoas = (float) AnuncioCompartilhado * 4;
		AnuncioCompartilhado = (float) ((Clicks * 3)/20) * 4;
		
		soma = AnuncioOriginal + AnuncioCompartilhado;
		
		System.out.println("Quantidade de compratilhamentos: " + AnuncioCompartilhado);
		
		System.out.print("Quantidade máxima de vizualizações: " + soma );
		
		
		//System.out.printf("Quantidade de Vizualizaçãoes é $d\n", soma);
		
	}
	
	
	}
	

}
