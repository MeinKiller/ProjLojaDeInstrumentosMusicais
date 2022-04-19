/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Cliente;
import persistencia.ConexaoBanco;

/**
 * @author Anderson Justo
 * @version 1.0 beta
 */
public class ClienteDAO {

    /**
     * @author Anderson Justo
     * @version 1.0 beta
     */
    public void cadastrarCliente(Cliente cli) throws SQLException {

        //Buscando uma conexão com o Banco de Dados
        Connection con = ConexaoBanco.getConexao();
        /*Criando obj. capaz de executar instruções
         SQL no banco de dados*/
        Statement stat = con.createStatement();
        
        try {
            //String que receberá instrução SQL
            String sql;

            /* Montando a instrução INSERT para inserir
             um objeto cli no Banco MySQL */
            sql = "insert into cliente(idcliente,nome,cpf,sexo,localizacao,pagamento,quantidadecompra)"
                    + "values(null, '" + cli.getNome() + "', '" + cli.getCpf() + "', '" + cli.getSexo() + "','" + cli.getLocalizacao() + "'," + cli.getPagamento() + "," + cli.getQuantidadeComprada() + ")";

            //Executando o sql
            stat.execute(sql);
            
        } catch (SQLException e) {
            throw new SQLException("Erro ao inserir cliente!");
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método

    /**
     * @author Anderson Justo
     * @version 1.0 beta
     */
    public ArrayList<Cliente> buscarClientes() throws SQLException {
        
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql;

            //Montando o sql            
            sql = "select * from cliente";

            /* Executando o SQL  e armazenando
             o ResultSet em um objeto do tipo
             ResultSet chamado rs */
            ResultSet rs = stat.executeQuery(sql);

            /* Criando ArrayList para armazenar 
             objetos do tipo cliente */
            ArrayList<Cliente> clie = new ArrayList<>();

            /* Enquanto houver uma próxima linha no 
             banco de dados o while roda */
            while (rs.next()) {
                //Criando um novo obj. cliente
                Cliente c = new Cliente();

                /* Mapeando a tabela do banco para objeto
                 chamado cli */
                c.setIdcliente(rs.getLong("idcliente"));
                c.setNome(rs.getString("nome"));
                c.setCpf(rs.getString("cpf"));
                c.setSexo(rs.getString("sexo"));
                c.setLocalizacao(rs.getString("localizacao"));
                c.setPagamento(rs.getDouble("pagamento"));
                c.setQuantidadeComprada(rs.getInt("quantidadecompra"));

                /* Inserindo o objeto cli no ArrayList */
                clie.add(c);
            }//fecha while

            //Retornando o ArrayList com todos objetos
            return clie;
            
        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar cliente! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método

    public ArrayList<Cliente> filtrarCliente(String query) throws SQLException {
        
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql;

            //Montando o sql            
            sql = "select * from cliente " + query;

            /* Executando o SQL  e armazenando
             o ResultSet em um objeto do tipo
             ResultSet chamado rs */
            ResultSet rs = stat.executeQuery(sql);

            /* Criando ArrayList para armazenar 
             objetos do tipo produto */
            ArrayList<Cliente> clie = new ArrayList<>();

            /* Enquanto houver uma próxima linha no 
             banco de dados o while roda */
            while (rs.next()) {
                //Criando um novo obj. cliente
                Cliente c = new Cliente();

                /* Mapeando a tabela do banco para objeto
                 chamado cli */
                c.setIdcliente(rs.getLong("idcliente"));
                c.setNome(rs.getString("nome"));
                c.setCpf(rs.getString("cpf"));
                c.setSexo(rs.getString("sexo"));
                c.setLocalizacao(rs.getString("localizacao"));
                c.setPagamento(rs.getDouble("pagamento"));
                c.setQuantidadeComprada(rs.getInt("quantidadecompra"));

                /* Inserindo o objeto cli no ArrayList */
                clie.add(c);
            }//fecha while

            //Retornando o ArrayList com todos objetos
            return clie;
            
        } catch (SQLException e) {
            throw new SQLException("Erro ao filtrar cliente! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método

    public void deletarCliente(long id) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        /*Criando obj. capaz de executar instruções
         SQL no banco de dados*/
        Statement stat = con.createStatement();
        
        try {
            String sql = "";
            sql = "delete from cliente where idcliente = " + id;
            stat.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao excluir!" + e.getMessage());
        } finally {
            stat.close();
            con.close();
        }
    }//fecha metodo

    public void alterarCliente(Cliente c) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;
            
            sql = "update cliente set "
                    + "nome = '" + c.getNome() + "',"
                    + "cpf = '" + c.getCpf() + "',"
                    + "localizacao = '" + c.getLocalizacao() + "',"
                    + "pagamento = " + c.getPagamento() + ","
                    + "quantidadecompra = " + c.getQuantidadeComprada() + ","
                    + "sexo = '" + c.getSexo() + "' "
                    + "where idcliente = " + c.getIdcliente() + " ";
            
            stat.executeUpdate(sql);
            
        } catch (SQLException e) {
            throw new SQLException("Erro ao alterar cliente" + e.getMessage());
        }finally{
            con.close();
            stat.close();
        }
    }
}//fecha classe
