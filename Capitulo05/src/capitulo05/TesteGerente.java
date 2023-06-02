
package capitulo05;


public class TesteGerente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNome("Guilherme Briggs");
        gerente.setSenha(1234);
        
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Bonificação: " + gerente.getBonificacao());
        
        
        Funcionario funcionario = new Gerente();
        funcionario.setNome("Maira Azevedo");
        funcionario.setSalario(1212.0);
        
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Bonificação: " + funcionario.getBonificacao());
    }
}