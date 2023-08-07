/*Faça um programa para ler o preço de um produto em cada um
 * dos meses do ano e depois imprimir a média do valor do
 * produto no ano. Utilize o conceito de arrays.
 */
import java.util.Scanner;

public class Q8ArraysMedia {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		double[] valorProduto = new double [12];
		double soma = 0;
		double media =0;
		
		System.out.println("PREÇOS DO PROTETOR SOLAR (2023)");
		System.out.println("");
		
		for (int i=0; i<valorProduto.length;i++) {
			
			System.out.print("Digite o valor do produto no "+(i+1)+"º mês do ano: ");
			valorProduto[i]=leitor.nextDouble();
			
			soma+=valorProduto[i];
			media=soma/valorProduto.length;
			
			}
			
		System.out.println("");
		System.out.println("Media do valor anual R$"+media);
		

	}

}
