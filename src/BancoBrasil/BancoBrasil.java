package BancoBrasil;

import java.util.Scanner;

public class BancoBrasil {
    public static void main(String[] args) {
        //Instaciando um onjeto do tipo ContaBancaria e referenciando na 
        //variavel contaBancaria1 e cintaBancaria2
        ContaBancaria contaBancaria1 = new ContaBancaria(); 
        ContaBancaria contaBancaria2 =  new ContaBancaria();
        /* 
        Uso nas  versões mais atuais da jdk
        var contaBancaria1 = new ContaBancaria();
        
        
        //Atribuindo valores ao nosso objeto
        contaBancaria1.agencia = "0001";
        contaBancaria1.conta = "12345";
        contaBancaria1.proprietario = "Junior";
        contaBancaria1.saldo = 1.99;
        
        //Exibindo os valores atribuidos
        System.out.println(contaBancaria1.agencia + "\n" 
                 + contaBancaria1.conta + "\n"
                 + contaBancaria1.proprietario + "\n"
                 + contaBancaria1.saldo);
    */
        Scanner input = new Scanner (System.in);
    
        System.out.println("BEM-VINDO AO BANCO BRASIL");
        System.out.println("CADASTRO DE CONTAS");
        System.out.println("Digite a agência -> ");
        contaBancaria1.agencia = input.next();
        System.out.println("\nDigite a conta ->");
        contaBancaria1.conta = input.next();
        System.out.println("\nDigite o proprietário -> ");
        contaBancaria1.proprietario = input.next();
        System.out.println("\nDigite o valor de deposito -> ");
        contaBancaria1.depositar(input.nextDouble());
    
        System.out.println(contaBancaria1.agencia + "\n" 
                 + contaBancaria1.conta + "\n"
                 + contaBancaria1.proprietario + "\n"
                 + contaBancaria1.consultarSaldo()); 
        
        System.out.println("\n\nDigite o valor para saque -> ");
        contaBancaria1.sacar(input.nextDouble());
        
        System.out.println(contaBancaria1.consultarSaldo());
    }
    
}
