package aula03.desafio03calculo;


public class Calculo {
    public double pi;
    public int raio;
    
    public Calculo (double pi, int raio) {
        this.raio = raio;
        this.pi = pi;
    }
    
    public double calcularArea(){
        return this.pi*(this.raio*this.raio);
    }
    
    
}
