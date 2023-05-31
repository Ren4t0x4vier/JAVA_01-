
package aula03;


public class TestePessoa {
   
                public static void main(String[] args){
                    //instancição da classe pessoa
                    Pessoa p1 = new Pessoa();

                    //atribuição de valores aos atributos 
                    p1.setNome("Renato");
                    p1.setIdade(18);

                    //exibição de valores atribuidos
                    System.out.println("nome: " + p1.getNome());
                    System.out.println("idade: " + p1.getIdade());
                }
            }
          

