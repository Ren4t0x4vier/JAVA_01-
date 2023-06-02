
package capitulo04.desafioresposta;

import java.util.Scanner;

public class RespostaDesafioSeleção {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o valor de um Livro 1: ");
        double livro1 = scanner.nextDouble();
        
        System.out.println("Informe o valor de um Livro 2: ");
        double livro2 = scanner.nextDouble();
        
        if (livro1 < 10.00){
            System.out.println("O Livro está muito barato");
        } else{
            System.out.println("O livro 1 está muito caro");
        }
        
        if (livro2>livro1){
            System.out.println("O valor do segundo livro informado é maior");
        } 
        else if (livro1>livro2) {
            System.out.println("O valor do primeiro livro informado é maior");
        } else{
            System.out.println("Os valores dos livros informados são iguais");
        }
    }
}
