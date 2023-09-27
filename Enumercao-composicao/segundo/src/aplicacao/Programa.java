package aplicacao;

import entidades.Produto;
import entidades.entidadesEnums.OrdemStatus;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import entidades.Cliente;
import entidades.Ordem;
import entidades.OrdemItem;

public class Programa {

    public static void main(String args[]) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Entre com os dados do Cliente: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Data do aniversário (DD/MM/YYYY): ");
        Date aniversario = sdf.parse(sc.next());

        Cliente cliente = new Cliente(nome, email, aniversario);

        System.out.println("Entre com os dados do Pedido:");
        System.out.print("Status: ");
        OrdemStatus status = OrdemStatus.valueOf(sc.next());

        Ordem ordem = new Ordem(new Date(), status, cliente);

        System.out.println("Quantos Itens o pedido vai ter? ");
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.println("Entre com #" + i + " item do pedido: ");
            System.out.print("Nome do produto: ");
            sc.nextLine();
            String nomeProduto = sc.next();
            System.out.print("Preço do produto: ");
            double precoProduto = sc.nextDouble();
            System.out.print("Quantidade: ");
            int quantidade = sc.nextInt();

            Produto produto = new Produto(nomeProduto, precoProduto);

            OrdemItem it = new OrdemItem(quantidade, precoProduto, produto);

            ordem.addItem(it);
        }

        System.out.println();
        System.out.println(ordem);

        sc.close();
    }
}