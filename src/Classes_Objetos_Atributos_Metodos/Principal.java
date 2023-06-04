
package Classes_Objetos_Atributos_Metodos;

public class Principal {
    
    public static void main(String[] args){
       
        //instanciei meus objetos 
        Circulo primeiroCirculo = new Circulo();
        Circulo segunodoCirculo = new Circulo();
        
        System.out.println(primeiroCirculo.raio);
        System.out.println(primeiroCirculo.x);
        System.out.println(primeiroCirculo.y);
        
        // passei valores para meu primeiro objeto
        primeiroCirculo.raio = 55;
        primeiroCirculo.x = 10;
        primeiroCirculo.y = 20;
        
        System.out.println("====================");
        
        System.out.println(primeiroCirculo.raio);
        System.out.println(primeiroCirculo.x);
        System.out.println(primeiroCirculo.y);
        
        primeiroCirculo.raio = 10;
        primeiroCirculo.x = -15;
        primeiroCirculo.y = 5;
        
        System.out.println("====================");
        
        System.out.println(primeiroCirculo.raio);
        System.out.println(primeiroCirculo.x);
        System.out.println(primeiroCirculo.y);
        
        // Passei valores para meu segundo objeto
        segunodoCirculo.raio = 9;
        segunodoCirculo.x = 45;
        segunodoCirculo.y = 45;     
        
        System.out.println("====================");
        
        // printei o resultado do cálculo do meus objetos 
        System.out.println(primeiroCirculo.area());
        System.out.println(segunodoCirculo.area());
        
        System.out.println("====================");
        
        // Usei meu método para realizar a troca dos valores dos de 'x' e 'y'
        primeiroCirculo.troca(33, 22);
        
        System.out.println(primeiroCirculo.raio);
        System.out.println(primeiroCirculo.x);
        System.out.println(primeiroCirculo.y);
        
    }
    
}
