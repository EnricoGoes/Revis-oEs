package slide1;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira o valor do produto: ");
		double valor = scan.nextDouble();
		
		double parcela;
		
		parcela = valor/5;
		
		System.out.println("Valor da parcela: " + parcela + " Sem JUROS!!");
		
		scan.close();
	}
}
