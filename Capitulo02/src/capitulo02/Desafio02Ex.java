
package capitulo02;

import java.util.Scanner;

public class Desafio02Ex {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite três numeros inteiros: ");
        int inteiron1 = input.nextInt();
        int inteiron2 = input.nextInt();
        int inteiron3 = input.nextInt();
        
       int somar = inteiron1 + inteiron2 + inteiron3;
       
        System.out.println("A soma desses 3 numeros =  " + somar);
    }
}
