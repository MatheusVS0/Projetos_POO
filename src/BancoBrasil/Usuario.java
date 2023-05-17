/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BancoBrasil;

import java.util.Date;

/**
 *
 * @author programador
 */
public class Usuario {
    String nome = "Matheus"; 
    String sobrenome = "Vinícius";
    String telefone= "85998193237";
    Date dataRegistro = new Date();
    
    String visualizarInfo(){
    return String.format("Nome: %s\n Sobrenome: %s \n Telefone: %s \n Data de Registro: %s \n", this.nome,this.sobrenome,this.telefone,this.dataRegistro);
}
}
