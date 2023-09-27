import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, soma = 0, qsoma = 0;
        double media;

        System.out.print("Quantos elementos vai ter o vetor? ");
        n = sc.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (vetor[i] % 2 == 0) {
                soma = soma + vetor[i];
                qsoma++;
            }
        }

        if (qsoma == 0) {
            System.out.println("Não tem nenhum número par !");
        } else {
            media = soma / qsoma;
            System.out.printf("A média dos números pares foi: %.1f\n", media);
        }

        sc.close();
    }

}
