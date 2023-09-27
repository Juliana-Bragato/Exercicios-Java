
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Retangulo ret = new Retangulo();


        System.out.println("Entre com a largura e altura do retângulo:");
        ret.largura = sc.nextDouble();
        ret.altura = sc.nextDouble();

        System.out.printf("AREA = %.2f%n", ret.area());
        System.out.printf("PERIMETER = %.2f%n", ret.perimetro());
        System.out.printf("DIAGONAL = %.2f%n", ret.diagonal());
        sc.close();

    }

}