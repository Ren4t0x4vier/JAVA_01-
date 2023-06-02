package capitulo04.desafioresposta;

import java.lang.Math;
import java.util.Scanner;

public class RespostaDesafioSwitch {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int opcao ;
        String menu = "Escolha uma operação para realizar\n" + "1 - Calculo de uma equação do segundo grau \n" + "2 - Calculo da Hipotenusa de um Triângulo reto\n" + "3 - Cálculo da energia\n";
        
        System.out.println(menu);
        
        System.out.println("Escolha um cálculo para efetuar");
        opcao = scanner.nextInt();
        
        switch (opcao){
            case 1 :
                int a, b ,c ;
                double delta;
                double delta1;
                System.out.println("Informe o valor de A, B e C, nessa ordem: ");
                a = scanner.nextInt();
                b = scanner.nextInt();
                c = scanner.nextInt();
                delta = (b*b)-(4*a*c);
                System.out.println("O valor de delta é " + delta);
                if (delta<=0) {
                    System.out.println("Essa Equação não possui uma raiz real");
                } else {
                    delta1 = Math.sqrt(delta);
                    
                    double x1 = ((-b) + delta1) /(2*a);
                    double x2 = ((-b)- delta1)/(2*a);
                    
                    System.out.println("O valor de x1 é "+ x1 +" o valor de x2 é "+ x2);
                }
            break;
            case 2:  {
                System.out.println("Foneça o Cateto Oposto e o Cateto Adjascente, nessa ordem : ");
                int cato = scanner.nextInt();
                int cata = scanner.nextInt();
                
                int hip = (cato*cato)+(cata*cata);
                
                System.out.println("A hipotenusa vale: "+Math.sqrt(hip));
            break;
            
            
            
            
                    }
                case 3: {
                    System.out.println("Digite a massa(kg) do objeto para saber sua energia: ");
                    int massa = scanner.nextInt();
                    
                    double energia;
                    String vluz = "8x10^16";
                       
                    System.out.println("A enrgia total desse objeto é de "+massa+"x"+vluz);
            }
                }
            }
                
        }
       

