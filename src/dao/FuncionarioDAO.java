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
import modelo.Funcionario;
import persistencia.ConexaoBanco;

/**
 * @author Anderson Justo
 * @version 1.0 beta
 */
public class FuncionarioDAO {

    /**
     * @author Anderson Justo
     * @version 1.0 beta
     */
    public void cadastrarFuncioario(Funcionario fun) throws SQLException {

        //Buscando uma conexão com o Banco de Dados
        Connection con = ConexaoBanco.getConexao();
        /*Criando obj. capaz de executar instruções
         SQL no banco de dados*/
        Statement stat = con.createStatement();

        try {
            //String que receberá instrução SQL
            String sql;

            /* Montando a instrução INSERT para inserir
             um objeto fun no Banco MySQL */
            sql = "insert into funcionario(idfuncionario,nome,cargo,filial,localizacao,idade,salario)"
                    + "values(null, '" + fun.getNome() + "', '" + fun.getCargo() + "', '" + fun.getFilial() + "','" + fun.getLocalizacao() + "'," + fun.getIdade() + "," + fun.getSalario() + ")";

            //Executando o sql
            stat.execute(sql);

        } catch (SQLException e) {
            throw new SQLException("Erro ao inserir funcionário!");
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método

    /**
     * @author Anderson Justo
     * @version 1.0 beta
     */
    public ArrayList<Funcionario> buscarFuncionario() throws SQLException {

        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;

            //Montando o sql            
            sql = "select * from funcionario";

            /* Executando o SQL  e armazenando
             o ResultSet em um objeto do tipo
             ResultSet chamado rs */
            ResultSet rs = stat.executeQuery(sql);

            /* Criando ArrayList para armazenar 
             objetos do tipo cliente */
            ArrayList<Funcionario> func = new ArrayList<>();

            /* Enquanto houver uma próxima linha no 
             banco de dados o while roda */
            while (rs.next()) {
                //Criando um novo obj. funcionario
                Funcionario f = new Funcionario();

                /* Mapeando a tabela do banco para objeto
                 chamado fun */
                f.setIdfuncionario(rs.getLong("idfuncionario"));
                f.setNome(rs.getString("nome"));
                f.setCargo(rs.getString("cargo"));
                f.setFilial(rs.getString("filial"));
                f.setLocalizacao(rs.getString("localizacao"));
                f.setIdade(rs.getInt("idade"));
                f.setSalario(rs.getDouble("salario"));

                /* Inserindo o objeto fun no ArrayList */
                func.add(f);
            }//fecha while

            //Retornando o ArrayList com todos objetos
            return func;

        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar funcionário! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método

    public ArrayList<Funcionario> filtrarFuncionario(String query) throws SQLException {

        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;

            //Montando o sql            
            sql = "select * from funcionario " + query;

            /* Executando o SQL  e armazenando
             o ResultSet em um objeto do tipo
             ResultSet chamado rs */
            ResultSet rs = stat.executeQuery(sql);

            /* Criando ArrayList para armazenar 
             objetos do tipo produto */
            ArrayList<Funcionario> func = new ArrayList<>();

            /* Enquanto houver uma próxima linha no 
             banco de dados o while roda */
            while (rs.next()) {
                //Criando um novo obj. cliente
                Funcionario f = new Funcionario();

                /* Mapeando a tabela do banco para objeto
                 chamado fun */
                f.setIdfuncionario(rs.getLong("idfuncionario"));
                f.setNome(rs.getString("nome"));
                f.setCargo(rs.getString("cargo"));
                f.setFilial(rs.getString("filial"));
                f.setLocalizacao(rs.getString("localizacao"));
                f.setIdade(rs.getInt("idade"));
                f.setSalario(rs.getDouble("salario"));

                /* Inserindo o objeto fun no ArrayList */
                func.add(f);
            }//fecha while

            //Retornando o ArrayList com todos objetos
            return func;

        } catch (SQLException e) {
            throw new SQLException("Erro ao filtrar funcionário! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método

    public void deletarFuncionario(long id) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        /*Criando obj. capaz de executar instruções
         SQL no banco de dados*/
        Statement stat = con.createStatement();

        try {
            String sql = "";
            sql = "delete from funcionario where idfuncionario = " + id;
            stat.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao excluir!" + e.getMessage());
        } finally {
            stat.close();
            con.close();
        }
    }//fecha metodo

    public void alterarFuncionario(Funcionario f) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;

            sql = "update funcionario set "
                    + "nome = '" + f.getNome() + "',"
                    + "cargo = '" + f.getCargo() + "',"
                    + "filial = '" + f.getFilial() + "',"
                    + "localizacao = '" + f.getLocalizacao() + "',"
                    + "idade = " + f.getIdade() + ","
                    + "salario = " + f.getSalario() + " "
                    + "where idfuncionario = " + f.getIdfuncionario() + " ";

            stat.executeUpdate(sql);

        } catch (SQLException e) {
            throw new SQLException("Erro ao alterar funcionário! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }
}//fecha classe
