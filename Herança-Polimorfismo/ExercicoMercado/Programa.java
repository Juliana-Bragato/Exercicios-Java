package ExercicoMercado;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import ExercicoMercado.entities.Produto;
import ExercicoMercado.entities.Usados;
import ExercicoMercado.entities.Importado;

public class Programa {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Produto> list = new ArrayList<>();

        System.out.print("Entre com o número de produtos para cadastro: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Dados do #" + i + " Produto:");
            System.out.print("O Produto é comum, usado ou importado (c/u/i)?: ");
            char type = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String Nome = sc.nextLine();
            System.out.print("Preço: ");
            double Preco = sc.nextDouble();
            if (type == 'c') {
                list.add(new Produto(Nome, Preco));
            } else if (type == 'u') {
                System.out.print("Data de Fabricação (DD/MM/YYYY): ");
                LocalDate dataDeFabricacao = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new Usados(Nome, Preco, dataDeFabricacao));
            } else {
                System.out.print("Taxa de Importação: ");
                double taxAlfandegaria = sc.nextDouble();
                list.add(new Importado(Nome, Preco, taxAlfandegaria));

            }
        }

        System.out.println();
        System.out.println("Etiquetas de Preço: ");
        for (Produto prod : list) {
            System.out.println(prod.etiquetaDePreco());
        }
        sc.close();
    }

}
