package modelo.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import modelo.excecoes.dominioExcecoes;

public class Reservas {

    private Integer numeroQuarto;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservas(Integer numeroQuarto, Date checkIn, Date checkOut) {

        if (!checkOut.after(checkIn)) {
            throw new dominioExcecoes("A data de Saída deve ser posterior à data de Entrada");
        }
        this.numeroQuarto = numeroQuarto;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getNumeroQuarto() {
        return this.numeroQuarto;
    }

    public void setNumeroQuarto(Integer numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public long duration() {
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void updateDates(Date checkIn, Date checkOut) {
        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)) {
            throw new dominioExcecoes("As datas de reserva para serem atualizadas, precisam ser datas futuras.");
        }
        if (!checkOut.after(checkIn)) {
            throw new dominioExcecoes("A data de Saída deve ser posterior à data de Entrada");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Quarto "
                + numeroQuarto
                + ", Entrada: "
                + sdf.format(checkIn)
                + ", Saída: "
                + sdf.format(checkOut)
                + ", "
                + duration()
                + " noites";
    }
}
