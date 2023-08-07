/*Uma loja trabalha com 50 modelos de sapato. Faça um programa em Java
 * que leia o preço dos 50 modelos e depois imprima o preço de cada
 * modelo no valor de à vista (5% de desconto) e no cartão (5% de acréscimo).
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
						
			System.out.print("Digite o valor do " +(i+1)+"º sapato R$");
			precos[i]=leitor.nextDouble();
		}
		
				
		for (int i = 0; i<precos.length;i++) {
			cartao[i]=precos[i]+ (precos[i]*0.05);
			avista[i]=precos[i]-(precos[i]*0.05);
			System.out.println(" ");
			System.out.print((i+1)+"º sapato - Avista: "+deci.format(avista[i])+ ". ");
			System.out.print("No cartão: "+deci.format(cartao[i]));
		
			
			
		}
		

	}

}
