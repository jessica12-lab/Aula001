import java.util.Scanner;

public class Calculadora1 {

	public static void main(String[] args) {
		 Scanner leitor = new Scanner(System.in);
		 double primeiroValor;
		 double segundoValor;
		 double soma, subtracao, divisao, multiplicacao;
		 System.out.println("por favor digite o primeiro valor:");
		 primeiroValor = leitor.nextDouble();
		 System.out.println("por favor digite o segundo valor:");
		 segundoValor = leitor.nextDouble();
		 soma = primeiroValor + segundoValor;
		 System.out.println("A soma entre os dois valores é " + soma);
		 
		 subtracao = primeiroValor - segundoValor;
		 System.out.println("A subtração entre os dois valores é " + subtracao);
		 divisao = primeiroValor / segundoValor;
		 System.out.println("A divisão entre os dois valores é " + divisao);
		 multiplicacao = primeiroValor * segundoValor;
		 System.out.println("A multiplicação entres os dois valores é " + multiplicacao);
		 
	}

}
