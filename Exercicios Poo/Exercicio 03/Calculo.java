public class Calculo {
    public String name;
    public double nota1, nota2, nota3, mediaFinal, pontosFaltantes;

    public double mediaFinal() {
        return nota1 + nota2 + nota3;
    }

    public double pontosFaltantes() {

        if (mediaFinal() < 60) {
            return 60 - mediaFinal();

        } else {
            return 0.0;

        }

    }

    public String toString() {
        return name + " teve a média " + String.format("%.2f", mediaFinal());
    }

}