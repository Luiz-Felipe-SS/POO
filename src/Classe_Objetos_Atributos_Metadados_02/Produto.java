
package Classe_Objetos_Atributos_Metadados_02;

public class Produto {
    public String descricao;
    public int codigo;
    public int quantidade;
    
    
    
    // método para mostrar meu objeto
    public String toString(){
        return  "Produto [descricao = " + descricao + ", codigo = " + codigo + " quantidade = " + quantidade + " ]";
    }
    
    // método para retirar volores do campo 'quantidade'
    public void retiraAlmoxarifado(int quantidadeRetirada){
        this.quantidade = this.quantidade - quantidadeRetirada;
        return ;
    }
    
    // método para adicinar volores no campo 'quantidade'
    public void adicionaAlmoxarifado(int quantidadeAdicional){
        this.quantidade = this.quantidade + quantidadeAdicional;
        return ;
    }
    
    
}
