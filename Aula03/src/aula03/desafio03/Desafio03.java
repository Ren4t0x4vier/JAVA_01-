package aula03.desafio03;

import aula03.desafio03calculo.Calculo;

public class Desafio03 {
    
    public static void main (String[] args){
        
        Calculo Calculo = new Calculo (3.14, 5);
        
        double area = Calculo.calcularArea();
        
        
        
        System.out.println("A area do circulo é : " + area);
    }
    
}
