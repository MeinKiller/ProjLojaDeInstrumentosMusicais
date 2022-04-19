/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import modelo.Funcionario;

/**
 * @author Anderson Justo
 * @version 1.0 beta
 */
public class DAOFactory {

    private static InstrumentoDAO instrumentoDAO = new InstrumentoDAO();

    public static InstrumentoDAO getInstrumentoDAO() {
        return instrumentoDAO;
    }//fecha método
    
    private static ClienteDAO clienteDAO = new ClienteDAO();

    public static ClienteDAO getClienteDAO() {
        return clienteDAO;
    }//fecha método
    
    private static FuncionarioDAO funcionarioDAO = new FuncionarioDAO();

    public static FuncionarioDAO getFuncionarioDAO() {
        return funcionarioDAO;
    }//fecha método

}
