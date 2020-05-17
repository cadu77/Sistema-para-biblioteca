package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Emprestimo;

public class BdEmprestimo {

    /* ----CONEXÃO COM O BD-> */
    private Connection conexao;

    // Estabelece uma conexão
    public BdEmprestimo() throws SQLException {
        this.conexao = CriaConexao.getConexao();
    }

    /* <-CONEXÃO COM O BD---- */

 /* ----EMPRESTIMO-> */
    // CREATE - Adiciona um registro
    public void adicionaEmprestimo(Emprestimo e) throws SQLException {
        // Prepara conexão p/ receber o comando SQL
        String sql = "INSERT INTO emprestimo(Rm_aluno, id_livro, data_emprestimo, data_devolucao) VALUES(?, ?, ?, ?)";
        PreparedStatement stmt;
        // stmt recebe o comando SQL
        stmt = this.conexao.prepareStatement(sql);

        // Seta os valores p/ o stmt, substituindo os "?"        
        stmt.setString(1, String.valueOf(e.getRm_aluno()));
        stmt.setString(2, String.valueOf(e.getId_livro()));
        stmt.setString(3, e.getData_emprestimo());
        stmt.setString(4, e.getData_devolucao());

        // O stmt executa o comando SQL no BD, e fecha a conexão
        stmt.execute();
        stmt.close();

    }

    // SELECT - Retorna uma lista com o resultado da consulta
    public List<Emprestimo> getLista(String id) throws SQLException {
        // Prepara conexão p/ receber o comando SQL
        String sql = "SELECT * FROM emprestimo WHERE Rm_aluno like ?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setString(1, id);

        // Recebe o resultado da consulta SQL
        ResultSet rs = stmt.executeQuery();

        List<Emprestimo> lista = new ArrayList<>();

        // Enquanto existir registros, pega os valores do ReultSet e vai adicionando na lista
        while (rs.next()) {
            //  A cada loop, é instanciado um novo objeto, p/ servir de ponte no envio de registros p/ a lista
            Emprestimo e = new Emprestimo();

            // "c" -> Registro novo - .setNome recebe o campo do banco de String "nome" 
            e.setId_emprestimo(Integer.valueOf(rs.getString("id_emprestimo")));
            e.setRm_aluno(Integer.valueOf(rs.getString("Rm_aluno")));
            e.setId_livro(Integer.valueOf(rs.getString("id_livro")));
            e.setData_emprestimo(rs.getString("data_emprestimo"));
            e.setData_devolucao(rs.getString("data_devolucao"));

            // Adiciona o registro na lista
            lista.add(e);
        }

        // Fecha a conexão com o BD
        rs.close();
        stmt.close();

        // Retorna a lista de registros, gerados pela consulta
        return lista;
    }

    
    public List<Emprestimo> getListaPorAluno(String id_aluno) throws SQLException {
        // Prepara conexão p/ receber o comando SQL
        String sql = "SELECT emprestimo.id_emprestimo, emprestimo.Rm_aluno, emprestimo.id_livro, emprestimo.data_emprestimo, emprestimo.data_devolucao"
                + " FROM emprestimo"
                + " INNER JOIN aluno"
                + " ON emprestimo.Rm_aluno = aluno.Rm_aluno"
                + " WHERE emprestimo.Rm_aluno = ?;";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setString(1, id_aluno);

        // Recebe o resultado da consulta SQL
        ResultSet rs = stmt.executeQuery();

        List<Emprestimo> lista = new ArrayList<>();

        // Enquanto existir registros, pega os valores do ReultSet e vai adicionando na lista
        while (rs.next()) {
            //  A cada loop, é instanciado um novo objeto, p/ servir de ponte no envio de registros p/ a lista
            Emprestimo e = new Emprestimo();

            // "c" -> Registro novo - .setNome recebe o campo do banco de String "nome" 
            e.setId_emprestimo(Integer.valueOf(rs.getString("emprestimo.id_emprestimo")));
            e.setRm_aluno(Integer.valueOf(rs.getString("emprestimo.Rm_aluno")));
            e.setId_livro(Integer.valueOf(rs.getString("emprestimo.id_livro")));
            e.setData_emprestimo(rs.getString("emprestimo.data_emprestimo"));
            e.setData_devolucao(rs.getString("emprestimo.data_devolucao"));

            // Adiciona o registro na lista
            lista.add(e);
        }

        // Fecha a conexão com o BD
        rs.close();
        stmt.close();

        // Retorna a lista de registros, gerados pela consulta
        return lista;
    }

    // DELETE - Apaga registros
    public void remove(int id) throws SQLException {
        // Prepara conexão p/ receber o comando SQL
        String sql = "DELETE FROM emprestimo WHERE id_emprestimo=?";
        // stmt recebe o comando SQL
        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        // Seta o valor do ID p/ a condição de verificação SQL, dentro do stmt
        stmt.setInt(1, id);

        // Executa o codigo SQL, e fecha
        stmt.execute();
        stmt.close();

    }
    /* <-EMPRESTIMO---- */
}
