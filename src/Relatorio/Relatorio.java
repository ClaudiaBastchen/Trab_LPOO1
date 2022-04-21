/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relatorio;

import Model_pizzariaclaudiaerica.Cliente;
import java.util.List;

/**
 *
 * @author Clau
 */
public class Relatorio {
    public static String gerarRelatorio(List<Cliente> listaClientes){
        String resultado = "";
        for (Cliente c:listaClientes){
            resultado += "\n"+ c.getPes_id() + "     "
                    + c.getNome() + "     "
                    + c.getSobrenome() + "     "
                    + c.getTelefone() + "     "
                    + c.getEmail();
        }
        return resultado;
    }
}
