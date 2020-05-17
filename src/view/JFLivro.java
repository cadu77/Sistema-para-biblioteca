package view;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Livro;
import controller.BdLivro;

public class JFLivro extends javax.swing.JFrame {

    private JFPrincipal telaPrincipal;

    /**
     * Creates new form aluno
     */
    public JFLivro() {
        initComponents();

        // Desabilita os campos ao iniciar a janela
        desabilitaCampos();
        
    }

    JFLivro(JFPrincipal telaPrincipal) {
        
        this();
        this.telaPrincipal = telaPrincipal;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtExemplar = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtAno = new javax.swing.JFormattedTextField();
        txtStatus = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        txtLocalizacao = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtEdicao = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        txtPesquisar = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePesquisa = new javax.swing.JTable();
        selectExemplar = new javax.swing.JRadioButton();
        selectLivro = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Livros");
        setBackground(new java.awt.Color(255, 204, 204));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Livros"));

        jLabel1.setText("Titulo: ");

        jLabel2.setText("Autor: ");

        jLabel3.setText("Edição: ");

        jLabel4.setText("Ano: ");

        jLabel5.setText("Situação: ");

        jLabel7.setText("ID: ");

        try {
            txtAno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Opções", "Disponivel", "Emprestado" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 51));
        jLabel6.setText("*");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 51));
        jLabel8.setText("*");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 51));
        jLabel9.setText("*");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 51));
        jLabel10.setText("*");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 51));
        jLabel11.setText("*");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 51));
        jLabel12.setText("*");

        jLabel13.setText("Categoria:");

        txtCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administração", "Agricultura", "Antropologia", "Arqueologia", "Arquitetura", "Artes", "Astronomia", "Cinema", "Comunicação", "Contabilidade", "Decoração", "Dicionários", "Didáticos", "Direito", "Documentos", "Ecologia", "Economia", "Engenharia", "Enciclopédias", "Ensino de Idiomas", "Filosofia", "Fotografia", "Geografia", "Guerra", "História do Brasil", "História Geral", "Informática", "Linguística", "Medicina", "Moda", "Música", "Pecuária", "Pedagogia", "Pintura", "Psicologia", "Saúde", "Sociologia", "Teatro", "Turismo" }));

        jLabel14.setText("Localização física:");

        jLabel15.setText("Descrição:");

        txtDescricao.setColumns(20);
        txtDescricao.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtDescricao.setLineWrap(true);
        txtDescricao.setRows(5);
        txtDescricao.setWrapStyleWord(true);
        txtDescricao.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane2.setViewportView(txtDescricao);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel13))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtExemplar, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11))
                            .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(txtLocalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel15))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtExemplar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtLocalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar Livros"));

        txtPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyReleased(evt);
            }
        });

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/procurar (1).png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisar.setFocusable(false);
        btnPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPesquisarMouseClicked(evt);
            }
        });
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        btnPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnPesquisarKeyPressed(evt);
            }
        });

        jTablePesquisa.setModel(tmLivro);
        jTablePesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePesquisaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePesquisa);

        buttonGroup1.add(selectExemplar);
        selectExemplar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        selectExemplar.setSelected(true);
        selectExemplar.setText("Livro");
        selectExemplar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selectExemplar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectExemplarMouseClicked(evt);
            }
        });

        buttonGroup1.add(selectLivro);
        selectLivro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        selectLivro.setText("ID Livro");
        selectLivro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selectLivro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectLivroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(selectExemplar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(selectLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectExemplar)
                    .addComponent(selectLivro)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setPreferredSize(new java.awt.Dimension(141, 334));

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/caderno_excluir.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluir.setFocusable(false);
        btnExcluir.setMargin(new java.awt.Insets(2, 14, 2, 35));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/caderno_alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterar.setFocusable(false);
        btnAlterar.setMargin(new java.awt.Insets(2, 14, 2, 35));
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/agenda.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovo.setFocusable(false);
        btnNovo.setMargin(new java.awt.Insets(2, 14, 2, 40));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/caderno.png"))); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar.setFocusable(false);
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/seta.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.setFocusable(false);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));
        jPanel4.setPreferredSize(new java.awt.Dimension(0, 50));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 204, 204));
        jPanel5.setPreferredSize(new java.awt.Dimension(0, 50));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 824, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 824, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Cadastro de Clientes");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // BOTÃO NOVO - Precionando
    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        habilitaCampos();
        // Limpa os dados dos campos
        limpaCampos();
    }//GEN-LAST:event_btnNovoActionPerformed

    // BOTÃO CADASTRAR - Precionando
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        cadastraRegistro();

    }//GEN-LAST:event_btnCadastrarActionPerformed

    // BOTÃO PESQUISAR - Precionando
    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed

    }//GEN-LAST:event_btnPesquisarActionPerformed

    // TABELA PESQUISA - Selecionando registro com o clique do mouse
    private void jTablePesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePesquisaMouseClicked
        // Salva a posição da linha selecionada na tabela de pesquisa
        int linhaSelecionada = jTablePesquisa.getSelectedRow();

        txtId.setText(jTablePesquisa.getValueAt(linhaSelecionada, 0).toString());
        txtExemplar.setText((String) jTablePesquisa.getValueAt(linhaSelecionada, 1));
        txtAutor.setText((String) jTablePesquisa.getValueAt(linhaSelecionada, 2));
        txtEdicao.setText(jTablePesquisa.getValueAt(linhaSelecionada, 3).toString());
        txtAno.setText(jTablePesquisa.getValueAt(linhaSelecionada, 4).toString());
        txtCategoria.setSelectedItem(jTablePesquisa.getValueAt(linhaSelecionada, 5));
        txtLocalizacao.setText((String) jTablePesquisa.getValueAt(linhaSelecionada, 6));
        txtDescricao.setText((String) jTablePesquisa.getValueAt(linhaSelecionada, 7));
        txtStatus.setSelectedItem((String) jTablePesquisa.getValueAt(linhaSelecionada, 8));

        // Ao selecionar um registro, os campos são ativados possibilitando fazer alterações
        habilitaCampos();
    }//GEN-LAST:event_jTablePesquisaMouseClicked

    // BOTÃO EXCLUIR - Precionando
    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
            excluirRegistro();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao excluir registro.\n"+ex);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    // BOTÃO ALTERAR
    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        try {
            alteraRegistro();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao alterar registro.\n"+ex);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

        telaPrincipal.setEnabled(true);

    }//GEN-LAST:event_formWindowClosed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void txtPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyPressed
        // EVENTO DA TECLA ENTER 

        if (evt.getKeyCode() == evt.VK_ENTER) {

            btnPesquisar.requestFocus();
            try {
                listaContatos((txtPesquisar.getText()));
                listaContatosId();
            } catch (SQLException ex) {
                Logger.getLogger(JFLivro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_txtPesquisarKeyPressed

    private void selectExemplarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectExemplarMouseClicked

    }//GEN-LAST:event_selectExemplarMouseClicked

    private void selectLivroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectLivroMouseClicked

    }//GEN-LAST:event_selectLivroMouseClicked

    private void btnPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesquisarMouseClicked
        if (selectExemplar.isSelected()) {
            // Quando seleciona PESQUISA CLIENTE
            try {
                listaContatos((txtPesquisar.getText()));
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "" + ex);
            }
        } else if (selectLivro.isSelected()) {
            // Quando seleciona PESQUISA LIVROS
            try {
                listaContatosId();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "" + ex);
            }
        }

    }//GEN-LAST:event_btnPesquisarMouseClicked

    private void btnPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnPesquisarKeyPressed
        // BOTAO DE PESQUISA
        try {
            listaContatosId();
            listaContatos((txtPesquisar.getText()));
        } catch (SQLException ex) {
            Logger.getLogger(JFLivro.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnPesquisarKeyPressed

    private void txtPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyReleased
        // METEDO PARA PESQUISA CONFORME O USUARIO VAI DIGITANDO
        try {
           listaContatos((txtPesquisar.getText()));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao listar dados.\n" + ex);
        }
    }//GEN-LAST:event_txtPesquisarKeyReleased

    /* ----CADASTRO-> */
    // MÉTODOS:
    // Método p/ cadastrar um registro no banco de dados.
    private void cadastraRegistro() {
        // Antes de cadastrar, verifica se o usuário está com algum registro selecionado
        if (txtExemplar.isEditable() && txtId.getText().equals("")) {
            // Antes de cadastrar, verifica se os campos foram preenchidos
            if (verificaDados()) {
                try {
                    Livro livro = new Livro();

                    livro.setExemplar(txtExemplar.getText());
                    livro.setAutor(txtAutor.getText());
                    livro.setEdicao(txtEdicao.getText());
                    livro.setAno(txtAno.getText());
                    livro.setCategoria((String) txtCategoria.getSelectedItem());
                    livro.setLocalizacao(txtLocalizacao.getText());
                    livro.setDescricao(txtDescricao.getText());
                    livro.setStatus((String) txtStatus.getSelectedItem());
                        
                   
                    
                    
                    
                    BdLivro d = new BdLivro();

                    d.adicionaLivro(livro);

                    JOptionPane.showMessageDialog(rootPane, "Dados cadastrados com sucesso.");

                    limpaCampos();
                    desabilitaCampos();

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(rootPane, "Erro ao cadastrar dados.\n" + ex);
                }
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Para cadastrar um novo registro.\nClique em 'Novo'.");
        }
    }
    
 
    

    // Método p/ validação do formulário
    private boolean verificaDados() {
        if ((!txtExemplar.getText().equals("")) && (!txtAutor.getText().equals(""))
                && (!txtEdicao.getText().equals("  ª")) && (!txtAno.getText().equals(""))
                && (!txtStatus.getSelectedItem().equals("Opções"))) {
            return true;
        }
        JOptionPane.showMessageDialog(rootPane, "Dados incompletos.");
        return false;
    }

  
       private boolean verificaDisponibilidade() {
        if ((!txtStatus.getSelectedItem().equals("Opções"))) {
            return true;
        }
        JOptionPane.showMessageDialog(rootPane, "'Opções' não é uma alteração válida");
        return false;
    }
    
    /* <-CADASTRO---- */
 /* ----PESQUISA-> */
    // MÉTODOS:
    // Edita os campos e colunas da tabela de resultados                        
    DefaultTableModel tmLivro = new DefaultTableModel(null, new String[]{"ID", "Titulo", "Autor", "Edição", "Ano", "Categoria", "Localização", "Descrição", "Situação"});
    List<Livro> livros;

    // Lista a quantidade de resultado, de acordo com o nome passado no campo pesquisa
    private void listaContatos(String par) throws SQLException {
        limpaCampos();
        BdLivro d = new BdLivro();
        livros = d.getLista("%" + txtPesquisar.getText() + "%");

        // Após pesquisar os contatos, executa o método p/ exibir o resultado na tabela pesquisa
        mostraPesquisa(livros);
        livros.clear();
    }

    // Lista a quantidade de resultado, de acordo com o nome passado no campo pesquisa
    private void listaContatosId() throws SQLException {
        limpaCampos();
        BdLivro d = new BdLivro();
        livros = d.getListaId("%" + txtPesquisar.getText() + "%");

        // Após pesquisar os contatos, executa o método p/ exibir o resultado na tabela pesquisa
        mostraPesquisa(livros);
        livros.clear();
    }

    // Mostra a lista de resultado de acordo com o nome passado no campo pesquisa
    private void mostraPesquisa(List<Livro> livros) {
        // Limpa a tabela sempre que for solicitado uma nova pesquisa
        limparTabela();

        if (livros.isEmpty()) {
            System.out.println("");
        } else {
            // Linha em branco usada no for, para cada registro é criada uma nova linha 
            String[] linha = new String[]{null, null, null, null, null, null, null, null};
            // P/ cada registro é criada uma nova linha, cada linha recebe os campos do registro
            for (int i = 0; i < livros.size(); i++) {
                tmLivro.addRow(linha);
                tmLivro.setValueAt(livros.get(i).getId(), i, 0);
                tmLivro.setValueAt(livros.get(i).getExemplar(), i, 1);
                tmLivro.setValueAt(livros.get(i).getAutor(), i, 2);
                tmLivro.setValueAt(livros.get(i).getEdicao(), i, 3);
                tmLivro.setValueAt(livros.get(i).getAno(), i, 4);
                tmLivro.setValueAt(livros.get(i).getCategoria(), i, 5);
                tmLivro.setValueAt(livros.get(i).getLocalizacao(), i, 6);
                tmLivro.setValueAt(livros.get(i).getDescricao(), i, 7);
                tmLivro.setValueAt(livros.get(i).getDisponibilidade(), i, 8);
            }
        }
    }

    // Limpa a tabela de resultados
    private void limparTabela() {
        while (tmLivro.getRowCount() > 0) {
            tmLivro.removeRow(0);
        }
    }

    /* <-PESQUISA---- */
 /* ----EXCLUIR-> */
    // MÉTODOS:
    // Exclui resgistro
    private void excluirRegistro() throws SQLException {
        // Se algum registro estiver selecionado
        if (jTablePesquisa.getSelectedRow() != -1) {
            // Exibe uma janela de confirmação antes de exluir o registro
            int resp = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir este registro?",
                    "Confirmação!", JOptionPane.YES_NO_OPTION);

            // Se a confirmação for SIM
            if (resp == JOptionPane.YES_NO_OPTION) {
                // Recebe a linha selecionada
                int linhaSelecionada = jTablePesquisa.getSelectedRow();
                // Recebe o ID da linha selecionada
                int id = (int) jTablePesquisa.getValueAt(linhaSelecionada, 0);
                // Remove o registro, usando como parâmetro, o id da linha selecionada                
                BdLivro d = new BdLivro();
                d.remove(id);

                JOptionPane.showMessageDialog(rootPane, "Registro excluido com sucesso.");
                limpaCampos();
                desabilitaCampos();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Registro não selecionado.");
        }
    }

    /* <-EXCLUIR---- */

 /* ----ALTERAR-> */
    // MÉTODOS:
    // Altera registro
    private void alteraRegistro() throws SQLException {
        if (jTablePesquisa.getSelectedRow() != -1) {
            int resp = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente alterar este registro?",
                    "Confirmação!", JOptionPane.YES_NO_OPTION);

            // Se a confirmação for SIM
            
            if(verificaDisponibilidade()){
            
              if (resp == JOptionPane.YES_NO_OPTION) {
                Livro l = new Livro();
                BdLivro d = new BdLivro();
                
                l.setId(Integer.valueOf(txtId.getText()));
                l.setExemplar(txtExemplar.getText());
                l.setAutor(txtAutor.getText());
                l.setEdicao(txtEdicao.getText());
                l.setAno(txtAno.getText());
                l.setCategoria((String) txtCategoria.getSelectedItem());
                l.setLocalizacao(txtLocalizacao.getText());
                l.setDescricao(txtDescricao.getText());
                l.setStatus((String) txtStatus.getSelectedItem());
                
                
                d.altera(l);

                JOptionPane.showMessageDialog(rootPane, "Registro alterado com sucesso.");
                limpaCampos();
                desabilitaCampos();
                listaContatos((txtPesquisar.getText()));
                listaContatosId();
            }
            }
          
        } else {
            JOptionPane.showMessageDialog(rootPane, "Registro não selecionado.");
        }
    }

    /* <-ALTERAR---- */

 /* ----OUTROS-> */
    // MÉTODOS:
    // Limpa os campos do formulário
    private void limpaCampos() {
        txtId.setText("");
        txtExemplar.setText("");
        txtAutor.setText("");
        txtEdicao.setText("");
        txtAno.setText("");
        txtCategoria.setSelectedItem("Administração");
        txtLocalizacao.setText("");
        txtDescricao.setText("");
        txtStatus.setSelectedItem("Opções");
    }

    // Desabilita os campos do formulário
    private void desabilitaCampos() {
        txtId.setEditable(false);
        txtExemplar.setEditable(false);
        txtAutor.setEditable(false);
        txtEdicao.setEditable(false);
        txtAno.setEditable(false);
        txtCategoria.setEditable(false);
        txtLocalizacao.setEditable(false);
        txtDescricao.setEditable(false);
        txtStatus.setEditable(false);
    }

    // Habilita os campos do formulário
    private void habilitaCampos() {

        txtExemplar.setEditable(true);
        txtAutor.setEditable(true);
        txtEdicao.setEditable(true);
        txtAno.setEditable(true);
        //txtCategoria.setEditable(false);
        txtLocalizacao.setEditable(true);
        txtDescricao.setEditable(true);
        txtStatus.setEditable(false);
    }

    /* <-OUTROS---- */
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFLivro().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSair;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablePesquisa;
    private javax.swing.JRadioButton selectExemplar;
    private javax.swing.JRadioButton selectLivro;
    private javax.swing.JFormattedTextField txtAno;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JComboBox<Object> txtCategoria;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtEdicao;
    private javax.swing.JTextField txtExemplar;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLocalizacao;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JComboBox<Object> txtStatus;
    // End of variables declaration//GEN-END:variables

}
