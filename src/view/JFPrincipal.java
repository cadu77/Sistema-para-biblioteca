package view;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

import controller.CriaConexao;

public class JFPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public JFPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuAluno = new javax.swing.JMenu();
        CadAluno = new javax.swing.JMenuItem();
        RelatorioAluno = new javax.swing.JMenu();
        TodosAlunos = new javax.swing.JMenuItem();
        EnsinoMedio = new javax.swing.JMenu();
        Administracao = new javax.swing.JMenuItem();
        Ds = new javax.swing.JMenuItem();
        Nutricao = new javax.swing.JMenuItem();
        Tecnico = new javax.swing.JMenu();
        Cozinha = new javax.swing.JMenuItem();
        Ds2 = new javax.swing.JMenuItem();
        Enfermagem = new javax.swing.JMenuItem();
        Nutricao2 = new javax.swing.JMenuItem();
        SegurancaTrabalho = new javax.swing.JMenuItem();
        MenuLivro = new javax.swing.JMenu();
        CadLivro = new javax.swing.JMenuItem();
        RelatorioLivro = new javax.swing.JMenu();
        TodosLivros = new javax.swing.JMenuItem();
        LivrosDisponiveis = new javax.swing.JMenuItem();
        LivrosIndisponiveis = new javax.swing.JMenuItem();
        MenuEmprestimo = new javax.swing.JMenu();
        CadEmprestimo = new javax.swing.JMenuItem();
        RelatorioEmprestimo = new javax.swing.JMenuItem();
        RelatorioAtrasado = new javax.swing.JMenuItem();
        MenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Biblioteca Etec Uirapuru\n");
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(240, 240, 240));
        setResizable(false);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Sistema Biblioteca 2020.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1410, 2250));
        jLabel1.setMinimumSize(new java.awt.Dimension(1410, 2250));
        jLabel1.setPreferredSize(new java.awt.Dimension(1400, 800));

        jMenuBar1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jMenuBar1.setForeground(new java.awt.Color(240, 240, 240));
        jMenuBar1.setAlignmentY(0.5F);

        MenuAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/professor.png"))); // NOI18N
        MenuAluno.setText("Aluno");
        MenuAluno.setFocusable(false);
        MenuAluno.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N

        CadAluno.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        CadAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/designer.png"))); // NOI18N
        CadAluno.setText("Cadastrar Aluno");
        CadAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadAlunoActionPerformed(evt);
            }
        });
        MenuAluno.add(CadAluno);

        RelatorioAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/analise-de-dados.png"))); // NOI18N
        RelatorioAluno.setText("Relatórios");
        RelatorioAluno.setFocusable(false);

        TodosAlunos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/escola.png"))); // NOI18N
        TodosAlunos.setText("Todos Alunos");
        TodosAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TodosAlunosActionPerformed(evt);
            }
        });
        RelatorioAluno.add(TodosAlunos);

        EnsinoMedio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/lapis-de-cor.png"))); // NOI18N
        EnsinoMedio.setText("Ensino Médio");
        EnsinoMedio.setFocusable(false);
        EnsinoMedio.setMargin(new java.awt.Insets(8, 0, 0, 0));

        Administracao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/homem-de-negocios.png"))); // NOI18N
        Administracao.setText("Administração - Integrado ao Ensino Médio");
        Administracao.setPreferredSize(new java.awt.Dimension(361, 38));
        Administracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdministracaoActionPerformed(evt);
            }
        });
        EnsinoMedio.add(Administracao);

        Ds.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/programador.png"))); // NOI18N
        Ds.setText("Desenvolvimento de Sistemas - Integrado ao Ensino Médio");
        Ds.setPreferredSize(new java.awt.Dimension(361, 38));
        Ds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DsActionPerformed(evt);
            }
        });
        EnsinoMedio.add(Ds);

        Nutricao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/nutricionista.png"))); // NOI18N
        Nutricao.setText("Nutrição e Dietética - Integrado ao Ensino Médio");
        Nutricao.setPreferredSize(new java.awt.Dimension(361, 38));
        Nutricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NutricaoActionPerformed(evt);
            }
        });
        EnsinoMedio.add(Nutricao);

        RelatorioAluno.add(EnsinoMedio);

        Tecnico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/suporte-tecnico.png"))); // NOI18N
        Tecnico.setText("Técnico");
        Tecnico.setFocusable(false);
        Tecnico.setMargin(new java.awt.Insets(8, 0, 0, 0));

        Cozinha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/padeiro.png"))); // NOI18N
        Cozinha.setText("Cozinha");
        Cozinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CozinhaActionPerformed(evt);
            }
        });
        Tecnico.add(Cozinha);

        Ds2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/desenvolvedor.png"))); // NOI18N
        Ds2.setText("Desenvolvimento de Sistemas");
        Ds2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ds2ActionPerformed(evt);
            }
        });
        Tecnico.add(Ds2);

        Enfermagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/medico.png"))); // NOI18N
        Enfermagem.setText("Enfermagem");
        Enfermagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnfermagemActionPerformed(evt);
            }
        });
        Tecnico.add(Enfermagem);

        Nutricao2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/ioga.png"))); // NOI18N
        Nutricao2.setText("Nutrição e Dietética");
        Nutricao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nutricao2ActionPerformed(evt);
            }
        });
        Tecnico.add(Nutricao2);

        SegurancaTrabalho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/trabalhador.png"))); // NOI18N
        SegurancaTrabalho.setText("Segurança do Trabalho");
        SegurancaTrabalho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SegurancaTrabalhoActionPerformed(evt);
            }
        });
        Tecnico.add(SegurancaTrabalho);

        RelatorioAluno.add(Tecnico);

        MenuAluno.add(RelatorioAluno);

        jMenuBar1.add(MenuAluno);

        MenuLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/estante-de-livros.png"))); // NOI18N
        MenuLivro.setText("Livro");
        MenuLivro.setFocusable(false);
        MenuLivro.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N

        CadLivro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        CadLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/editar.png"))); // NOI18N
        CadLivro.setText("Cadastrar Livros");
        CadLivro.setMargin(new java.awt.Insets(0, 0, 5, 0));
        CadLivro.setPreferredSize(new java.awt.Dimension(169, 30));
        CadLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadLivroActionPerformed(evt);
            }
        });
        MenuLivro.add(CadLivro);

        RelatorioLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/relatorio.png"))); // NOI18N
        RelatorioLivro.setText("Relatórios");
        RelatorioLivro.setFocusable(false);
        RelatorioLivro.setMargin(new java.awt.Insets(5, 0, 0, 0));
        RelatorioLivro.setPreferredSize(new java.awt.Dimension(169, 30));

        TodosLivros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/archive.png"))); // NOI18N
        TodosLivros.setText("Todos os Livros");
        TodosLivros.setMargin(new java.awt.Insets(0, 0, 3, 0));
        TodosLivros.setPreferredSize(new java.awt.Dimension(133, 30));
        TodosLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TodosLivrosActionPerformed(evt);
            }
        });
        RelatorioLivro.add(TodosLivros);

        LivrosDisponiveis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/pasta.png"))); // NOI18N
        LivrosDisponiveis.setText("Livros Disponiveis");
        LivrosDisponiveis.setMargin(new java.awt.Insets(0, 0, 3, 0));
        LivrosDisponiveis.setPreferredSize(new java.awt.Dimension(145, 30));
        LivrosDisponiveis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LivrosDisponiveisActionPerformed(evt);
            }
        });
        RelatorioLivro.add(LivrosDisponiveis);

        LivrosIndisponiveis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/folder.png"))); // NOI18N
        LivrosIndisponiveis.setText("Livros Emprestados");
        LivrosIndisponiveis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LivrosIndisponiveisActionPerformed(evt);
            }
        });
        RelatorioLivro.add(LivrosIndisponiveis);

        MenuLivro.add(RelatorioLivro);

        jMenuBar1.add(MenuLivro);

        MenuEmprestimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/capelo.png"))); // NOI18N
        MenuEmprestimo.setText("Empréstimo");
        MenuEmprestimo.setFocusable(false);
        MenuEmprestimo.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        MenuEmprestimo.setPreferredSize(new java.awt.Dimension(191, 30));

        CadEmprestimo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        CadEmprestimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/produtos.png"))); // NOI18N
        CadEmprestimo.setText("Cadastrar Empréstimos");
        CadEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadEmprestimoActionPerformed(evt);
            }
        });
        MenuEmprestimo.add(CadEmprestimo);

        RelatorioEmprestimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/curriculo.png"))); // NOI18N
        RelatorioEmprestimo.setText("Relatório de Empréstimos Efetuados");
        RelatorioEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RelatorioEmprestimoActionPerformed(evt);
            }
        });
        MenuEmprestimo.add(RelatorioEmprestimo);

        RelatorioAtrasado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/atrasado.png"))); // NOI18N
        RelatorioAtrasado.setText("Relatório de Empréstimos Atrasados");
        RelatorioAtrasado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RelatorioAtrasadoActionPerformed(evt);
            }
        });
        MenuEmprestimo.add(RelatorioAtrasado);

        jMenuBar1.add(MenuEmprestimo);

        MenuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/seta.png"))); // NOI18N
        MenuSair.setText("Sair");
        MenuSair.setFocusable(false);
        MenuSair.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        MenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuSairMouseClicked(evt);
            }
        });
        MenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSairActionPerformed(evt);
            }
        });
        jMenuBar1.add(MenuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CadLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadLivroActionPerformed

        // Abre a janela
        new JFLivro(this).setVisible(true);

        this.setEnabled(false);

    }//GEN-LAST:event_CadLivroActionPerformed

    private void MenuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_MenuSairMouseClicked

    private void CadAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadAlunoActionPerformed

        // Abre a janela
        // this(Esta janela) - Passa a instancia da tela atual como parâmetro p/ o construtor
        new JFAluno(this).setVisible(true);

        // Desativa funcionalidades da tabela principal
        this.setEnabled(false);

    }//GEN-LAST:event_CadAlunoActionPerformed

    private void MenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_MenuSairActionPerformed

    private void CadEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadEmprestimoActionPerformed

        // Abre a janela
        new JFEmprestimo(this).setVisible(true);

        this.setEnabled(false);

    }//GEN-LAST:event_CadEmprestimoActionPerformed

    private void TodosLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TodosLivrosActionPerformed
        // RELATORIO DE TODOS OS LIVROS

        Connection conexao = null;
        try {
            conexao = CriaConexao.getConexao();
        } catch (SQLException ex) {
            Logger.getLogger(JFPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        int confirma = JOptionPane.showConfirmDialog(null, "Confirma emissão de relatorio ?", "Atenção", JOptionPane.YES_NO_OPTION);

        if (confirma == JOptionPane.YES_OPTION) {

            String src = "/SistemaBiblioteca/Relatorios/Livros/TodosLivros.jasper";
            JasperPrint jasperPrint = null;

            try {
                jasperPrint = JasperFillManager.fillReport(src, null, conexao);
            } catch (JRException e) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao Gerar Relatorio \n" + e);
            }

            JasperViewer view = new JasperViewer(jasperPrint, false);
            view.setVisible(true);

        }
    }//GEN-LAST:event_TodosLivrosActionPerformed

    private void LivrosDisponiveisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LivrosDisponiveisActionPerformed
        // RELATORIO DOS LIVROS DISPONIVEIS

        Connection conexao = null;
        try {
            conexao = CriaConexao.getConexao();
        } catch (SQLException ex) {
            Logger.getLogger(JFPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        int confirma = JOptionPane.showConfirmDialog(null, "Confirma emissão de relatorio ?", "Atenção", JOptionPane.YES_NO_OPTION);

        if (confirma == JOptionPane.YES_OPTION) {

            String src = "/SistemaBiblioteca/Relatorios/Livros/LivrosDisponiveis.jasper";
            JasperPrint jasperPrint = null;

            try {
                jasperPrint = JasperFillManager.fillReport(src, null, conexao);
            } catch (JRException e) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao Gerar Relatorio \n" + e);
            }

            JasperViewer view = new JasperViewer(jasperPrint, false);
            view.setVisible(true);

        }
    }//GEN-LAST:event_LivrosDisponiveisActionPerformed

    private void LivrosIndisponiveisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LivrosIndisponiveisActionPerformed
        // RELATORIO DOS LIVROS INDISPONIVEIS

        Connection conexao = null;
        try {
            conexao = CriaConexao.getConexao();
        } catch (SQLException ex) {
            Logger.getLogger(JFPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        int confirma = JOptionPane.showConfirmDialog(null, "Confirma emissão de relatorio ?", "Atenção", JOptionPane.YES_NO_OPTION);

        if (confirma == JOptionPane.YES_OPTION) {

            String src = "/SistemaBiblioteca/Relatorios/Livros/LivrosIndisponiveis.jasper";
            JasperPrint jasperPrint = null;

            try {
                jasperPrint = JasperFillManager.fillReport(src, null, conexao);
            } catch (JRException e) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao Gerar Relatorio \n" + e);
            }

            JasperViewer view = new JasperViewer(jasperPrint, false);
            view.setVisible(true);

        }
    }//GEN-LAST:event_LivrosIndisponiveisActionPerformed

    private void CozinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CozinhaActionPerformed
        // RELATORIO TÉCNICO COZINHA

        Connection conexao = null;
        try {
            conexao = CriaConexao.getConexao();
        } catch (SQLException ex) {
            Logger.getLogger(JFPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        int confirma = JOptionPane.showConfirmDialog(null, "Confirma emissão de relatorio ?", "Atenção", JOptionPane.YES_NO_OPTION);

        if (confirma == JOptionPane.YES_OPTION) {

            String src = "/SistemaBiblioteca/Relatorios/Alunos/Tecnico/Relatorio_Cozinha.jasper";
            JasperPrint jasperPrint = null;

            try {
                jasperPrint = JasperFillManager.fillReport(src, null, conexao);
            } catch (JRException e) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao Gerar Relatorio \n" + e);
            }

            JasperViewer view = new JasperViewer(jasperPrint, false);
            view.setVisible(true);

        }
    }//GEN-LAST:event_CozinhaActionPerformed

    private void EnfermagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnfermagemActionPerformed
        // RELATORIO TÉCNICO ENFERMAGEM

        Connection conexao = null;
        try {
            conexao = CriaConexao.getConexao();
        } catch (SQLException ex) {
            Logger.getLogger(JFPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        int confirma = JOptionPane.showConfirmDialog(null, "Confirma emissão de relatorio ?", "Atenção", JOptionPane.YES_NO_OPTION);

        if (confirma == JOptionPane.YES_OPTION) {

            String src = "/SistemaBiblioteca/Relatorios/Alunos/Tecnico/Relatorio_Enfermagem.jasper";
            JasperPrint jasperPrint = null;

            try {
                jasperPrint = JasperFillManager.fillReport(src, null, conexao);
            } catch (JRException e) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao Gerar Relatorio \n" + e);
            }

            JasperViewer view = new JasperViewer(jasperPrint, false);
            view.setVisible(true);

        }
    }//GEN-LAST:event_EnfermagemActionPerformed

    private void Ds2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ds2ActionPerformed
        // RELATORIO TÉCNICO DESENVOLVIMENTO DE SISTEMAS

        Connection conexao = null;
        try {
            conexao = CriaConexao.getConexao();
        } catch (SQLException ex) {
            Logger.getLogger(JFPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        int confirma = JOptionPane.showConfirmDialog(null, "Confirma emissão de relatorio ?", "Atenção", JOptionPane.YES_NO_OPTION);

        if (confirma == JOptionPane.YES_OPTION) {

            String src = "/SistemaBiblioteca/Relatorios/Alunos/Tecnico/Relatorio_Desenvolvimento_Sistemas.jasper";
            JasperPrint jasperPrint = null;

            try {
                jasperPrint = JasperFillManager.fillReport(src, null, conexao);
            } catch (JRException e) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao Gerar Relatorio \n" + e);
            }

            JasperViewer view = new JasperViewer(jasperPrint, false);
            view.setVisible(true);

        }
    }//GEN-LAST:event_Ds2ActionPerformed

    private void DsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DsActionPerformed
        // RELATORIO TÉCNICO DESENVOLVIMENTO DE SISTEMAS - ETIM

        Connection conexao = null;
        try {
            conexao = CriaConexao.getConexao();
        } catch (SQLException ex) {
            Logger.getLogger(JFPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        int confirma = JOptionPane.showConfirmDialog(null, "Confirma emissão de relatorio ?", "Atenção", JOptionPane.YES_NO_OPTION);

        if (confirma == JOptionPane.YES_OPTION) {

            String src = "/SistemaBiblioteca/Relatorios/Alunos/Ensino_Medio/Relatorio_Desenvolvimento_Sistemas_Etim.jasper";
            JasperPrint jasperPrint = null;

            try {
                jasperPrint = JasperFillManager.fillReport(src, null, conexao);
            } catch (JRException e) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao Gerar Relatorio \n" + e);
            }

            JasperViewer view = new JasperViewer(jasperPrint, false);
            view.setVisible(true);

        }
    }//GEN-LAST:event_DsActionPerformed

    private void SegurancaTrabalhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SegurancaTrabalhoActionPerformed
        // RELATORIO TÉCNICO SEGURANÇA DO TRABALHO

        Connection conexao = null;
        try {
            conexao = CriaConexao.getConexao();
        } catch (SQLException ex) {
            Logger.getLogger(JFPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        int confirma = JOptionPane.showConfirmDialog(null, "Confirma emissão de relatorio ?", "Atenção", JOptionPane.YES_NO_OPTION);

        if (confirma == JOptionPane.YES_OPTION) {

            String src = "/SistemaBiblioteca/Relatorios/Alunos/Tecnico/Relatorio_Seguranca_Trabalho.jasper";
            JasperPrint jasperPrint = null;

            try {
                jasperPrint = JasperFillManager.fillReport(src, null, conexao);
            } catch (JRException e) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao Gerar Relatorio \n" + e);
            }

            JasperViewer view = new JasperViewer(jasperPrint, false);
            view.setVisible(true);

        }
    }//GEN-LAST:event_SegurancaTrabalhoActionPerformed

    private void AdministracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdministracaoActionPerformed
        // RELATORIO ADMINISTRAÇÃO - INTEGRADO AO ENSINO MÉDIO 

        Connection conexao = null;
        try {
            conexao = CriaConexao.getConexao();
        } catch (SQLException ex) {
            Logger.getLogger(JFPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        int confirma = JOptionPane.showConfirmDialog(null, "Confirma emissão de relatorio ?", "Atenção", JOptionPane.YES_NO_OPTION);

        if (confirma == JOptionPane.YES_OPTION) {

            String src = "/SistemaBiblioteca/Relatorios/Alunos/Ensino_Medio/Relatorio_Administracao_Etim.jasper";
            JasperPrint jasperPrint = null;

            try {
                jasperPrint = JasperFillManager.fillReport(src, null, conexao);
            } catch (JRException e) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao Gerar Relatorio \n" + e);
            }

            JasperViewer view = new JasperViewer(jasperPrint, false);
            view.setVisible(true);

        }
    }//GEN-LAST:event_AdministracaoActionPerformed

    private void NutricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NutricaoActionPerformed
        // RELATORIO NUTRIÇÃO E DIETÉTICA - INTEGRADO AO ENSINO MÉDIO 

        Connection conexao = null;
        try {
            conexao = CriaConexao.getConexao();
        } catch (SQLException ex) {
            Logger.getLogger(JFPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        int confirma = JOptionPane.showConfirmDialog(null, "Confirma emissão de relatorio ?", "Atenção", JOptionPane.YES_NO_OPTION);

        if (confirma == JOptionPane.YES_OPTION) {

            String src = "/SistemaBiblioteca/Relatorios/Alunos/Ensino_Medio/Relatorio_Nutricao_Etim.jasper";
            JasperPrint jasperPrint = null;

            try {
                jasperPrint = JasperFillManager.fillReport(src, null, conexao);
            } catch (JRException e) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao Gerar Relatorio \n" + e);
            }

            JasperViewer view = new JasperViewer(jasperPrint, false);
            view.setVisible(true);

        }
    }//GEN-LAST:event_NutricaoActionPerformed

    private void Nutricao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nutricao2ActionPerformed
        // RELATORIO NUTRIÇÃO E DIETÉTICA  

        Connection conexao = null;
        try {
            conexao = CriaConexao.getConexao();
        } catch (SQLException ex) {
            Logger.getLogger(JFPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        int confirma = JOptionPane.showConfirmDialog(null, "Confirma emissão de relatorio ?", "Atenção", JOptionPane.YES_NO_OPTION);

        if (confirma == JOptionPane.YES_OPTION) {

            String src = "/SistemaBiblioteca/Relatorios/Alunos/Tecnico/Relatorio_Nutricao.jasper";
            JasperPrint jasperPrint = null;

            try {
                jasperPrint = JasperFillManager.fillReport(src, null, conexao);
            } catch (JRException e) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao Gerar Relatorio \n" + e);
            }

            JasperViewer view = new JasperViewer(jasperPrint, false);
            view.setVisible(true);

        }
    }//GEN-LAST:event_Nutricao2ActionPerformed

    private void RelatorioEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RelatorioEmprestimoActionPerformed
        // RELATORIO EMPRESTIMOS 

        Connection conexao = null;
        try {
            conexao = CriaConexao.getConexao();
        } catch (SQLException ex) {
            Logger.getLogger(JFPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        int confirma = JOptionPane.showConfirmDialog(null, "Confirma emissão de relatorio ?", "Atenção", JOptionPane.YES_NO_OPTION);

        if (confirma == JOptionPane.YES_OPTION) {

            String src = "/SistemaBiblioteca/Relatorios/Emprestimos/Relatorio_Emprestimo.jasper";
            JasperPrint jasperPrint = null;

            try {
                jasperPrint = JasperFillManager.fillReport(src, null, conexao);
            } catch (JRException e) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao Gerar Relatorio \n" + e);
            }

            JasperViewer view = new JasperViewer(jasperPrint, false);
            view.setVisible(true);

        }
    }//GEN-LAST:event_RelatorioEmprestimoActionPerformed

    private void RelatorioAtrasadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RelatorioAtrasadoActionPerformed
         // RELATORIO EMPRESTIMOS ATRASADOS

        Connection conexao = null;
        try {
            conexao = CriaConexao.getConexao();
        } catch (SQLException ex) {
            Logger.getLogger(JFPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        int confirma = JOptionPane.showConfirmDialog(null, "Confirma emissão de relatorio ?", "Atenção", JOptionPane.YES_NO_OPTION);

        if (confirma == JOptionPane.YES_OPTION) {

            String src = "/SistemaBiblioteca/Relatorios/Emprestimos/Relatorio_Emprestimo_Atrasado.jasper";
            JasperPrint jasperPrint = null;

            try {
                jasperPrint = JasperFillManager.fillReport(src, null, conexao);
            } catch (JRException e) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao Gerar Relatorio \n" + e);
            }

            JasperViewer view = new JasperViewer(jasperPrint, false);
            view.setVisible(true);

        }
    }//GEN-LAST:event_RelatorioAtrasadoActionPerformed

    private void TodosAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TodosAlunosActionPerformed
         Connection conexao = null;
        try {
            conexao = CriaConexao.getConexao();
        } catch (SQLException ex) {
            Logger.getLogger(JFPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        int confirma = JOptionPane.showConfirmDialog(null, "Confirma emissão de relatorio ?", "Atenção", JOptionPane.YES_NO_OPTION);

        if (confirma == JOptionPane.YES_OPTION) {

            String src = "/SistemaBiblioteca/Relatorios/Alunos/Todos/TodosAlunos.jasper";
            JasperPrint jasperPrint = null;

            try {
                jasperPrint = JasperFillManager.fillReport(src, null, conexao);
            } catch (JRException e) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao Gerar Relatorio \n" + e);
            }

            JasperViewer view = new JasperViewer(jasperPrint, false);
            view.setVisible(true);

        }
    }//GEN-LAST:event_TodosAlunosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Administracao;
    private javax.swing.JMenuItem CadAluno;
    private javax.swing.JMenuItem CadEmprestimo;
    private javax.swing.JMenuItem CadLivro;
    private javax.swing.JMenuItem Cozinha;
    private javax.swing.JMenuItem Ds;
    private javax.swing.JMenuItem Ds2;
    private javax.swing.JMenuItem Enfermagem;
    private javax.swing.JMenu EnsinoMedio;
    private javax.swing.JMenuItem LivrosDisponiveis;
    private javax.swing.JMenuItem LivrosIndisponiveis;
    private javax.swing.JMenu MenuAluno;
    private javax.swing.JMenu MenuEmprestimo;
    private javax.swing.JMenu MenuLivro;
    private javax.swing.JMenu MenuSair;
    private javax.swing.JMenuItem Nutricao;
    private javax.swing.JMenuItem Nutricao2;
    private javax.swing.JMenu RelatorioAluno;
    private javax.swing.JMenuItem RelatorioAtrasado;
    private javax.swing.JMenuItem RelatorioEmprestimo;
    private javax.swing.JMenu RelatorioLivro;
    private javax.swing.JMenuItem SegurancaTrabalho;
    private javax.swing.JMenu Tecnico;
    private javax.swing.JMenuItem TodosAlunos;
    private javax.swing.JMenuItem TodosLivros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
