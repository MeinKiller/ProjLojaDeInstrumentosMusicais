/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Instrumento;
import servicos.InstrumentoServicos;
import servicos.ServicosFactory;

/**
 *
 * @author Anderson Justo
 * @since 12/07/17 - 16:37
 * @version 1.0 Batatinha
 */
public class UIManutencaoInstrumento extends javax.swing.JInternalFrame {

    Instrumento ins = new Instrumento();
    DefaultTableModel dtm = new DefaultTableModel(
            new Object[][]{},
            new Object[]{"Código", "Nome", "Preço", "Quantidade", "Marca", "Instrumento", "Cor"});

    /**
     * Creates new form UIManutencaoInstrumento
     */
    public UIManutencaoInstrumento() {
        initComponents();
        jtPesquisa.grabFocus();
        preencherTabela();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jtPesquisa = new javax.swing.JTextField();
        jcomboFiltro = new javax.swing.JComboBox<>();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableInstrumento = new javax.swing.JTable();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jbPreencher = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jbDeletar = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        jlCodigo = new javax.swing.JLabel();
        jlNome = new javax.swing.JLabel();
        jlPreco = new javax.swing.JLabel();
        jlQtd = new javax.swing.JLabel();
        jlInstrumento = new javax.swing.JLabel();
        jlMarca = new javax.swing.JLabel();
        jlCor = new javax.swing.JLabel();
        jtCodigo = new javax.swing.JTextField();
        jtNome = new javax.swing.JTextField();
        jtPreco = new javax.swing.JTextField();
        jtQtd = new javax.swing.JTextField();
        jtInstrumento = new javax.swing.JTextField();
        jtMarca = new javax.swing.JTextField();
        jtCor = new javax.swing.JTextField();
        jbConfirmarAltecacao = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Manutenção Instrumento");

        jLayeredPane1.setBorder(new javax.swing.border.SoftBevelBorder(0));

        jtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPesquisaKeyReleased(evt);
            }
        });

        jcomboFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Nome", "Preço", "Quantidade", "Marca", "Instrumento", "Cor" }));
        jcomboFiltro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcomboFiltroItemStateChanged(evt);
            }
        });

        jLayeredPane1.setLayer(jtPesquisa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jcomboFiltro, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jcomboFiltro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(83, 83, 83))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcomboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jLayeredPane2.setBorder(new javax.swing.border.SoftBevelBorder(0));

        jtableInstrumento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Preço", "Quantidade", "Marca", "Instrumento", "Cor"
            }
        ));
        jtableInstrumento.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtableInstrumento);

        jLayeredPane2.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
                .addContainerGap())
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLayeredPane3.setBorder(new javax.swing.border.SoftBevelBorder(0));

        jbPreencher.setText("Preencher");
        jbPreencher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPreencherActionPerformed(evt);
            }
        });

        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        jbDeletar.setText("Deletar");
        jbDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeletarActionPerformed(evt);
            }
        });

        jbAlterar.setText("Alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jLayeredPane3.setLayer(jbPreencher, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jbLimpar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jbDeletar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jbAlterar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jbPreencher, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jbDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jbAlterar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jbPreencher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addComponent(jbAlterar))
        );

        jLayeredPane4.setBorder(new javax.swing.border.SoftBevelBorder(0));

        jlCodigo.setText("Código");

        jlNome.setText("Nome");

        jlPreco.setText("Preço");

        jlQtd.setText("Quantidade");

        jlInstrumento.setText("Instrumento");

        jlMarca.setText("Marca");

        jlCor.setText("Cor");

        jtCodigo.setEditable(false);

        jtInstrumento.setEditable(false);

        jbConfirmarAltecacao.setText("Confirmar Alteração");
        jbConfirmarAltecacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarAltecacaoActionPerformed(evt);
            }
        });

        jLayeredPane4.setLayer(jlCodigo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jlNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jlPreco, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jlQtd, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jlInstrumento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jlMarca, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jlCor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jtCodigo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jtNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jtPreco, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jtQtd, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jtInstrumento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jtMarca, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jtCor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jbConfirmarAltecacao, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane4Layout = new javax.swing.GroupLayout(jLayeredPane4);
        jLayeredPane4.setLayout(jLayeredPane4Layout);
        jLayeredPane4Layout.setHorizontalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane4Layout.createSequentialGroup()
                        .addComponent(jlCor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtCor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbConfirmarAltecacao, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jLayeredPane4Layout.createSequentialGroup()
                        .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jLayeredPane4Layout.createSequentialGroup()
                                    .addComponent(jlPreco)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jLayeredPane4Layout.createSequentialGroup()
                                    .addComponent(jlCodigo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                                .addComponent(jlMarca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                                .addComponent(jlNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                                .addComponent(jlQtd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                                .addComponent(jlInstrumento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtInstrumento, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(32, Short.MAX_VALUE))))
        );
        jLayeredPane4Layout.setVerticalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCodigo)
                    .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNome)
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlPreco)
                        .addComponent(jtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jlQtd, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jtQtd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlInstrumento)
                    .addComponent(jtInstrumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlMarca)
                    .addComponent(jtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCor)
                    .addComponent(jtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbConfirmarAltecacao)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane2)
                    .addComponent(jLayeredPane3)
                    .addComponent(jLayeredPane4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void preencherTabela() {
        try {

            //Buscando objeto ProdutoServicos     
            InstrumentoServicos is = ServicosFactory.getInstrumentoServicos();

            /* Criando um ArrayList<ProdutoVO> vazio
             para receber o ArrayList com os dados */
            ArrayList<Instrumento> in = new ArrayList<>();

            //Recebendo o ArrayList cheio em produtos
            in = is.buscarInstrumentos();

            for (int i = 0; i < in.size(); i++) {
                dtm.addRow(new String[]{
                    String.valueOf(in.get(i).getIdinstrumento()),
                    String.valueOf(in.get(i).getNome()),
                    String.valueOf(in.get(i).getPreco()),
                    String.valueOf(in.get(i).getQuantidade()),
                    String.valueOf(in.get(i).getMarca()),
                    String.valueOf(in.get(i).getQualInstrumento()),
                    String.valueOf(in.get(i).getCor())});
            }//fecha for

            /* Adicionando o modelo de tabela 
             com os dados na tabela produto */
            jtableInstrumento.setModel(dtm);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Erro! " + e.getMessage());
        }//fecha catch
    }//fecha preencherTabela

    private void limparTabela() {
        /* Para limpar a tabela temos que setar o número de
           linhas para zero no default table model */
        dtm.setNumRows(0);
    }//fecha limparTabela

    private void deletar() {
        try {
            int linha = jtableInstrumento.getSelectedRow();

            if (linha == -1) {
                JOptionPane.showMessageDialog(rootPane, "Selecione uma linha para excluir!");
            } else {
                InstrumentoServicos is = servicos.ServicosFactory.getInstrumentoServicos();
                String id = jtableInstrumento.getValueAt(linha, 0).toString();
                is.deletarInstrumento(Long.parseLong(id));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Erro" + e.getMessage());
        }
    }//Fecha método deletar

    private void filtrar() {
        try {
            if (jtPesquisa.getText().isEmpty()) {
                preencherTabela();
            } else {
                String filtro = jcomboFiltro.getSelectedItem().toString();

                String query = "";
                if (filtro.equalsIgnoreCase("Nome")) {
                    query = "where nome like '%" + jtPesquisa.getText() + "%'";
                } else if (filtro.equalsIgnoreCase("Código")) {
                    query = "where idinstrumento like '%" + jtPesquisa.getText() + "%'";
                } else if (filtro.equalsIgnoreCase("Preço")) {
                    query = "where preco like '%" + jtPesquisa.getText() + "%'";
                } else if (filtro.equalsIgnoreCase("Quantidade")) {
                    query = "where quantidade like '%" + jtPesquisa.getText() + "%'";
                } else if (filtro.equalsIgnoreCase("Marca")) {
                    query = "where marca like '%" + jtPesquisa.getText() + "%'";
                } else if (filtro.equalsIgnoreCase("Instrumento")) {
                    query = "where instrumento like '%" + jtPesquisa.getText() + "%'";
                } else if (filtro.equalsIgnoreCase("Cor")) {
                    query = "where cor like '%" + jtPesquisa.getText() + "%'";

                }
                //query = "where cpf like '%" + jtPesquisa.getText() + "%'";
                
                InstrumentoServicos in = ServicosFactory.getInstrumentoServicos();
                ArrayList<Instrumento> ins = new ArrayList<>();
                ins = in.filtrarIsntrumento(query);
                for (int i = 0; i < ins.size(); i++) {
                    dtm.addRow(new String[]{
                        String.valueOf(ins.get(i).getIdinstrumento()),
                        String.valueOf(ins.get(i).getNome()),
                        String.valueOf(ins.get(i).getPreco()),
                        String.valueOf(ins.get(i).getQuantidade()),
                        String.valueOf(ins.get(i).getMarca()),
                        String.valueOf(ins.get(i).getQualInstrumento()),
                        String.valueOf(ins.get(i).getCor())});
                }//fecha for

                /* Adicionando o modelo de tabela 
             com os dados na tabela produto */
                jtableInstrumento.setModel(dtm);

            }//fecha else
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    rootPane,
                    "Erro!" + e.getMessage());
        }//Fecha catch
    }//Fecha método filtrar
    
     public void alterar() {
        int linha = jtableInstrumento.getSelectedRow();
        if (linha != -1) {
            jtCodigo.setText((String) jtableInstrumento.getValueAt(linha, 0));
            jtNome.setText((String) jtableInstrumento.getValueAt(linha, 1));
            jtPreco.setText((String) jtableInstrumento.getValueAt(linha, 2));
            jtQtd.setText((String) jtableInstrumento.getValueAt(linha, 3));
            jtMarca.setText((String) jtableInstrumento.getValueAt(linha, 4));
            jtInstrumento.setText((String) jtableInstrumento.getValueAt(linha, 5));
            jtCor.setText((String) jtableInstrumento.getValueAt(linha, 6));
        } else {
            JOptionPane.showMessageDialog(this, "Você não selecionou nenhuma linha");
        }
    }

    public void confirmarAlteracao() {
        try {   
            Instrumento i = new Instrumento();

            i.setIdinstrumento(Long.parseLong(jtCodigo.getText()));
            i.setNome(jtNome.getText());
            i.setPreco(Double.parseDouble(jtPreco.getText()));
            i.setQuantidade(Integer.parseInt(jtQtd.getText()));
            i.setMarca(jtMarca.getText());
            i.setQualInstrumento(jtInstrumento.getText());
            i.setCor(jtCor.getText());

            InstrumentoServicos is = ServicosFactory.getInstrumentoServicos();

            is.alterarInstrumento(i);

            JOptionPane.showMessageDialog(this, "Instrumento alterado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro, " + e.getMessage());
        }//fecha catch

    }//Fecha método

    private void jtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPesquisaKeyReleased
        // TODO add your handling code here:
        limparTabela();
        filtrar();
    }//GEN-LAST:event_jtPesquisaKeyReleased

    private void jcomboFiltroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcomboFiltroItemStateChanged
        // TODO add your handling code here:
        limparTabela();
        filtrar();
    }//GEN-LAST:event_jcomboFiltroItemStateChanged

    private void jbPreencherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPreencherActionPerformed
        // TODO add your handling code here:
        limparTabela();
        preencherTabela();
    }//GEN-LAST:event_jbPreencherActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        // TODO add your handling code here:
        limparTabela();
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jbDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeletarActionPerformed
        // TODO add your handling code here:
        deletar();
        limparTabela();
        preencherTabela();
    }//GEN-LAST:event_jbDeletarActionPerformed

    private void jbConfirmarAltecacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarAltecacaoActionPerformed
        // TODO add your handling code here:
        confirmarAlteracao();
        limparTabela();
        preencherTabela();
    }//GEN-LAST:event_jbConfirmarAltecacaoActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        // TODO add your handling code here:
        alterar();
    }//GEN-LAST:event_jbAlterarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbConfirmarAltecacao;
    private javax.swing.JButton jbDeletar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbPreencher;
    private javax.swing.JComboBox<String> jcomboFiltro;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JLabel jlCor;
    private javax.swing.JLabel jlInstrumento;
    private javax.swing.JLabel jlMarca;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlPreco;
    private javax.swing.JLabel jlQtd;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtCor;
    private javax.swing.JTextField jtInstrumento;
    private javax.swing.JTextField jtMarca;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtPesquisa;
    private javax.swing.JTextField jtPreco;
    private javax.swing.JTextField jtQtd;
    private javax.swing.JTable jtableInstrumento;
    // End of variables declaration//GEN-END:variables
}