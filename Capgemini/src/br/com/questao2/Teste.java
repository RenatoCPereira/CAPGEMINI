package br.com.questao2;

import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		int i, x, N;
		
		System.out.println("Ol�, eu sou seu algoritmo!");
		System.out.println("Quantos n�meros voc� vai digitar? ");
		N = sc.nextInt();
		
		int[] vet = new int[N];
		
		for (i = 0; i < N; i++) {
			System.out.println("Digite um n�mero: ");
			vet[i] = sc.nextInt();
		}
		System.out.println("Digite um valor para x: ");
		x = sc.nextInt();

	}

}
