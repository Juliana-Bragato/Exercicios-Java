import java.util.Scanner;

public class Matrizexer02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Digite o valor das Matrizes N e M :");
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] mat = new int[n][m];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();

            }
        }

        System.out.println();
        System.out.println(" Qual número digitado na matriz você deseja ver a informaçãao?");
        int x = sc.nextInt();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == x) {
                    System.out.println("Sua posição é " + i + ", " + j);
                    if (j > 0) {
                        System.out.println("O número a sua esqueda é " + mat[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("O número a cima de sua posição é " + mat[i - 1][j]);
                    }
                    if (j < mat[i].length - 1) {
                        System.out.println("O número a sua direita é " + mat[i][j + 1]);
                    }
                    if (i < mat.length - 1) {
                        System.out.println("número a baixo de sua posição é " + mat[i + 1][j]);
                    }
                }
            }
        }

        sc.close();

    }
}
