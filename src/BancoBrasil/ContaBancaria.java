package BancoBrasil;

public class ContaBancaria {
    //Atributos (características) da classe
    String agencia;
    String conta;
    double saldo;
    String proprietario;
   
    //Métodos (comportamentos) da classe
    void depositar(double valor){//Método com parametro
        this.saldo += valor;
    }
    
    void sacar (double valor){// Método com parametro
        if (saldo < valor){
            System.out.println("Saldo insuficiente");
        }else {
        this.saldo -= valor;
    }
    }
    
    void transferir (){
        
    }
    
    String consultarSaldo() {// Método sem parametro
        //String.format() método da calsse String para utilizar formatação
        //com ientificadores(%d, %f, %s).
        return String.format("Seu saldo é: R$ %.2f", this.saldo);
    }
    
}