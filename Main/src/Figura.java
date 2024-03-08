public abstract class Figura {
    protected int numeroLados;

    public Figura(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public abstract double calcularArea();
}