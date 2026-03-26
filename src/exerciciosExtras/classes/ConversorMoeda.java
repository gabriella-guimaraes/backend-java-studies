package exerciciosExtras.classes;

import exerciciosExtras.interfaces.ConversaoFinanceira;

public class ConversorMoeda implements ConversaoFinanceira {
    @Override
    public void converterDolarParaReal(double dolar) {
        double votacaoDolar = 5.24;
        double real = dolar * votacaoDolar;
        System.out.println("O valor em reais é: R$" + real);
    }
}
