
package bancobrasil;


public class ContaBancaria {
    //Atributos da Classe
    String agencia;
    String conta;
    private double saldo;
    Usuario proprietario;
    
    public ContaBancaria(){}
    
    public ContaBancaria(String a, String c, double s, Usuario p){}
    
    public String getagencia(){
        return this.agencia;
    }
    public void setagencia(String a){
        this.agencia = a;
    }
    
     public String getconta(){
        return this.conta;
    }
    public void setconta(String c){
        this.conta = c;
    }
    
     public double getsaldo(){
        return this.saldo;
    }
    public void setagencia(double s){
        this.saldo = s;
    }
    
     public Usuario getproprietario(){
        return this.proprietario;
    }
    public void setproprietario(Usuario p){
        this.proprietario = p;
    }
    
    
    //métodos(Comportamentos) da Classe
    void depositar(double valor){ //método com parametro
        this.saldo += valor;
    }
    
    void sacar(double valor){// Método com parametro
        
        if (saldo < valor){
           System.out.println("seu saldo é insuficiente para o saque");
        } else{
       this.saldo -= valor;
       
           
       }
    }
    
    void trasferir(ContaBancaria ContaBancaria, double valor){
        if(valor > saldo){
        this.sacar(valor);
          ContaBancaria.saldo += valor;
        } else{
            System.out.println("seu saldo é insuficiente para o saque");
        }
       
        
    }
    
    String consultarSaldo(){ // Método sem parametro
        // String.format() método da classe String para utilizar formatação
        // com identificadores(%d, %f, %s).
        return String.format("Seu saldo é: R$ %.2f",this.saldo);
    }
    

}
