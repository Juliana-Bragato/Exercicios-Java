package ExercicioFuncionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import ExercicioFuncionario.entities.FuncionarioTercerizado;
import ExercicioFuncionario.entities.Funcionarios;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionarios> list = new ArrayList<>();

        System.out.print("Entre com o números de Funcionários: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Dados do funcionário #" + i + ": ");
            System.out.print("Funcinários é tercerizado, S/N ?: ");
            char ch = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Horas Trabalhada: ");
            int horas = sc.nextInt();
            System.out.print("Valor por Horas: ");
            double valorPorHoras = sc.nextDouble();
            if (ch == 's') {
                System.out.print("Taxa adiconal: ");
                double despesAdicional = sc.nextDouble();
                list.add(new FuncionarioTercerizado(nome, horas, valorPorHoras, despesAdicional));
            } else {
                list.add(new Funcionarios(nome, horas, valorPorHoras));
            }
        }

        System.out.println();
        System.out.println("Pagamento: ");
        for (Funcionarios func : list) {
            System.out.println(func.getNome() + " - $ " + String.format("%.2f", func.pagamento()));
        }

        sc.close();
    }

}
