public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        super(0);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
