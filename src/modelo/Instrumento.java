/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Henrique Peixoto
 * @since 07/07/2017 14:30
 * @version 1.0 ameno
 */
public class Instrumento {

    private long idinstrumento;
    private String nome;
    private double preco;
    private int quantidade;
    private String qualInstrumento; //esse pode ser radio button. EX: violão,guitarra,bateria...
    private String marca;
    private String cor;

    /**
     * @return construtor vazio
     */
    public Instrumento() {
    }

    /**
     * @return construtor cheio
     * @param idinstrumento retorna o id do instrumento
     * @param nome retorna o nome do instrumento
     * @param preco retorna o preço do instrumento
     * @param quantidade retorna a quantidade do instrumento
     * @param tipo retorna o tipo do instrumento(corda, percussão, sopro...)
     * @param marca retorna a marcca do instrumento
     * @param cor retorna a cor do instrumento
     */
    public Instrumento(long idinstrumento, String nome, double preco, int quantidade, String qualInstrumento, String marca, String cor) {
        this.idinstrumento = idinstrumento;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.qualInstrumento = qualInstrumento;
        this.marca = marca;
        this.cor = cor;
    }

    /**
     *
     * @return métodos getters e setters para a atribuição e retorno de valores
     */
    public long getIdinstrumento() {
        return idinstrumento;
    }

    public void setIdinstrumento(long idinstrumento) {
        this.idinstrumento = idinstrumento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getQualInstrumento() {
        return qualInstrumento;
    }

    public void setQualInstrumento(String qualInstrumento) {
        this.qualInstrumento = qualInstrumento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     *
     * @return toString com o retorna das informações
     */
    @Override
    public String toString() {
        return "Instrumento{" + "idinstrumento=" + idinstrumento + ", nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + ", qualinstrumento=" + qualInstrumento + ", marca=" + marca + ", cor=" + cor + '}';
    }

}
