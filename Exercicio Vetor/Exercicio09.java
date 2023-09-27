import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, maior, idadeMaior;

        System.out.println(" Quantas pessoas vai cadastrar: ");
        n = sc.nextInt();

        String[] nome = new String[n];
        int[] idade = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print(" nome: ");
            nome[i] = sc.next();
            System.out.print(" idade: ");
            idade[i] = sc.nextInt();
        }

        idadeMaior = 0;
        maior = 0;
        for (int i = 0; i < n; i++) {
            if (maior < idade[i]) {
                maior = idade[i];
                idadeMaior = i;
            }
        }

        System.out.printf("A pessoa mais velha é: %s\n", nome[idadeMaior]);

        sc.close();
    }

}
