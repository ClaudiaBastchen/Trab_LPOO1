/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model_pizzariaclaudiaerica;

import java.time.LocalDate;

/**
 *
 * @author Clau
 */
public class Cliente{

  
    private String pes_id;
    private String nome;
    private String sobrenome;
    private String telefone;
    private String email;
    public String getPes_id;
    

    public Cliente(String pes_id, String nome, String sobrenome, String telefone, String email) {
        this.pes_id = pes_id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.email = email;
    }    

        
        /**
     * @return the pes_id
     */
    public String getPes_id() {
        return pes_id;
    }

    /**
     * @param pes_id the pes_id to set
     */
    public void setPes_id(String pes_id) {
        this.pes_id = pes_id;
    }
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the sobrenome
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * @param sobrenome the sobrenome to set
     */
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the rua
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param rua the rua to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
}


