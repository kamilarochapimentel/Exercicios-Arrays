/*Fa�a um programa em Java que leia um array de 500 posi��es de
 * n�meros reais e divida todos os seus elementos pelo maior valor
 * do array. Imprima os valores do array ap�s os c�lculos.
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Q5Divisao {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		//sem condi��o limita a 3 casas decimais 
		//e o inteiro sai sem virgula
		DecimalFormat deci = new DecimalFormat();
		
		double maiorValor=0;
		double[] lista = new double[5];
		
		for (int i=0; i<lista.length;i++) {
			System.out.print("Digite 5 n�meros ["+(i+1)+"]: ");
			lista[i]=leitor.nextDouble();
			
			if(lista[i]>maiorValor) {
				maiorValor=lista[i];
			}
		}
		
		System.out.println("");
		for(int i=0; i<lista.length; i++) {
			lista[i] = lista[i]/maiorValor;
			System.out.println("Valores atualizados da lista: "+deci.format(lista[i]));	
		}
		
		
	}	
}


