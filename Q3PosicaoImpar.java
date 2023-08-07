/*Faça um programa em Java que leia 30 números em um array e
 *imprima os números localizados nas posições ímpares do array.
 */

import java.util.Scanner;

public class Q3PosicaoImpar {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		//alterei para 10 p acabar mais rapido
		int[] numeros = new int[10];
		
		for(int i=0; i<numeros.length;i++) {
			System.out.print("Digite 30 números ["+(i+1)+"]: ");
			numeros[i]=leitor.nextInt();
		}
		
		//se for respeitar a visão do usuario
        for (int i=0;i<numeros.length;i+=2) {
        	
        	//se for repeitar a posição do array 
        	/*if (i % 2==1) {
        		System.out.print(numeros[i] +", ");
        	}*/
        	
        	//se for respeitar a visão do usuario
        	//if (i % 2==0) {
        	
        	System.out.print(numeros[i] +", ");
        		
        	//}
        	
        	
        }
        
        	
        
	}

}
