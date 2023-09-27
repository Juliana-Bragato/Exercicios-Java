package modelo.DominioExcecoes;

    public class MainExcecoes extends RuntimeException {
        private static final long serialVersionUID = 1L;
    
        public MainExcecoes(String msg) {
            super(msg);
        }
    }

