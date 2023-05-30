
package capitulo02;

import java.util.Scanner;

public class Desafio02Ex2 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Fornecça uma temperatura em graus Celsius para realizar a conversão para Farenheit: ");
        float temperaturac = input.nextInt();
        
        float temperaturaf = (temperaturac * 9/5) + 32;
          
        System.out.println("A temperatura em Farenheit é " + temperaturaf);
    }
}
