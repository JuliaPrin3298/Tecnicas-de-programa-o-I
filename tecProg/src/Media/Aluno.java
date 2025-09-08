package Media;

public class Aluno {
    private double nota1;
    protected double nota2;

    public void setNota1(double n1) {
        if (n1 >= 0 && n1 <= 10) {
            nota1 = n1;
        } else {
            System.out.println("Nota inválida! Deve ser entre 0 e 10.");
        }
    }

    public void setNota2(double n2) {
        if (n2 >= 0 && n2 <= 10) {
            nota2 = n2;
        } else {
            System.out.println("Nota inválida! Deve ser entre 0 e 10.");
        }
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getMedia() {
        return (nota1 + nota2) / 2;
    }
}
