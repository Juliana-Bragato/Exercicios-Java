import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Contribuinte;
import Entidades.Juridica;
import Entidades.Fisica;

public class Programa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Contribuinte> list = new ArrayList<>();

        System.out.print("Insira o número de contribuintes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Dados do #" + i + " contribuinte: ");
            System.out.print("Pessoa é Fisíca ou Juridica (f/j)? : ");
            char tipo = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Rendimento Anual: ");
            double rendimentoAnual = sc.nextDouble();
            if (tipo == 'f') {
                System.out.print("Gasto com a Saúde: ");
                double gastoSaude = sc.nextDouble();
                list.add(new Fisica(nome, rendimentoAnual, gastoSaude));
            } else {
                System.out.print("Número de Funcionários: ");
                int numerosEmpregados = sc.nextInt();
                list.add(new Juridica(nome, rendimentoAnual, numerosEmpregados));
            }
        }

        double sum = 0.0;
        System.out.println();
        System.out.println("Impostos Pagos: ");
        for (Contribuinte tp : list) {
            double taxa = tp.Taxa();
            System.out.println(tp.getNome() + ": $ " + String.format("%.2f", taxa));
            sum += taxa;
        }

        System.out.println();
        System.out.println("Impostos Totais: $ " + String.format("%.2f", sum));

        sc.close();

    }
}
