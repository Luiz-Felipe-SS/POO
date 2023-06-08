
package Classe_Objetos_Atributos_Metadados_03;


public class Cliente {
    public String cpf;
    public int anoNascimento;
    public String nome;
    public String email;

    @Override
    public String toString() {
        return "Cliente{" + "cpf=" + cpf + ", anoNascimento=" + anoNascimento + ", nome=" + nome + ", email=" + email + '}';
    }
    
    
    
}
