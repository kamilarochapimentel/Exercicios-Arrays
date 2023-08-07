/*Faça um programa em Java que leia um array de 10 números reais
 * e mostre-os na ordem inversa.
 */

import java.util.Scanner;

public class Q2NumReais {

	public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        double[] numerosReais = new double [10];
        
        for (int i=0;i<numerosReais.length;i++) {
        	System.out.print("Digite 10 números ["+(i+1)+"º]: ");
        	numerosReais[i]=leitor.nextDouble();
        }
		
        System.out.print("Lista: ");
        for (int i=numerosReais.length-1;i>=0;i--) {
        	System.out.print(numerosReais[i]+", ");
        	
        }
	}

}
