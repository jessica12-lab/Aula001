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
		 System.out.println("A soma entre os dois valores � " + soma);
		 
		 subtracao = primeiroValor - segundoValor;
		 System.out.println("A subtra��o entre os dois valores � " + subtracao);
		 divisao = primeiroValor / segundoValor;
		 System.out.println("A divis�o entre os dois valores � " + divisao);
		 multiplicacao = primeiroValor * segundoValor;
		 System.out.println("A multiplica��o entres os dois valores � " + multiplicacao);
		 
	}

}
