/*Fa�a um programa em Java que pe�a a idade e a altura de 5
 * pessoas, armazene cada informa��o no seu respectivo array.
 * Imprima a idade e a altura na ordem inversa da ordem lida.
 */

import java.util.Scanner;

public class Q6IdadeAltura {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int n=5;
		int [] idades = new int [n];
		double [] alturas = new double [n];
		
		for (int i=0; i<n;i++) {
			System.out.print("Digite a IDADE do "+(i+1)+"� cliente: ");
			idades[i] = leitor.nextInt();
			System.out.print("Digite a ALTURA do "+(i+1)+"� cliente: ");
			alturas[i] = leitor.nextDouble();
			System.out.println("");
		}
		
		
		for (int i=n-1;i>=0;i--) {
			System.out.print((i+1)+"� cliente: " +idades[i]+ " anos e ");
			System.out.println(alturas[i]+"m.");
			//System.out.println("");
		}

	}   

}
