
package Classe_Objetos_Atributos_Metadados_02;


public class Principal {
    
    public static void main(String[] args){
         
        //instanciei meus objetos 
        Produto prod1 = new Produto();
        Produto prod2 = new Produto();
        
        // passei valores para meu primeiro objeto
        prod1.codigo = 1;
        prod1.descricao = "Poste";
        prod1.quantidade = 50;
        
        // printei meu objeto via toSring 
        System.out.println(prod1.toString());
        
        prod1.retiraAlmoxarifado(5);
     
        System.out.println(prod1.toString());
        
        prod1.adicionaAlmoxarifado(15);
        
        System.out.println(prod1.toString());
        
        prod2.codigo = 2;
        prod2.descricao = "Transformador";
        prod2.quantidade = 10;
        
        System.out.println(prod2.toString());
        
        prod2.retiraAlmoxarifado(2);
        
        System.out.println(prod2.toString());

        prod2.adicionaAlmoxarifado(3);
        
        System.out.println(prod2.toString());

    }
    
}
