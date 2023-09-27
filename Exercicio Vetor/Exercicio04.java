import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, qtdpares;

        System.out.println(" quantos números você vai digitar? ");
        n = sc.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println(" O números pares são: ");

        qtdpares = 0;
        for (int i = 0; i < n; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.printf("%d  ", vetor[i]);
                qtdpares++;
            }
        }

        System.out.printf("\n\n A quantidade total de números pares foi %d\n", qtdpares);

        sc.close();
    }

}
