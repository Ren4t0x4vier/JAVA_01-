package capitulo04.desafioresposta;

import java.util.Scanner;

public class RespostaDesafioFor{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número para contar até ele: ");
        int num = scanner.nextInt();
        
        int i;
        
        for(i=0; num>=i; i++){
            
            System.out.println(i);
        }
    } 
}
