import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculetor cl = new Calculetor();

        System.out.println(" Digite seu nome sobrenome: ");
        cl.name = sc.nextLine();
        System.out.println(" Informe seu salário bruto: ");
        cl.grosSalary = sc.nextDouble();
        System.out.println(" Informe a Taxa :");
        cl.tax = sc.nextDouble();

        System.out.println("Empregado " + cl);

        System.out.print("Qual percentual para aumentar o salário? ");
        double percentage = sc.nextDouble();
        cl.finalSalary(percentage);
        System.out.println(" Dados atualizados: " + cl);

        sc.close();

    }
}
