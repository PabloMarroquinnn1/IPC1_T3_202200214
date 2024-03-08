//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Figura> figuras = new ArrayList<>();

        Figura triangulo = new Triangulo(5, 8);
        Figura cuadrado = new Cuadrado(4);
        Figura circulo = new Circulo(3);

        figuras.add(triangulo);
        figuras.add(cuadrado);
        figuras.add(circulo);

        for (Figura figura : figuras) {
            String nombreFigura = figura.getClass().getSimpleName();
            double area = figura.calcularArea();
            System.out.println(nombreFigura + ": Área = " + area);
        }
    }
}