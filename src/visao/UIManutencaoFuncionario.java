/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Funcionario;
import servicos.FuncionarioServicos;
import servicos.ServicosFactory;

/**
 *
 * @author Anderson Justo
 * @since 13/7/17 - 14:10
 * @version 1.0 beta
 */
public class UIManutencaoFuncionario extends javax.swing.JInternalFrame {

    Funcionario fun = new Funcionario();
    DefaultTableModel dtm = new DefaultTableModel(
            new Object[][]{},
            new Object[]{"Código", "Nome", "Cargo", "Filial", "Localização", "Idade", "Salário"});

    /**
     * Creates new form UIManutencaoFuncionario
     */
    public UIManutencaoFuncionario() {
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
        jtableFuncionario = new javax.swing.JTable();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        jlCodigo = new javax.swing.JLabel();
        jlNome = new javax.swing.JLabel();
        jlCargo = new javax.swing.JLabel();
        jlFilial = new javax.swing.JLabel();
        jlLocal = new javax.swing.JLabel();
        jlIdade = new javax.swing.JLabel();
        jlSalario = new javax.swing.JLabel();
        jtCodigo = new javax.swing.JTextField();
        jtNome = new javax.swing.JTextField();
        jtCargo = new javax.swing.JTextField();
        jtFilial = new javax.swing.JTextField();
        jtLocal = new javax.swing.JTextField();
        jtIdade = new javax.swing.JTextField();
        jtSalario = new javax.swing.JTextField();
        jbConfirmarAltecacao = new javax.swing.JButton();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jbPreencher = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jbDeletar = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Manutenção Funcionário");

        jLayeredPane1.setBorder(new javax.swing.border.SoftBevelBorder(0));

        jtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPesquisaKeyReleased(evt);
            }
        });

        jcomboFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Nome", "Cargo", "Filial", "Localização", "Idade", "Salário" }));
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

        jtableFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Cargo", "Filial", "Localização", "Idade", "Salário"
            }
        ));
        jtableFuncionario.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtableFuncionario);

        jLayeredPane4.setBorder(new javax.swing.border.SoftBevelBorder(0));

        jlCodigo.setText("Código");

        jlNome.setText("Nome");

        jlCargo.setText("Cargo");

        jlFilial.setText("Filial");

        jlLocal.setText("Localização");

        jlIdade.setText("Idade");

        jlSalario.setText("Salário");

        jtCodigo.setEditable(false);

        jtCargo.setEditable(false);

        jbConfirmarAltecacao.setText("Confirmar Alteração");
        jbConfirmarAltecacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarAltecacaoActionPerformed(evt);
            }
        });

        jLayeredPane4.setLayer(jlCodigo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jlNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jlCargo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jlFilial, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jlLocal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jlIdade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jlSalario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jtCodigo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jtNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jtCargo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jtFilial, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jtLocal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jtIdade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jtSalario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jbConfirmarAltecacao, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane4Layout = new javax.swing.GroupLayout(jLayeredPane4);
        jLayeredPane4.setLayout(jLayeredPane4Layout);
        jLayeredPane4Layout.setHorizontalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane4Layout.createSequentialGroup()
                        .addComponent(jlSalario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbConfirmarAltecacao, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jLayeredPane4Layout.createSequentialGroup()
                        .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jLayeredPane4Layout.createSequentialGroup()
                                    .addComponent(jlCargo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jLayeredPane4Layout.createSequentialGroup()
                                    .addComponent(jlCodigo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                                .addComponent(jlIdade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                                .addComponent(jlNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                                .addComponent(jlFilial)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtFilial, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                                .addComponent(jlLocal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                        .addComponent(jlCargo)
                        .addComponent(jtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jlFilial, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jtFilial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlLocal)
                    .addComponent(jtLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlIdade)
                    .addComponent(jtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSalario)
                    .addComponent(jtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbConfirmarAltecacao)))
        );

        jLayeredPane2.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLayeredPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jLayeredPane4))
                .addContainerGap())
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(50, 50, 50)
                .addComponent(jbPreencher, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jbDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane2)
                    .addComponent(jLayeredPane3))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void preencherTabela() {
        try {

            //Buscando objeto ProdutoServicos     
            FuncionarioServicos fus = ServicosFactory.getFuncionarioServicos();

            /* Criando um ArrayList<ProdutoVO> vazio
             para receber o ArrayList com os dados */
            ArrayList<Funcionario> af = new ArrayList<>();

            //Recebendo o ArrayList cheio em produtos
            af = fus.buscarFuncionario();

            for (int i = 0; i < af.size(); i++) {
                dtm.addRow(new String[]{
                    String.valueOf(af.get(i).getIdfuncionario()),
                    String.valueOf(af.get(i).getNome()),
                    String.valueOf(af.get(i).getCargo()),
                    String.valueOf(af.get(i).getFilial()),
                    String.valueOf(af.get(i).getLocalizacao()),
                    String.valueOf(af.get(i).getIdade()),
                    String.valueOf(af.get(i).getSalario())});
            }//fecha for

            /* Adicionando o modelo de tabela 
             com os dados na tabela produto */
            jtableFuncionario.setModel(dtm);

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
            int linha = jtableFuncionario.getSelectedRow();

            if (linha == -1) {
                JOptionPane.showMessageDialog(rootPane, "Selecione uma linha para excluir!");
            } else {
                FuncionarioServicos fu = servicos.ServicosFactory.getFuncionarioServicos();
                String id = jtableFuncionario.getValueAt(linha, 0).toString();
                fu.deletarFuncionario(Long.parseLong(id));
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
                    query = "where idfuncionario like '%" + jtPesquisa.getText() + "%'";
                } else if (filtro.equalsIgnoreCase("Cargo")) {
                    query = "where cargo like '%" + jtPesquisa.getText() + "%'";
                } else if (filtro.equalsIgnoreCase("Filial")) {
                    query = "where filial like '%" + jtPesquisa.getText() + "%'";
                } else if (filtro.equalsIgnoreCase("Localização")) {
                    query = "where localizacao like '%" + jtPesquisa.getText() + "%'";
                } else if (filtro.equalsIgnoreCase("Idade")) {
                    query = "where idade like '%" + jtPesquisa.getText() + "%'";
                } else if (filtro.equalsIgnoreCase("Salário")) {
                    query = "where salario like '%" + jtPesquisa.getText() + "%'";

                }
                //query = "where cpf like '%" + jtPesquisa.getText() + "%'";

                FuncionarioServicos fu = ServicosFactory.getFuncionarioServicos();
                ArrayList<Funcionario> af = new ArrayList<>();
                af = fu.filtrarFuncionario(query);
                for (int i = 0; i < af.size(); i++) {
                    dtm.addRow(new String[]{
                        String.valueOf(af.get(i).getIdfuncionario()),
                        String.valueOf(af.get(i).getNome()),
                        String.valueOf(af.get(i).getCargo()),
                        String.valueOf(af.get(i).getFilial()),
                        String.valueOf(af.get(i).getLocalizacao()),
                        String.valueOf(af.get(i).getIdade()),
                        String.valueOf(af.get(i).getSalario())});
                }//fecha for

                /* Adicionando o modelo de tabela 
             com os dados na tabela produto */
                jtableFuncionario.setModel(dtm);

            }//fecha else
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    rootPane,
                    "Erro!" + e.getMessage());
        }//Fecha catch
    }//Fecha método filtrar
     public void alterar() {
        int linha = jtableFuncionario.getSelectedRow();
        if (linha != -1) {
            jtCodigo.setText((String) jtableFuncionario.getValueAt(linha, 0));
            jtNome.setText((String) jtableFuncionario.getValueAt(linha, 1));
            jtCargo.setText((String) jtableFuncionario.getValueAt(linha, 2));
            jtFilial.setText((String) jtableFuncionario.getValueAt(linha, 3));
            jtLocal.setText((String) jtableFuncionario.getValueAt(linha, 4));
            jtIdade.setText((String) jtableFuncionario.getValueAt(linha, 5));
            jtSalario.setText((String) jtableFuncionario.getValueAt(linha, 6));
        } else {
            JOptionPane.showMessageDialog(this, "Você não selecionou nenhuma linha");
        }
    }

    public void confirmarAlteracao() {
        try {   
            Funcionario f = new Funcionario();

            f.setIdfuncionario(Long.parseLong(jtCodigo.getText()));
            f.setNome(jtNome.getText());
            f.setCargo(jtCargo.getText());
            f.setFilial(jtFilial.getText());
            f.setLocalizacao(jtLocal.getText());
            f.setIdade(Integer.parseInt(jtIdade.getText()));
            f.setSalario(Double.parseDouble(jtSalario.getText()));

            FuncionarioServicos fs = ServicosFactory.getFuncionarioServicos();

            fs.alterarFuncionario(f);

            JOptionPane.showMessageDialog(this, "Funcionário alterado com sucesso!");
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
    private javax.swing.JLabel jlCargo;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JLabel jlFilial;
    private javax.swing.JLabel jlIdade;
    private javax.swing.JLabel jlLocal;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlSalario;
    private javax.swing.JTextField jtCargo;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtFilial;
    private javax.swing.JTextField jtIdade;
    private javax.swing.JTextField jtLocal;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtPesquisa;
    private javax.swing.JTextField jtSalario;
    private javax.swing.JTable jtableFuncionario;
    // End of variables declaration//GEN-END:variables
}
