package modelo.excecoes;

public class dominioExcecoes extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public dominioExcecoes(String msg) {
        super(msg);
    }
}
