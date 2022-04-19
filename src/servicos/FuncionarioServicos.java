package servicos;

import dao.ClienteDAO;
import dao.FuncionarioDAO;
import dao.DAOFactory;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Cliente;
import modelo.Funcionario;

/**
 *
 * @author Henrique Peixoto
 * @since 07/07/2017 - 18:27
 * @version 1.0 pitagoras
 */
public class FuncionarioServicos {

    public void cadastrarFuncionario(Funcionario f) throws SQLException {
        FuncionarioDAO fDAO = DAOFactory.getFuncionarioDAO();
        fDAO.cadastrarFuncioario(f);
    }//fecha metodo

    public ArrayList<Funcionario> buscarFuncionario() throws SQLException {
        FuncionarioDAO fDAO = DAOFactory.getFuncionarioDAO();
        return fDAO.buscarFuncionario();
    }

    public ArrayList<Funcionario> filtrarFuncionario(String query) throws SQLException {
        FuncionarioDAO fDAO = DAOFactory.getFuncionarioDAO();
        return fDAO.filtrarFuncionario(query);
    }//fecha método

    public void deletarFuncionario(long id) throws SQLException {
        FuncionarioDAO fDAO = DAOFactory.getFuncionarioDAO();
        fDAO.deletarFuncionario(id);
    }//Fecha método
    
     public void alterarFuncionario(Funcionario f) throws SQLException {
        FuncionarioDAO fDAO = DAOFactory.getFuncionarioDAO();
        fDAO.alterarFuncionario(f);
    }//Fecha método

}//fecha classe
