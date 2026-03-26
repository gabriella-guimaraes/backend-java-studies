package exerciciosExtras.classes;

import exerciciosExtras.interfaces.Tabuada;

public class TabuadaMultiplicacao implements Tabuada {

    @Override
    public void mostrarTabuada(int fator) {
        System.out.println("Tabuada multiplicacao do " + fator);

        for (int i = 1; i <= 10; i++) {
            int resultado = fator * i;
            System.out.println(fator + "x" + i + " = " + resultado);
        }
    }
}
