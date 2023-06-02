package capitulo05;

public class PassagemDeParametros {
        public static void main(String[] args) {
         
        int a=10; 
        int b=20;
        
        System.out.println("Antes de chamar o metodo: ");
        System.out.println("A = "+ a + " B = "+ b);
        
        //chamada do método soma
        
        soma(a,b);
        
        System.out.println(" Depois de chamar o método: ");
        System.out.println("A = "+ a + " B = "+b);
    }
    public static void soma(int x, int y){
        int resultado = x + y 
                ;
        System.out.println("Resultado da soma: "+ resultado );
        
        //Altera o valor do parâmetro x 
        x = 0;
        System.out.println("O valor de x dento do método "+x);
    }
    
}

