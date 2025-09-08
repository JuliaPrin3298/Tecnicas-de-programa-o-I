package AtividadeCilindro;

public class Cilindro {
    private double raioBase;
    protected double altura;
    double volume; 

    public void setRaio(double r){
      raioBase = r;
    }

    public void setAltura(double a){
        altura = a;
    }

    public double getRaio(){
        return raioBase;
    }

    public double getAltura(){
        return altura;
    }

    public void mostrarVolume() {
        volume = Math.PI * raioBase * raioBase * altura;
        System.out.println(volume);
    }

}
