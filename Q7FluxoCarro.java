/*O guichê de pedágio de uma rodovia possui um equipamento que
 * registra diariamente a quantidade de carros que passaram.
 * Faça um programa em Java para ler cada registro do mês de
 * setembro e informar qual o maior volume de carros que passou
 * e em qual dia do mês. Utilize o conceito de arrays.
 */

import java.util.Scanner;

public class Q7FluxoCarro {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int[] setembro = new int[5];
		int maiorVolume=0;
		int posicao=0;
		
		for (int i=0;i<setembro.length; i++) {
			System.out.print("Quantidade de carros no dia " +(i+1)+": ");
			setembro[i]=leitor.nextInt();
			
			if (setembro[i]>maiorVolume) {
				 maiorVolume=setembro[i];
				
				
			} 
		}
		
		 for(int i=0; i<setembro.length;i++) {
			 
			 if (setembro[i]==maiorVolume) {
			 System.out.println("");
			 System.out.println("Maior fluxo de carros: " +maiorVolume);
			 System.out.print("Dia "+(i+1)+" de setembro");
			 }
			
			 
			 
		 }

	}

}
