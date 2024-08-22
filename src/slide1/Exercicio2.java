package slide1;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira a distância do carro:");
		double distancia = scan.nextDouble();
		
		System.out.println("Insira o tempo para percorrer a distância:");
		double tempo = scan.nextDouble();
		
		double velocidade;
		
		velocidade = distancia/tempo;
		
		System.out.println("A velocidade média do carro é: " + velocidade + "km/h");
		
		scan.close();
	}
}
