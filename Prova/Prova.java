package Prova;

public class Prova {
	private static int somadorImpares(int vet[]) {
		int soma = 0;
		for (int i = 0; i < vet.length; i++) {
			if (vet[i]%2 == 1) {
				soma += vet[i];
			}
		}
	return soma;	
	}
	public static void main(String[] args) {
		int[] vetor = new int[9];
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random()*100);
			System.out.println(vetor[i]);
		}
		
		System.out.println("A soma dos valores ímpares do vetor é: " + somadorImpares(vetor));
	}
}