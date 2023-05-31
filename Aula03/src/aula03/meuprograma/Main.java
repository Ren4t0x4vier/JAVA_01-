package aula03.meuprograma;

import aula03.geometria.Retangulo;

public class Main {
    
    //Método principal do programa 
    public static void main (String[] args){
        
        //criando um objeto da classe retangulo
        Retangulo retangulo = new Retangulo (5,10);
        
        //calculando a area e o perimetro do retangulo 
        double area = retangulo.calcularArea();
        double perimetro = retangulo.calcularPerimetro();
        
        //imprimindo os resultados na tela 
        System.out.println("Área do retângulo: " + area);
        System.out.println("Peímetro do retângulo: "+ perimetro );
    }
     
                    
    
}
          

