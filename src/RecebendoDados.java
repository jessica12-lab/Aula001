import java.util.Scanner;
public class RecebendoDados {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String nomeUsuario;
		
		System.out.println("Por favor escreva seu nome"); 
         nomeUsuario = leitor.next();
         System.out.println("Obrigada por utilizar o programa, " + nomeUsuario + ".");
         
         leitor.close();
         
	}

}
