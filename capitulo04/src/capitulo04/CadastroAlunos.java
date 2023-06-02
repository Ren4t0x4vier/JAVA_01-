package capitulo04;

import javax.swing.JOptionPane;

public class CadastroAlunos {
    public static void main(String[] args){
        
        String[][] alunos = new String[50][3];
        
        
        int qntdAlunos = 0;
                
                while (true){
                    String nome = (JOptionPane.showInputDialog(null, "Digite o nome do aluno: "));
                    
                    int idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a idade do aluno: "));
                    
                    double nota = Double.parseDouble (JOptionPane.showInputDialog(null,"Digite a Nota do aluno"));
                    
                    alunos[qntdAlunos][0]=nome;
                    alunos[qntdAlunos][0] = Integer.toString(idade);
                    alunos[qntdAlunos][0] = Double.toString(nota);
                    
                    qntdAlunos++;
                    
                    int opcao = JOptionPane.showConfirmDialog(null,"Deseja cadastrar outro Aluno(a): ");
                        if (opcao!=JOptionPane.YES_OPTION){
                            break;
                        }
                    
                }
                
                String listaAlunos = "Lista de Alunos: \n";
                double totalNotas = 0.0;
                    for (int i = 0; i<qntdAlunos; i++){
                        listaAlunos += alunos[i][0] + " - " + alunos [i][1] + " anos - nota :" + alunos[i][2] + "\n";
                        totalNotas += Double.parseDouble(alunos[i][2]);
                    }
                    
                    double mediaNotas = totalNotas / qntdAlunos;
                    listaAlunos+= "\nMédia das Notas: " + mediaNotas;
                    JOptionPane.showMessageDialog(null,listaAlunos);
                }
    
}

    

