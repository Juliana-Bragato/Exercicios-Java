import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Usuario us = new Usuario();

        System.out.print(" Digite o número da conta: ");
        us.setConta(sc.nextInt());
        System.out.print(" Digite o nome da conta: ");
        us.name = sc.next();
        System.out.print(" Deseja já fazer um deposito s / n ?: ");
        us.resposta = sc.next();

        if ((us.resposta.equals("s")) || (us.resposta.equals("S"))) {
            System.out.print(" Entre com seu valor de deposito inicial: ");
            us.depositar(sc.nextDouble());

        }

        System.out.println();
        System.out.println(" Dados da conta foram atualizados.");
        System.out.println(us);
        System.out.println();

        System.out.print(" Entre com o valor do deposito: ");
        us.depositar(sc.nextDouble());
        System.out.println(" Dados da conta foram atualizados.");
        System.out.println(us);
        System.out.println();

        System.out.print(" Entre com o valor do Saque: ");
        us.retirar(sc.nextDouble());
        System.out.println(" Dados da conta foram atualizados.");
        System.out.println(us);
        System.out.println();

        sc.close();

    }

}
