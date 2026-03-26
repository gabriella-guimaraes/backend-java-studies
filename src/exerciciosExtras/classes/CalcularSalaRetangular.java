package exerciciosExtras.classes;

import exerciciosExtras.interfaces.CalculoGeometrico;

public class CalcularSalaRetangular implements CalculoGeometrico {
    @Override
    public void calcularArea(double altura, double largura) {
        double area = altura * largura;
        System.out.println("Área: " + area);
    }

    @Override
    public void calcularPerimetro(double altura, double largura) {
        double perimetro = (2 * altura) +  (2 * largura);
        System.out.println("Perímetro: " + perimetro);
    }
}
