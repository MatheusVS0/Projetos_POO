
package bancobrasil;

import java.util.Date;

public class Cliente extends Usuario {
    
    private Date dataRegistro = new Date();
    
    public Cliente(){}

    public Cliente(String n, String s, String t, Usuario p) {
        super(n, s, t, p);
    }
   
    public Date getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(Date dataRegistro) {
        this.dataRegistro = dataRegistro;
    }
    
    @Override
    public String imprimirInfo(){
        return String.format("- - - INFORMAÇÕES DO CLIENTE - - - \nnome: %s\n Sobrenome: %s\n Telefone: %s\n Data de registro: %s",super.getNome(), super.getSobrenome(), super.getTelefone(),this.dataRegistro);
    }
    
}
