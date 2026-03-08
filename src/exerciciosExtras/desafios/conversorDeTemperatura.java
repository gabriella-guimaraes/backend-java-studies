package exerciciosExtras.desafios;

public class conversorDeTemperatura {
    // Escreva um programa que converta uma temperatura em graus Celsius para Fahrenheit
    // A formula de converção é (temperatura * 1.8) + 32
    // Depois crie uma variável inteira para exibir a temperatura em Fahrenheit sem casas decimais
     static void main() {
         double temperaturaCelsius = 21.5;
         double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;

         int temperaturatemperaturaEmFahrenheitInteira = (int) temperaturaFahrenheit;

         System.out.println("A temperatura em Fahrenheit é: " + temperaturaFahrenheit);
         System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturatemperaturaEmFahrenheitInteira);
    }

}
