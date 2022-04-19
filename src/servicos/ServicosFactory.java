/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

/**
 * @author Henrique Peixoto
 * @since 07/07/2017 - 18:35
 * @version 1.0 tales 
 */
public class ServicosFactory {

    private static ClienteServicos clienteServicos = new ClienteServicos();

    public static ClienteServicos getClienteServicos() {

        return clienteServicos;
    }//fecha metodo
    private static FuncionarioServicos funcionarioServicos = new FuncionarioServicos();

    public static FuncionarioServicos getFuncionarioServicos() {

        return funcionarioServicos;
    }//fecha metodo
    private static InstrumentoServicos instrumentoServicos = new InstrumentoServicos();

    public static InstrumentoServicos getInstrumentoServicos() {

        return instrumentoServicos;
    }//fecha metodo

}//fecha classe
