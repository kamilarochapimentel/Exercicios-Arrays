/*Uma loja trabalha com 50 modelos de sapato. Fa�a um programa em Java
 * que leia o pre�o dos 50 modelos e depois imprima o pre�o de cada
 * modelo no valor de � vista (5% de desconto) e no cart�o (5% de acr�scimo).
 * Utilize o conceito de arrays.
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Q9AvistaCartao {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		DecimalFormat deci = new DecimalFormat("0.00");
		int n=5;
		
		double[] precos = new double [n];
		double[] avista = new double [n];
		double[] cartao = new double [n];
		
		for (int i=0; i<precos.length; i++) {
						
			System.out.print("Digite o valor do " +(i+1)+"� sapato R$");
			precos[i]=leitor.nextDouble();
		}
		
				
		for (int i = 0; i<precos.length;i++) {
			cartao[i]=precos[i]+ (precos[i]*0.05);
			avista[i]=precos[i]-(precos[i]*0.05);
			System.out.println(" ");
			System.out.print((i+1)+"� sapato - Avista: "+deci.format(avista[i])+ ". ");
			System.out.print("No cart�o: "+deci.format(cartao[i]));
		
			
			
		}
		

	}

}
