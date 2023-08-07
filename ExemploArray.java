import java.util.Scanner;
public class ExemploArray {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		String[] nomes = new String[5];
		for (int i = 0; i < nomes.length; i++) {
			System.out.print("Digite o nome: " + i + ": ");
			nomes[i] = leitor.nextLine();
		}
		for (int i = 0; i < nomes.length; i++) {
			System.out.println("Nome " + i + ": " + nomes[i]);
		}


	}

}
