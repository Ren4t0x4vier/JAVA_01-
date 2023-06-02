package capitulo04;

import java.util.Scanner;


public class Primo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
         
        
       System.out.println("Informe um numero inteiro: ");
       int num = input.nextInt();
       int i, contador = 0;
      
           for (i = 1; i<=num; i++){
               if (num%i==0){
                contador++;
               }
           }
            if (contador == 2){
                System.out.println("Esse número é primo");
            } else {
                System.out.println("Esse numero não é primo");
            }
    }
}