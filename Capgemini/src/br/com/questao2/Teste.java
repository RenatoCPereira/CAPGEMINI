package br.com.questao2;

import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		int i, x, N;
		
		System.out.println("Olá, eu sou seu algoritmo!");
		System.out.println("Quantos números você vai digitar? ");
		N = sc.nextInt();
		
		int[] vet = new int[N];
		
		for (i = 0; i < N; i++) {
			System.out.println("Digite um número: ");
			vet[i] = sc.nextInt();
		}
		System.out.println("Digite um valor para x: ");
		x = sc.nextInt();

	}

}
