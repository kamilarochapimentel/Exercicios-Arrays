/*Faça um programa em Java que leia um array de 5 números
 * inteiros e mostre-os.
 */

import java.util.Scanner;

public class Q1Array5 {

	public static void main(String[] args) {
       Scanner leitor = new Scanner (System.in);
    
		int[] numeros = new int [5];
		
		for (int i=0; i<numeros.length;i++) {
			System.out.print("Digite o " +(i+1)+"º número: ");
			numeros[i]=leitor.nextInt();
			
			
		}
		    System.out.print("Lista: ");
		for (int i=0; i<numeros.length;i++) {
			System.out.print(numeros[i] + ", ");
		}
        
	}

}
