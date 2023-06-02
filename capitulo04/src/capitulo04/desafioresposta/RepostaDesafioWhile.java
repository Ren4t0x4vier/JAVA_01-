package capitulo04.desafioresposta;

import java.util.Scanner;

public class RepostaDesafioWhile {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
            
        String nome;
        System.out.println("Digite seu nome : ");
        nome = scanner.nextLine();
        
        while (!nome.equals("s")){
            System.out.println("Bem vindo"+ nome);
            
            System.out.println("Digite s para sair; ");
        nome = scanner.nextLine();
        }
        System.out.println("Fim do programa ");
  }  
}
