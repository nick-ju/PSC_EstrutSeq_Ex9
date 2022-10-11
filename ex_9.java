//Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura
// em graus Celsius.
//C = 5 * ((F-32) / 9).

package ex_9;

import java.util.Scanner;

public class ex_9 {
    public static void main(String[] args) {
        float tempF = 0;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Temperatura em Fahrenheit: ");
        tempF = sc1.nextFloat();
        float tempC = 5 * ((tempF - 32) / 9);
        System.out.println("A temperatura em Celsius é de " + tempC + "ºC");
    }
}
