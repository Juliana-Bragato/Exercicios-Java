import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculo cl = new Calculo();

        System.out.println(" Digite o nome do Aluno: ");
        cl.name = sc.nextLine();

        System.out.println(" Digite primeira nota: ");
        cl.nota1 = sc.nextDouble();

        System.out.println(" Digite segunda nota: ");
        cl.nota2 = sc.nextDouble();

        System.out.println(" Digite terceira nota: ");
        cl.nota3 = sc.nextDouble();

        System.out.println(cl);

        if (cl.mediaFinal() > 60) {
            System.out.println(" PASSOU ");
        } else {
            System.out.println(" REPROVOU, faltou " + cl.pontosFaltantes() + " pontos.");
        }
        sc.close();

    }

}
