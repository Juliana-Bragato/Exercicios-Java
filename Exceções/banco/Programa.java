import java.util.Locale;
import java.util.Scanner;

import modelo.entidades.Contas;
import modelo.DominioExcecoes.MainExcecoes;;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os dados da conta");
        System.out.print("Numero: ");
        int numeroConta = sc.nextInt();
        System.out.print("Titular: ");
        sc.nextLine();
        String cliente = sc.nextLine();
        System.out.print("Saldo inicial: ");
        double balanco = sc.nextDouble();
        System.out.print("Limite de saque: ");
        double limiteSaque = sc.nextDouble();

        Contas acc = new Contas(numeroConta, cliente, balanco, limiteSaque);

        System.out.println();
        System.out.print("Informe uma quantia para sacar: ");
        double saque = sc.nextDouble();

        try {
            acc.saque(saque);
            System.out.printf("Novo saldo: %.2f%n", acc.getBalanco());
        } catch (MainExcecoes e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }

}