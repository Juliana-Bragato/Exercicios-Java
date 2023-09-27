import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, maior = 0;

        System.out.print(" Quantos números você vai digitar? ");
        n = sc.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (vetor[maior] < vetor[i]) {
                maior = i;
            }
        }

        System.out.printf("O maior número digitado foi %d", vetor[maior]);
        System.out.printf("Sua posição é %d", maior + 1);

        sc.close();
    }

}
