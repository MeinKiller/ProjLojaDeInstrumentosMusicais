/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Henrique Peixoto
 * @since 07/07/2017 14:43
 * @version 1.0 latiremo
 */
public class Funcionario {

    private long idfuncionario;
    private double salario;
    private int idade;
    private String localizacao;
    private String nome;
    private String cargo;//Esse pode ser o radio button com o cargo vendedor, gerente, estoquista...
    private String filial;

    /**
     * @author Henrique Peixoto
     * @returno construtor vazio
     */
    public Funcionario() {
    }

    /**
     * @author Henrique Peixoto
     * @return construtor cheio
     * @param idfuncionario retorna o id do funcionário
     * @param salario retorna o salário do funcionário
     * @param idade retorna a idade do funcionário
     * @param localizacao retorna o local onde mora o funcionário
     * @param nome retorna o nome do funcionário
     * @param cargo retorna o cargo que o funcionário desempenha na empresa
     * @param filial retorna a filial na qual trabalha o funcionário
     */
    public Funcionario(long idfuncionario, double salario, int idade, String localizacao, String nome, String cargo, String filial) {
        this.idfuncionario = idfuncionario;
        this.salario = salario;
        this.idade = idade;
        this.localizacao = localizacao;
        this.nome = nome;
        this.cargo = cargo;
        this.filial = filial;
    }

    /**
     * @author Henrique Peixoto
     * @return getters e setters para a atribuição e retorno de valores
     */
    public long getIdfuncionario() {
        return idfuncionario;
    }

    public void setIdfuncionario(long idfuncionario) {
        this.idfuncionario = idfuncionario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFilial() {
        return filial;
    }

    public void setFilial(String filial) {
        this.filial = filial;
    }

    /**
     * @author Henrique Peixoto
     * @return toString que retorna os dados
     */
    @Override
    public String toString() {
        return "Funcionario{" + "idfuncionario=" + idfuncionario + ", salario=" + salario + ", idade=" + idade + ", localizacao=" + localizacao + ", nome=" + nome + ", cargo=" + cargo + ", filial=" + filial + '}';
    }

}
