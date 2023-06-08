
package Classe_Objetos_Atributos_Metadados_03;

public class Conta {
   public int numero;
   public double saldo;

    @Override
    public String toString() {
        return "Conta{" + "numero=" + numero + ", saldo=" + saldo + '}';
    }
   
   public void debitaSaldo(double entradaValor){
       this.saldo = this.saldo + entradaValor;
       return;
   }
   
   public void creditaSaldo(double entradaValor){
       this.saldo = this.saldo - entradaValor;
       return;
   }
}
