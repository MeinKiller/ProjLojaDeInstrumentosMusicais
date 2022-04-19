package servicos;

import dao.InstrumentoDAO;
import dao.DAOFactory;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Instrumento;

/**
 *
 * @author Henrique Peixoto
 * @since 07/07/2017 - 18:07
 * @version 1.0 tuk
 */
public class InstrumentoServicos {

    public void cadastrarInstrumento(Instrumento i) throws SQLException {
        InstrumentoDAO iDAO = DAOFactory.getInstrumentoDAO();
        iDAO.cadastrarInstrumento(i);
    }//fecha metodo

    public ArrayList<Instrumento> buscarInstrumentos() throws SQLException {
        InstrumentoDAO iDAO = DAOFactory.getInstrumentoDAO();
        return iDAO.buscarInstrumento();
    }

    public ArrayList<Instrumento> filtrarIsntrumento(String query) throws SQLException {
        InstrumentoDAO iDAO = DAOFactory.getInstrumentoDAO();
        return iDAO.filtrarInstrumento(query);
    }//fecha método

    public void deletarInstrumento(long id) throws SQLException {
        InstrumentoDAO iDAO = DAOFactory.getInstrumentoDAO();
        iDAO.deletarInstrumento(id);
    }//Fecha método
     public void alterarInstrumento(Instrumento i) throws SQLException {
        InstrumentoDAO iDAO = DAOFactory.getInstrumentoDAO();
        iDAO.alterarInstrumento(i);
    }//Fecha método

    

}//fecha classe
