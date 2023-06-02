package capitulo05;

public class TesteCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "Sedan";
        carro.ano = 2021 ;
        String fabricanteCarro = carro.getFabricante();
        System.out.println("O fabricante "+fabricanteCarro);
                
        CarroEsportivo esportivo = new CarroEsportivo();
        esportivo.modelo = "Esportivo";
        esportivo.ano =  2023;
    }
}
