/*Faça um programa em Java que gere um array de 20 posições,
 * onde cada elemento do array corresponde ao quadrado da sua
 * posição. Imprima o array resultante.
 */

public class Q4QuadradoPosicao {

	public static void main(String[] args) {
		
       int [] posicao = new int[20];
       
        
       for (int i =0; i<posicao.length;i++) {
    	  posicao[i]=i*i;
    	   System.out.println("posição ["+i+"]: " + posicao[i]);
         } 
       
          
       
       
	}

}
