package slide1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio1Slide1 {
	public static void main(String[] args) {
		System.out.println("Olá IFBA!");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nInsira o ano de seu nascimento: ");
		int ano = scan.nextInt(); 
	
		System.out.println("\nInsira o ano atual: ");
		int anoAtual = scan.nextInt();
		
		int idade;
		idade = anoAtual - ano;
		
		double nota1 = 0, nota2 = 0, nota3 = 0;
		boolean valorValido = false;
	       
		while (!valorValido) {
	            try {
		System.out.println("\nSua idade é: " + idade);
		
		System.out.println("\nInsira sua nota: ");
		nota1 = scan.nextDouble();
		
		System.out.println("\nInsira sua nota: ");
		nota2 = scan.nextDouble();
		
		System.out.println("\nInsira sua nota: ");
		nota3 = scan.nextDouble();
		
		valorValido = true;
	    } 
	    catch (InputMismatchException e) {
	    System.out.println("Por favor, insira um número válido.");
	    scan.nextLine();
	    	}
		}
		
		double media;
		media = (nota1 + nota2 + nota3)/3.0;
		
		System.out.println("\nSuas notas são: " + "\n" + nota1 + "\n" + nota2 + "\n" + nota3);
		System.out.println("\nSua média é: " + media);
		
		if(media >= 7) {
			System.out.println("\nAluno aprovado!");
		} else if (media >= 5) {
			System.out.println("\nAluno em recuperação!");
		} else {
			System.out.println("\nAluno reprovado!");
		}
		scan.close();
	}
}
