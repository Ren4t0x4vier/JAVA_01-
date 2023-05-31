package aula03.geometria;

public class Retangulo {
    private double base;
    private double altura;
    
    //contnstrutor de classe
    
    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    //Método para calcular a àrea do retângulo
    public double calcularArea(){
        return this.base * this.altura;
    }
    
    //Método para calcular o perimetro do retangulo 
    public double calcularPerimetro(){
        return 2 * (this.base + this.altura);
    }
}
