import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println(" Quantos números você vai digitar ? ");
        n = sc.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println(" Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println(" Os números negativos digitados foram: ");

        for (int i = 0; i < n; i++) {
            if (vetor[i] < 0) {
                System.out.printf("%d\n", vetor[i]);
            }
        }
        sc.close();
    }
}