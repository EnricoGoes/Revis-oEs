package slide2;

import java.util.Scanner;

public class Exercicio1Slide2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] numeros = new int[10];
		
		System.out.println("Digite 10 valores inteiros: ");
		
		for(int i = 0; i<10; i++) {
			System.out.println("Valor " + (i + 1) + ": ");
			numeros[i] = scan.nextInt();
		}
		
		System.out.println("Digite a pósição do número que deseja buscar(0 a 9): ");
		int posicao = scan.nextInt();
		
		try {
			int valorEncontrado = buscarValorPosicao(numeros, posicao);
			System.out.println("O valor na posicao " + posicao + " é: " + valorEncontrado);	
		} catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Posição fora do intervalo do array (0 a 9).");
        }
		
		scan.close();
		
	}	
		public static int buscarValorPosicao(int[] array, int posicao) {
	        if (posicao < 0 || posicao >= array.length) {
	            throw new ArrayIndexOutOfBoundsException();
	        }
	        return array[posicao];
	}
}
