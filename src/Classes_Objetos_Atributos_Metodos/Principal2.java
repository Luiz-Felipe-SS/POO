
package Classes_Objetos_Atributos_Metodos;

import java.util.Scanner;

public class Principal2 {
    public static void main(String[] args){
        // intaiei meus objetos
        Scanner ler = new Scanner(System.in);
        Circulo circ01 = new Circulo();
        
        
        System.out.println("Informe o valor do raio para o objeto circ01: ");
        circ01.raio = ler.nextFloat();
        
        System.out.println("Informe o valor do ângulo  x para o objeto circ01: ");
        circ01.x = ler.nextInt();
        
        System.out.println("Informe o valor do ângulo  y para o objeto circ01: ");
        circ01.y = ler.nextInt();
        
        System.out.println(circ01.raio);
        System.out.println(circ01.x);
        System.out.println(circ01.y);
        
        System.out.println(circ01.area());
        
        
    }
    
}
