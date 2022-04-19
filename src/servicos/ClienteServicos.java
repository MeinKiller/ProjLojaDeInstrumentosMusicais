package servicos;

import dao.ClienteDAO;
import dao.DAOFactory;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Cliente;

/**
 *
 * @author Henrique Peixoto
 * @since 07/07/2017 - 18:20
 * @version 1.0 quemtocabateriaétroxa
 */
public class ClienteServicos {

    public void cadastrarCliente(Cliente c) throws SQLException {
        ClienteDAO cDAO = DAOFactory.getClienteDAO();
        cDAO.cadastrarCliente(c);
    }//fecha metodo

    public ArrayList<Cliente> buscarCliente() throws SQLException {
        ClienteDAO cDAO = DAOFactory.getClienteDAO();
        return cDAO.buscarClientes();
    }

    public ArrayList<Cliente> filtrarCliente(String query) throws SQLException {
        ClienteDAO cDAO = DAOFactory.getClienteDAO();
        return cDAO.filtrarCliente(query);
    }//fecha método

    public void deletarCliente(long id) throws SQLException {
        ClienteDAO cDAO = DAOFactory.getClienteDAO();
        cDAO.deletarCliente(id);
    }//Fecha método
    
     public void alterarCliente(Cliente c) throws SQLException {
        ClienteDAO cDAO = DAOFactory.getClienteDAO();
        cDAO.alterarCliente(c);
    }//Fecha método

}//fecha classe
