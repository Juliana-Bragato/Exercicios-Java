
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import modelo.entidades.Reservas;
import modelo.excecoes.dominioExcecoes;

public class Programa{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.print("Número do Quarto: ");
			int numeroQuarto = sc.nextInt();
			System.out.print("Data de entrada (dd/MM/yyyy): ");
			Date checkIn = sdf.parse(sc.next());
			System.out.print("Data de saída (dd/MM/yyyy): ");
			Date checkOut = sdf.parse(sc.next());
			
			Reservas reservas = new Reservas(numeroQuarto, checkIn, checkOut);
			System.out.println("Reserva: " + reservas);
			
			System.out.println();
			System.out.println("Insira os dados para atualizar a reserva:");
			System.out.print("Data de entrada (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Data de saída (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());
			
			reservas.updateDates(checkIn, checkOut);
			System.out.println("Reserva: " + reservas);
		}
		catch (ParseException e) {
			System.out.println("Formato de data inválido");
		}
		catch (dominioExcecoes e) {
			System.out.println("Erro na reserva: " + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Erro inesperado");
		}

		sc.close();
	}
}