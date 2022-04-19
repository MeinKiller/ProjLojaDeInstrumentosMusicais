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
import modelo.Instrumento;
import persistencia.ConexaoBanco;

/**
 * @author Anderson Justo
 * @version 1.0 beta
 */
public class InstrumentoDAO {

    /**
     * @author Anderson Justo
     * @version 1.0 beta
     */
    public void cadastrarInstrumento(Instrumento ins) throws SQLException {

        //Buscando uma conexão com o Banco de Dados
        Connection con = ConexaoBanco.getConexao();
        /*Criando obj. capaz de executar instruções
         SQL no banco de dados*/
        Statement stat = con.createStatement();

        try {
            //String que receberá instrução SQL
            String sql;

            /* Montando a instrução INSERT para inserir
             um objeto pVO no Banco MySQL */
            sql = "insert into instrumento(idinstrumento,nome,preco,quantidade,marca,instrumento,cor)"
                    + "values(null, '" + ins.getNome() + "', " + ins.getPreco() + ", " + ins.getQuantidade() + ",'" + ins.getMarca() + "','" + ins.getQualInstrumento() + "','" + ins.getCor() + "')";

            //Executando o sql
            stat.execute(sql);

        } catch (SQLException e) {
            throw new SQLException("Erro ao cadastrar instrumento!");
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método

    /**
     * @author Anderson Justo
     * @version 1.0 beta
     */
    public ArrayList<Instrumento> buscarInstrumento() throws SQLException {

        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;

            //Montando o sql            
            sql = "select * from instrumento";

            /* Executando o SQL  e armazenando
             o ResultSet em um objeto do tipo
             ResultSet chamado rs */
            ResultSet rs = stat.executeQuery(sql);

            /* Criando ArrayList para armazenar 
             objetos do tipo produto */
            ArrayList<Instrumento> instr = new ArrayList<>();

            /* Enquanto houver uma próxima linha no 
             banco de dados o while roda */
            while (rs.next()) {
                //Criando um novo obj. instrumento
                Instrumento i = new Instrumento();

                /* Mapeando a tabela do banco para objeto
                 chamado ins */
                i.setIdinstrumento(rs.getLong("idinstrumento"));
                i.setNome(rs.getString("nome"));
                i.setPreco(rs.getDouble("preco"));
                i.setQuantidade(rs.getInt("quantidade"));
                i.setMarca(rs.getString("marca"));
                i.setQualInstrumento(rs.getString("instrumento"));
                i.setCor(rs.getString("cor"));

                /* Inserindo o objeto ins no ArrayList */
                instr.add(i);
            }//fecha while

            //Retornando o ArrayList com todos objetos
            return instr;

        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar instrumentos! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método

    public ArrayList<Instrumento> filtrarInstrumento(String query) throws SQLException {

        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;

            //Montando o sql            
            sql = "select * from instrumento " + query;

            /* Executando o SQL  e armazenando
             o ResultSet em um objeto do tipo
             ResultSet chamado rs */
            ResultSet rs = stat.executeQuery(sql);

            /* Criando ArrayList para armazenar 
             objetos do tipo produto */
            ArrayList<Instrumento> instr = new ArrayList<>();

            /* Enquanto houver uma próxima linha no 
             banco de dados o while roda */
            while (rs.next()) {
                //Criando um novo obj. ProdutoVO
                Instrumento i = new Instrumento();

                /* Mapeando a tabela do banco para objeto
                 chamado pVO */
                i.setIdinstrumento(rs.getLong("idinstrumento"));
                i.setNome(rs.getString("nome"));
                i.setPreco(rs.getDouble("preco"));
                i.setQuantidade(rs.getInt("quantidade"));
                i.setMarca(("marca"));
                i.setQualInstrumento(rs.getString("instrumento"));
                i.setCor(rs.getString("cor"));

                /* Inserindo o objeto ins no ArrayList */
                instr.add(i);
            }//fecha while

            //Retornando o ArrayList com todos objetos
            return instr;

        } catch (SQLException e) {
            throw new SQLException("Erro ao filtrar instrumentos! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método

    public void deletarInstrumento(long id) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        /*Criando obj. capaz de executar instruções
         SQL no banco de dados*/
        Statement stat = con.createStatement();

        try {
            String sql = "";
            sql = "delete from instrumento where idinstrumento = " + id;
            stat.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao excluir!" + e.getMessage());
        } finally {
            stat.close();
            con.close();
        }
    }//fecha metodo
    public void alterarInstrumento(Instrumento i) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;

            sql = "update instrumento set "
                    + "nome = '" + i.getNome() + "',"
                    + "preco = " + i.getPreco()+ ","
                    + "quantidade = " + i.getQuantidade()+ ","
                    + "marca = '" + i.getMarca()+ "',"
                    + "instrumento = '" + i.getQualInstrumento()+ "',"
                    + "cor = '" + i.getCor()+ "' "
                    + "where idinstrumento = " + i.getIdinstrumento()+ " ";
            
         

            stat.executeUpdate(sql);

        } catch (SQLException e) {
            throw new SQLException("Erro ao alterar instrumento! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }
}//fecha classe
