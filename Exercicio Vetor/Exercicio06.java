import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print(" Quatos valores vai ter cada vetor ? ");
        n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite os valores do vetor A: ");
            a[i] = sc.nextInt();

        }
        for (int i = 0; i < n; i++) {
            System.out.println("Digite os valores do vetor B: ");
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            c[i] = a[i] + b[i];
        }

        System.out.println("Os vetores resultantes foi:");

        for (int i = 0; i < n; i++) {
            System.out.printf("%d\n", c[i]);
        }

        sc.close();

    }

}
