/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author henrique Peixoto
 * @since 07/07/2017 15:12
 * @version 1.0 Dori me
 */
public class Cliente {

    private long idcliente;
    private double pagamento;//pagamento na hora em que for comprar algo
    private int quantidadeComprada;//quantos instrumentos ele comprou
    private String localizacao;
    private String nome;
    private String sexo;//Esse pode ser o radio button 
    private String cpf;

    /**
     * @author Henrique Peixoto
     * @return construtor vazio
     */
    public Cliente() {
    }

    /**
     * @author Henrique Peixoto
     * @param idcliente retorna o id do cliente
     * @param pagamento retorna o valor do pagamento
     * @param quantidadeComprada retorna a quantidade de intrumentos comprados
     * @param localizacao localização do cliente
     * @param nome nome do cliente
     * @param instrumentoComprado qal o tipo de instrumento comprado violão,
     * guitarra..
     * @param cpf retirna o cpf do cliente
     */
    public Cliente(long idcliente, double pagamento, int quantidadeComprada, String localizacao, String nome, String sexo, String cpf) {
        this.idcliente = idcliente;
        this.pagamento = pagamento;
        this.quantidadeComprada = quantidadeComprada;
        this.localizacao = localizacao;
        this.nome = nome;
        this.sexo = sexo;
        this.cpf = cpf;
    }

    /**
     *
     * @return metodos getters e setters
     */
    public long getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(long idcliente) {
        this.idcliente = idcliente;
    }

    public double getPagamento() {
        return pagamento;
    }

    public void setPagamento(double pagamento) {
        this.pagamento = pagamento;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     *
     * @return toString com retorno de dados
     */
    @Override
    public String toString() {
        return "Cliente{" + "idcliente=" + idcliente + ", pagamento=" + pagamento + ", quantidadeComprada=" + quantidadeComprada + ", localizacao=" + localizacao + ", nome=" + nome + ", Sexo=" + sexo + ", cpf=" + cpf + '}';
    }

}
