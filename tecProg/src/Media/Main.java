package Media;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNota1(11.5);
        aluno.setNota2(7.0);

        System.out.println("Nota 1: " + aluno.getNota1());
        System.out.println("Nota 2: " + aluno.getNota2());
        System.out.println("Média: " + aluno.getMedia());
    }
}
