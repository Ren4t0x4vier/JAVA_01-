package capitulo04;

import java.util.Scanner;


public class Switch {
    public static void main (String[] args){
         Scanner input = new Scanner(System.in);
         
         String menu = "Menu de Bebidas\n" + "1 - Coca\n"+"2 - Guaraná\n"+"3 - Fanta\n"+"4 - Kituba\n"+"5 - Baré\n";
         
         System.out.println(menu);
                 
            
         System.out.println("Escolha uma opção do menu de acordo com seun numero: ");
            int opcao = input.nextInt();
        
        switch (opcao){
            case 1:
                System.out.println("4,50");
            break;
            case 2:
                System.out.println("3,50");
            break;
            case 3:
                System.out.println("3,50");
            break;
            case 4:
                System.out.println("2,99");
            break;
            case 5:
                System.out.println("2,99");
            break;
            default :
                System.out.println("Opção inválida");
                
        }
    }
}
