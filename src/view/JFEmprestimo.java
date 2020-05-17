package view;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import controller.BdAluno;
import controller.BdEmprestimo;
import controller.BdLivro;
import model.Aluno;
import model.Emprestimo;
import model.Livro;

public class JFEmprestimo extends javax.swing.JFrame {

    private JFPrincipal telaPrincipal;
    boolean verifica = false;

    /**
     * Creates new form Aluno
     */
    public JFEmprestimo() {
        initComponents();
        verifica = true;
        // Desabilita os campos ao iniciar a janela
        desabilitaCamposEmprestimo();

        // Mostra a data atual como data do empréstimo        
        dataEmprestimo();
        // Mostra a data atual como data do empréstimo        
        mostraDataDevolucao();
    }

    // Construtor que recebe a instância da tela principal
    JFEmprestimo(JFPrincipal telaPrincipal) {

        this();
        this.telaPrincipal = telaPrincipal;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGPesquisa = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtRm = new javax.swing.JTextField();
        txtLivro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDataDevolucao = new javax.swing.JTextField();
        txtDataEmprestimo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        txtPesquisar = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEmprestimo = new javax.swing.JTable();
        selectAluno = new javax.swing.JRadioButton();
        selectLivro = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableLivro = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableAluno = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnDevolver = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Empréstimos");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Empréstimos"));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("RM do aluno:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("ID do livro: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Data do emprestimo:(dd/mm/aa)");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Data de Devolução: (dd/mm/aa)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtLivro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                        .addComponent(txtRm, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtDataDevolucao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                        .addComponent(txtDataEmprestimo, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtRm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDataEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtDataDevolucao, txtDataEmprestimo, txtLivro, txtRm});

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar Empréstimos"));

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/procurar (1).png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisar.setFocusable(false);
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        jTableEmprestimo.setAutoCreateRowSorter(true);
        jTableEmprestimo.setModel(tmEmprestimo);
        jTableEmprestimo.getTableHeader().setReorderingAllowed(false);
        jTableEmprestimo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEmprestimoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEmprestimo);

        bGPesquisa.add(selectAluno);
        selectAluno.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        selectAluno.setText("Alunos");
        selectAluno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        bGPesquisa.add(selectLivro);
        selectLivro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        selectLivro.setText("Livros");
        selectLivro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Pesquisar por: ");

        jTableLivro.setModel(tmLivro);
        jTableLivro.getTableHeader().setReorderingAllowed(false);
        jTableLivro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableLivroMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableLivro);

        jTableAluno.setModel(tmAluno);
        jTableAluno.getTableHeader().setReorderingAllowed(false);
        jTableAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAlunoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableAluno);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Selecione o aluno abaixo: ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Selecione o livro abaixo: ");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Empréstimos: ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(selectAluno)
                                        .addGap(18, 18, 18)
                                        .addComponent(selectLivro))
                                    .addComponent(jLabel11))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectAluno)
                    .addComponent(selectLivro)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/novo-documento_1.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovo.setFocusable(false);
        btnNovo.setMargin(new java.awt.Insets(0, 0, 0, 23));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/seta.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.setFocusable(false);
        btnSair.setMargin(new java.awt.Insets(0, 0, 0, 23));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/emprestar.png"))); // NOI18N
        btnCadastrar.setText("Emprestar");
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar.setFocusable(false);
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnDevolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/devolver.png"))); // NOI18N
        btnDevolver.setText("Devolver");
        btnDevolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDevolver.setFocusable(false);
        btnDevolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDevolverMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDevolver, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDevolver)
                    .addComponent(btnCadastrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair)
                    .addComponent(btnNovo))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCadastrar, btnDevolver, btnNovo, btnSair});

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setText(" Preencha os campos \"aluno\" e \"livro\" clicando");

        jLabel10.setText("no registro,encontrado na área de pesquisa.");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel10)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(204, 255, 204));
        jPanel6.setPreferredSize(new java.awt.Dimension(0, 50));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 805, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Cadastro de Alunos");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // BOTÃO NOVO - Precionando
    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        limpaCamposEmprestimo();
        limpaTabelaEmprestimo();
        limpaTabelaAluno();
        limpaTabelaLivro();
    }//GEN-LAST:event_btnNovoActionPerformed

    // BOTÃO CADASTRAR - Precionando
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        try {
            cadastraRegistro();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao efetuar empréstimo.\n" + ex);
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    // BOTÃO PESQUISAR - Precionando
    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // Ao clicar em pesquisar, é executado o método que efetua a pesquisa, e outro método que exibe a lista da pesquisa

        if (!(selectAluno.isSelected() || selectLivro.isSelected())) {
            JOptionPane.showMessageDialog(rootPane, "Selecione um campo de pesquisa.");
        } else if (selectAluno.isSelected()) {
            // Quando seleciona PESQUISA ALUNO
            try {
                listaContatosAluno();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao efetuar empréstimo.\n" + ex);
            }
        } else if (selectLivro.isSelected()) {
            // Quando seleciona PESQUISA LIVROS
            try {
                listaContatosLivro();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "Problemas ao listar contatos.\n" + ex);
            }
        }

    }//GEN-LAST:event_btnPesquisarActionPerformed

    // TABELA EMPRÉSTIMO - Selecionando registro com o clique do mouse
    private void jTableEmprestimoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEmprestimoMouseClicked

    }//GEN-LAST:event_jTableEmprestimoMouseClicked

    // TABELA LIVRO - Selecionando registro com o clique do mouse
    private void jTableLivroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableLivroMouseClicked
        // Salva a posição da linha selecionada na tabela de pesquisa
        int linhaSelecionada = jTableLivro.getSelectedRow();

        txtLivro.setText(jTableLivro.getValueAt(linhaSelecionada, 0).toString());
    }//GEN-LAST:event_jTableLivroMouseClicked

    // TABELA ALUNO - Selecionando registro com o clique do mouse
    private void jTableAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAlunoMouseClicked
        // Salva a posição da linha selecionada na tabela de pesquisa
        int linhaSelecionada = jTableAluno.getSelectedRow();

        txtRm.setText(jTableAluno.getValueAt(linhaSelecionada, 0).toString());

        try {
            listaContatosEmprestimo();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao listar emprestimos.\n" + ex);
        }
    }//GEN-LAST:event_jTableAlunoMouseClicked

    // BOTÃO DEVOLVER
    private void btnDevolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDevolverMouseClicked
        try {
            devolveLivro();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao devolver livro.\n" + ex);
        } catch (ParseException ex) {
            Logger.getLogger(JFEmprestimo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDevolverMouseClicked

    // FECHANDO A JANELA
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

        // Habilita a tabela principal
        telaPrincipal.setEnabled(true);

    }//GEN-LAST:event_formWindowClosed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    /* ----CADASTRO-> */
    // MÉTODOS:
    // Método p/ cadastrar um registro no banco de dados.
    private void cadastraRegistro() throws SQLException {
        // Antes de cadastrar, verifica se o usuário está com algum registro selecionado
        if (!(jTableEmprestimo.getSelectedRow() != -1)) {
            // Antes de cadastrar, verifica se os campos foram preenchidos
            if (verificaDados()) {
                if (verificaDisponibilidadeLivro()) {
                    BdEmprestimo d = new BdEmprestimo();
                    try {
                        Emprestimo e = new Emprestimo();

                        e.setRm_aluno(Integer.valueOf(txtRm.getText()));
                        e.setId_livro(Integer.valueOf(txtLivro.getText()));
                        e.setData_emprestimo(salvaDataEmprestimo());
                        e.setData_devolucao(salvaDataDevolucao());

                        d = new BdEmprestimo();

                        d.adicionaEmprestimo(e);

                        alteraDisponibilidade("Emprestado");

                        JOptionPane.showMessageDialog(rootPane, "Empréstimo efetuado com sucesso.");
                        limpaCamposEmprestimo();

                        listaContatosEmprestimo();
                        listaContatosLivro();

                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(rootPane, "Erro ao efetuar empréstimo.\n" + ex);
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Para cadastrar selecione apenas os campos 'Aluno' e 'Livro.',\n\n"
                    + "Para fazer um novo empréstimo clique em 'Novo'.");
        }
    }

    // Método p/ validação do formulário
    private boolean verificaDados() {
        if ((!txtRm.getText().equals("")) && (!txtLivro.getText().equals(""))
                && (!txtDataEmprestimo.getText().equals(""))) {
            return true;
        }
        JOptionPane.showMessageDialog(rootPane, "Dados incompletos.");
        return false;
    }

    // Pega o campo disponibilidade do livro selecionado
    public String disponibilidadeLivro() {
        // Salva a posição da linha selecionada na tabela de pesquisa
        int linhaSelecionada = jTableLivro.getSelectedRow();
        String status = (String) jTableLivro.getValueAt(linhaSelecionada, 3);

        return status;
    }

    // Método p/ verifica se o livro está disponível
    private boolean verificaDisponibilidadeLivro() {
        if (!disponibilidadeLivro().equals("Emprestado")) {
            return true;
        }
        JOptionPane.showMessageDialog(rootPane, "Livro selecionado está indisponível.");
        return false;
    }

    /* <-CADASTRO---- */

 /* ----DATAS-> */
    // Exibe a data do empréstimo(data atual) no formulário
    private void dataEmprestimo() {
        Date data = new Date();

        SimpleDateFormat formataData = new SimpleDateFormat("dd/MMM/yyyy");
        String s = formataData.format(data);

        txtDataEmprestimo.setText(formataData.format(data));
    }

    // Retorna a data de empréstimo
    private String salvaDataEmprestimo() {
        Date data = new Date();

        SimpleDateFormat formataData = new SimpleDateFormat("yyyy-MM-dd");
        String dataEmprestimoFormatada = formataData.format(data);

        return dataEmprestimoFormatada;
    }

    // Exibe a data de devolução no formulário
    private void mostraDataDevolucao() {
        // Recebe a data do sistema
        Date dataDevolucao = new Date();
        // Adiciona + 7 à data atual
        dataDevolucao.setDate(dataDevolucao.getDate() + 7);

        // Formata a data recebida
        SimpleDateFormat formataData = new SimpleDateFormat("dd/MMM/yyyy");
        String dataDevolucaoFormatada = formataData.format(dataDevolucao);

        txtDataDevolucao.setText(dataDevolucaoFormatada);
    }

    // Retorna a data de devolução, pronta p/ ser salva no BD
    public String salvaDataDevolucao() {
        // Recebe a data do sistema
        Date dataDevolucao = new Date();
        // Adiciona + 7 à data atual
        dataDevolucao.setDate(dataDevolucao.getDate() + 7);

        // Formata a data recebida
        SimpleDateFormat formataData = new SimpleDateFormat("yyyy-MM-dd");
        String dataDevolucaoFormatada = formataData.format(dataDevolucao);

        return dataDevolucaoFormatada;
    }

    // Pega a data de devolução no registro selecionado na tebela de emprestimo
    public String pegaDataDevolucaoTabela() throws ParseException {

        int linhaSelecionada = jTableEmprestimo.getSelectedRow();
        String dataTabela = (jTableEmprestimo.getValueAt(linhaSelecionada, 4)).toString();

        SimpleDateFormat formataData = new SimpleDateFormat("yyyy-MM-dd");
        Date dataDevolucao = new Date();

        dataDevolucao = formataData.parse(dataTabela);

        return formataData.format(dataDevolucao);
    }

    // Calcula a diferença entre a data prevista para devolução e a data atual
    private long diferencaData() throws ParseException {
        LocalDate atual = LocalDate.now();
        LocalDate dataDevolucao = LocalDate.parse(pegaDataDevolucaoTabela());

        long diferenca = 0;

        if (dataDevolucao.compareTo(atual) < 0) {
            diferenca = ChronoUnit.DAYS.between(dataDevolucao, atual);
        }

        return diferenca;
    }

    /* <-DATAS---- */
 /* ----PESQUISA-> */
    // MÉTODOS:          
    /* ----ALUNO-> */
    // Configura campos da tabela de pesquisas de acordo com os campos do Aluno
    DefaultTableModel tmAluno = new DefaultTableModel(null, new String[]{"RM", "Nome", "Fone"});
    // Lista de alunos, recebe os registros retornados da pesquisa
    List<Aluno> alunos;

    // Lista a quantidade de resultado, de acordo com o nome passado no campo pesquisa
    private void listaContatosAluno() throws SQLException {
        BdAluno d = new BdAluno();
        alunos = d.getLista("%" + txtPesquisar.getText() + "%");

        // Após pesquisar os contatos, executa o método p/ exibir o resultado na tabela pesquisa
        mostraPesquisaAluno(alunos);
        alunos.clear();
    }

    // Mostra a lista de resultado de acordo com o nome passado no campo pesquisa
    private void mostraPesquisaAluno(List<Aluno> alunos) {
        // Limpa a tabela sempre que for solicitado uma nova pesquisa
        limpaTabelaAluno();

        if (alunos.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Nenhum registro encontrado.");
        } else {
            // Linha em branco usada no for, para cada registro é criada uma nova linha 
            String[] linha = new String[]{null, null, null};
            // P/ cada registro é criada uma nova linha, cada recebe linha os campos do registro
            for (int i = 0; i < alunos.size(); i++) {
                tmAluno.addRow(linha);
                tmAluno.setValueAt(alunos.get(i).getRm(), i, 0);
                tmAluno.setValueAt(alunos.get(i).getNome(), i, 1);
                tmAluno.setValueAt(alunos.get(i).getFone(), i, 2);
            }
        }
    }

    // Limpa a tabela de resultados
    private void limpaTabelaAluno() {
        while (tmAluno.getRowCount() > 0) {
            tmAluno.removeRow(0);
        }
    }
    /*<-ALUNO----*/

 /*----EMPRÉSTIMO->*/
    // Configura campos da tabela de pesquisas de acordo com os campos dos Empréstimos
    DefaultTableModel tmEmprestimo = new DefaultTableModel(null, new String[]{"ID Emprestimo", "RM Aluno", "ID Livro", "Data Emprestimo", "Data Devolução"});
    // Lista de empréstimos, recebe os registros retornados da pesquisa
    List<Emprestimo> emprestimos;

    // Lista a quantidade de resultado, de acordo com o nome passado no campo pesquisa
    private void listaContatosEmprestimo() throws SQLException {
        BdEmprestimo d = new BdEmprestimo();
        emprestimos = d.getListaPorAluno(pegaIdAluno());

        // Após pesquisar os contatos, executa o método p/ exibir o resultado na tabela pesquisa
        mostraPesquisaEmprestimo(emprestimos);
        emprestimos.clear();
    }

    // Mostra a lista de resultado de acordo com o nome passado no campo pesquisa
    private void mostraPesquisaEmprestimo(List<Emprestimo> emprestimos) {
        // Limpa a tabela sempre que for solicitado uma nova pesquisa
        limpaTabelaEmprestimo();

        if (emprestimos.isEmpty()) {
        } else {
            // Linha em branco usada no for, para cada registro é criada uma nova linha 
            String[] linha = new String[]{null, null, null, null, null};
            // P/ cada registro é criada uma nova linha, cada linha recebe os campos do registro
            for (int i = 0; i < emprestimos.size(); i++) {
                tmEmprestimo.addRow(linha);
                tmEmprestimo.setValueAt(emprestimos.get(i).getId_emprestimo(), i, 0);
                tmEmprestimo.setValueAt(emprestimos.get(i).getRm_aluno(), i, 1);
                tmEmprestimo.setValueAt(emprestimos.get(i).getId_livro(), i, 2);
                tmEmprestimo.setValueAt(emprestimos.get(i).getData_emprestimo(), i, 3);
                tmEmprestimo.setValueAt(emprestimos.get(i).getData_devolucao(), i, 4);
            }
        }
    }

    // Limpa a tabela de resultados
    private void limpaTabelaEmprestimo() {
        while (tmEmprestimo.getRowCount() > 0) {
            tmEmprestimo.removeRow(0);
        }
    }
    /*<-EMPRESTIMO----*/

 /* ----LIVRO-> */
    // Edita os campos e colunas da tabela de resultados
    DefaultTableModel tmLivro = new DefaultTableModel(null, new String[]{"ID", "Exemplar", "Autor", "Disponibilidade"});
    List<Livro> livros;

    // Lista a quantidade de resultado, de acordo com o nome passado no campo pesquisa
    private void listaContatosLivro() throws SQLException {
        BdLivro d = new BdLivro();
        livros = d.getLista("%" + txtPesquisar.getText() + "%");

        // Após pesquisar os contatos, executa o método p/ exibir o resultado na tabela pesquisa
        mostraPesquisaLivro(livros);
        livros.clear();
    }

    // Mostra a lista de resultado de acordo com o nome passado no campo pesquisa
    private void mostraPesquisaLivro(List<Livro> livros) {
        // Limpa a tabela sempre que for solicitado uma nova pesquisa
        limpaTabelaLivro();

        if (livros.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Nenhum registro encontrado.");
        } else {
            // Linha em branco usada no for, para cada registro é criada uma nova linha 
            String[] linha = new String[]{null, null, null, null};
            // P/ cada registro é criada uma nova linha, cada linha recebe os campos do registro
            for (int i = 0; i < livros.size(); i++) {
                tmLivro.addRow(linha);
                tmLivro.setValueAt(livros.get(i).getId(), i, 0);
                tmLivro.setValueAt(livros.get(i).getExemplar(), i, 1);
                tmLivro.setValueAt(livros.get(i).getAutor(), i, 2);
                tmLivro.setValueAt(livros.get(i).getDisponibilidade(), i, 3);
            }
        }
    }

    // Limpa a tabela de resultados
    private void limpaTabelaLivro() {
        while (tmLivro.getRowCount() > 0) {
            tmLivro.removeRow(0);
        }
    }

    /* <-LIVRO---- */

 /* <-PESQUISA---- */
 
    
    
 /* ----ALTERAR-> */
    // MÉTODOS:
    // Altera a disponibilidade do livro
    private void alteraDisponibilidade(String status) throws SQLException {
        if ((jTableAluno.getSelectedRow() != -1) || (jTableLivro.getSelectedRow() != -1)) {
            Livro l = new Livro();
            BdLivro d = new BdLivro();

            // Recebe o id do livro, que está sendo exibido no formulário
            l.setId(Integer.valueOf(pegaIdLivro()));
            l.setStatus(status);

            d.alteraDisponibilidadeLivro(l);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Livro não selecionado.");
        }
    }

    // Pega o ID do livro referente ao empréstimo selecionado na tabela de pesquisa
    private String pegaIdLivro() {
        int linhaSelecionada;
        String s = "0";
        if (jTableEmprestimo.getSelectedRow() != -1) {
            linhaSelecionada = jTableEmprestimo.getSelectedRow();
            s = jTableEmprestimo.getValueAt(linhaSelecionada, 2).toString();
        } else if (jTableLivro.getSelectedRow() != -1) {
            linhaSelecionada = jTableLivro.getSelectedRow();
            s = jTableLivro.getValueAt(linhaSelecionada, 0).toString();
        }

        return s;
    }

    /* <-ALTERAR---- */

 /* ----DEVOLVER-> */
    private void devolveLivro() throws SQLException, ParseException {
        if (jTableEmprestimo.getSelectedRow() != -1) {
            // Altera a disponibilidade do livro
            alteraDisponibilidade("Disponivel");

            // Exclui o registo de empréstimo
            // Recebe a linha selecionada
            int linhaSelecionada = jTableEmprestimo.getSelectedRow();
            // Recebe o ID da linha selecionada
            int id = (int) jTableEmprestimo.getValueAt(linhaSelecionada, 0);
            // Remove o registro, usando como parâmetro, o id da linha selecionada                
            BdEmprestimo d = new BdEmprestimo();
            d.remove(id);

            if (diferencaData() > 10000) {
                passaValor(String.valueOf(diferencaData()));
                JOptionPane.showMessageDialog(rootPane, ""
                        + ""
                        + "" + diferencaData() + "");

                listaContatosEmprestimo();
                listaContatosLivro();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Emprestimo devolvido com sucesso.");
                listaContatosEmprestimo();
                listaContatosLivro();
            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "Emprestimo não selecionado.");
        }
    }

    /* <-DEVOLVER---- */

 /* ----OUTROS-> */
    // MÉTODOS:
    // Limpa os campos do formulário
    private void limpaCamposEmprestimo() {

        txtRm.setText("");
        txtLivro.setText("");
    }

    // Desabilita os campos do formulário
    private void desabilitaCamposEmprestimo() {

        txtRm.setEditable(false);
        txtLivro.setEditable(false);
        txtDataEmprestimo.setEditable(false);
        txtDataDevolucao.setEditable(false);
    }

    
    private void passaValor(String valor) throws ParseException, SQLException {

    }

    private String pegaIdAluno() throws SQLException {
        int linhaSelecionada = jTableAluno.getSelectedRow();

        String s = jTableAluno.getValueAt(linhaSelecionada, 0).toString();

        return s;
    }

    /* <-OUTROS---- */
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new JFEmprestimo().setVisible(true);
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bGPesquisa;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnDevolver;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableAluno;
    private javax.swing.JTable jTableEmprestimo;
    private javax.swing.JTable jTableLivro;
    private javax.swing.JRadioButton selectAluno;
    private javax.swing.JRadioButton selectLivro;
    private javax.swing.JTextField txtDataDevolucao;
    private javax.swing.JTextField txtDataEmprestimo;
    private javax.swing.JTextField txtLivro;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtRm;
    // End of variables declaration//GEN-END:variables

}
