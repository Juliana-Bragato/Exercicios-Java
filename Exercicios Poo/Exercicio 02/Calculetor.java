public class Calculetor {

    public String name;
    public double grosSalary;
    public double tax;

    public double netSalary() {
        return grosSalary - tax;
    }

    public double finalSalary(double porcentagem) {
        return grosSalary += grosSalary * porcentagem / 100;

    }

    public String toString() {
        return name + ", $ " + String.format("%.2f", netSalary());
    }
}