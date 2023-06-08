
package Classe_Objetos_Atributos_Metadados_03;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
    
        Scanner ler = new Scanner(System.in);
        Conta conta_01 = new Conta();
        Cliente cliente_01 = new Cliente();
        Cliente cliente_02 = new Cliente();
        Cliente cliente_03 = new Cliente();
        Cliente cliente_04 = new Cliente();
        Cliente cliente_05 = new Cliente();
        
        cliente_01.cpf = "02850435902";
        cliente_01.anoNascimento = 1980;
        cliente_01.nome = "Marcos da Rocha Souza";
        cliente_01.email = "mr_souza@gmail.com";

        conta_01.numero = 1521;
        conta_01.saldo = 750.63;

        cliente_02.cpf = "03510400902";
        cliente_02.anoNascimento = 1985;
        cliente_02.nome = "Ana Clara Marques";
        cliente_02.email = "aninha@gmail.com";
        
        cliente_03.cpf = "04564238906";
        cliente_03.anoNascimento = 1975;
        cliente_03.nome = "Pedro de Alcantara";
        cliente_03.email = "pedro_75@gmail.com";
        
        cliente_04.cpf = "03289078908";
        cliente_04.anoNascimento = 1977;
        cliente_04.nome = "Pedro Andre Marcondess";
        cliente_04.email = "pedro@gmail.com";
        
        System.out.println(cliente_01.toString());
        System.out.println(cliente_02.toString());
        System.out.println(cliente_03.toString());
        System.out.println(cliente_04.toString());
        
        System.out.println(conta_01.toString());
        
        conta_01.debitaSaldo(157);
        
        System.out.println(conta_01.toString());
        
        conta_01.creditaSaldo(53.66);
        
        System.out.println(conta_01.toString());
        
        System.out.println("====================");
        
        System.out.println("Informe seu CPF");
        cliente_05.cpf = ler.nextLine();
        System.out.println("Informe seu email:");
        cliente_05.email = ler.nextLine();
        System.out.println("informe seu ano de nascimento: ");
        cliente_05.anoNascimento = ler.nextInt();
        System.out.println("Informe seu nome: ");
        cliente_05.nome = ler.nextLine();
        
       
        
        System.out.println(cliente_05.toString());
    
    
    
    
    }
    
}
