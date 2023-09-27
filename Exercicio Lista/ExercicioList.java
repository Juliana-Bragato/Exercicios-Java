import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Funcionario> list = new ArrayList<>();

        System.out.println(" Quantos Funcionários você vai registrar ? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println();
            System.out.println("Funcionario #" + (i + 1) + ":");
            System.out.print(" Id: ");
            Integer id = sc.nextInt();

            while (hasId(list, id)) {
                System.out.println("Id informado já existe, tente novamente: ");
                id = sc.nextInt();
            }

            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salario: ");
            Double salario = sc.nextDouble();

            Funcionario emp = new Funcionario(id, nome, salario);

            list.add(emp);
        }

        System.out.println();
        System.out.print("Entre com Id do Funcionário que terá acrescimo no salário : ");
        int idsalario = sc.nextInt();

        Funcionario emp = list.stream().filter(x -> x.getId() == idsalario).findFirst().orElse(null);

        if (emp == null) {
            System.out.println("Esse Id não existe ! ");
        } else {
            System.out.print("Entre com a porcentagem: ");
            double percent = sc.nextDouble();

            emp.increaseSalario(percent);
        }

        System.out.println();
        System.out.println("Lista de Funcionários:");
        for (Funcionario e : list) {
            System.out.println(e);
        }

        sc.close();
    }

    public static Integer position(List<Funcionario> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }

    public static boolean hasId(List<Funcionario> list, int id) {
        Funcionario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;

    }

}