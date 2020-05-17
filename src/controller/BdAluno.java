package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Aluno;

public class BdAluno {

    /* ----CONEXÃO COM O BD-> */
    private Connection conexao;

    // Estabelece uma conexão
    public BdAluno() throws SQLException {
        this.conexao = CriaConexao.getConexao();
    }

    /* <-CONEXÃO COM O BD---- */

 /* ----ALUNO-> */
    // CREATE - Adiciona um registro
    public void adicionaAluno(Aluno c) throws SQLException {
        // Prepara conexão p/ receber o comando SQL
        String sql = "INSERT INTO aluno(Rm_aluno, data_cadastro, nome, data_nasc, sexo, email, endereco, fone, curso, modulo)"
                + "VALUES(?,?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt;
        // stmt recebe o comando SQL
        stmt = this.conexao.prepareStatement(sql);

        // Seta os valores p/ o stmt, substituindo os "?"
        //stmt.setInt(1, c.getId());
        stmt.setInt(1, c.getRm());
        stmt.setString(2, c.getData_cadastro());
        stmt.setString(3, c.getNome());
        stmt.setString(4, c.getDataNasc());
        stmt.setString(5, c.getSexo());
        stmt.setString(6, c.getEmail());
        stmt.setString(7, c.getEndereco());
        stmt.setString(8, c.getFone());
        stmt.setString(9, c.getCurso());
        stmt.setString(10, c.getModulo());

        // O stmt executa o comando SQL no BD, e fecha a conexão
        stmt.execute();
        stmt.close();

    }

    // SELECT - Retorna uma lista com o resultado da consulta
    public List<Aluno> getLista(String nome) throws SQLException {
        // Prepara conexão p/ receber o comando SQL
        String sql = "SELECT * FROM aluno WHERE nome like ?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setString(1, nome);

        // Recebe o resultado da consulta SQL
        ResultSet rs = stmt.executeQuery();

        List<Aluno> lista = new ArrayList<>();

        // Enquanto existir registros, pega os valores do ReultSet e vai adicionando na lista
        while (rs.next()) {
            //  A cada loop, é instanciado um novo objeto, p/ servir de ponte no envio de registros p/ a lista
            Aluno c = new Aluno();

            // "c" -> Aluno novo - .setNome recebe o campo do banco de String "nome" 
            //c.setId(Integer.valueOf(rs.getString("id_aluno")));
            c.setRm(Integer.valueOf(rs.getString("Rm_aluno")));
            c.setData_cadastro(rs.getString("data_cadastro"));
            c.setNome(rs.getString("nome"));
            c.setDataNasc(rs.getString("data_nasc"));
            c.setSexo(rs.getString("sexo"));
            c.setEmail(rs.getString("email"));
            c.setEndereco(rs.getString("endereco"));
            c.setFone(rs.getString("fone"));
            c.setCurso(rs.getString("curso"));
            c.setModulo(rs.getString("modulo"));

            // Adiciona o registro na lista
            lista.add(c);
        }

        // Fecha a conexão com o BD
        rs.close();
        stmt.close();

        // Retorna a lista de registros, gerados pela consulta
        return lista;
    }

    // SELECT - Retorna uma lista com o resultado da consulta
    public List<Aluno> getListaRm(String nome) throws SQLException {
        // Prepara conexão p/ receber o comando SQL
        String sql = "SELECT * FROM aluno WHERE Rm_aluno like ?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setString(1, nome);

        // Recebe o resultado da consulta SQL
        ResultSet rs = stmt.executeQuery();

        List<Aluno> lista = new ArrayList<>();

        // Enquanto existir registros, pega os valores do ReultSet e vai adicionando na lista
        while (rs.next()) {
            //  A cada loop, é instanciado um novo objeto, p/ servir de ponte no envio de registros p/ a lista
            Aluno c = new Aluno();

            // "c" -> Aluno novo - .setNome recebe o campo do banco de String "nome" 
            //c.setId(Integer.valueOf(rs.getString("id_aluno")));
            c.setRm(Integer.valueOf(rs.getString("Rm_aluno")));
            c.setData_cadastro(rs.getString("data_cadastro"));
            c.setNome(rs.getString("nome"));
            c.setDataNasc(rs.getString("data_nasc"));
            c.setSexo(rs.getString("sexo"));
            c.setEmail(rs.getString("email"));
            c.setEndereco(rs.getString("endereco"));
            c.setFone(rs.getString("fone"));
            c.setCurso(rs.getString("curso"));
            c.setModulo(rs.getString("modulo"));

            // Adiciona o registro na lista
            lista.add(c);
        }

        // Fecha a conexão com o BD
        rs.close();
        stmt.close();

        // Retorna a lista de registros, gerados pela consulta
        return lista;
    }

    // UPDATE - Atualiza registros
    public void altera(Aluno c) throws SQLException {
        // Prepara conexão p/ receber o comando SQL
        String sql = "UPDATE aluno SET  nome=?, data_nasc=?, sexo=?, email=?, endereco=?, fone=?, curso=?, modulo=? WHERE Rm_aluno=?";

        // stmt recebe o comando SQL
        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        // Seta os valores p/ o stmt, substituindo os "?"
        // stmt.setInt(1, c.getId());
        
        //stmt.setString(1, c.getData_cadastro());
        stmt.setString(1, c.getNome());
        stmt.setString(2, c.getDataNasc());
        stmt.setString(3, c.getSexo());
        stmt.setString(4, c.getEmail());
        stmt.setString(5, c.getEndereco());
        stmt.setString(6, c.getFone());
        stmt.setString(7, c.getCurso());
        stmt.setString(8, c.getModulo());
        stmt.setInt(9, c.getRm());

        // O stmt executa o comando SQL no BD, e fecha a conexão
        stmt.execute();
        stmt.close();
    }

    // DELETE - Apaga registros
    public void remove(int id) throws SQLException {
        // Prepara conexão p/ receber o comando SQL
        String sql = "DELETE FROM aluno WHERE Rm_aluno=?";
        // stmt recebe o comando SQL
        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        // Seta o valor do ID p/ a condição de verificação SQL, dentro do stmt
        stmt.setInt(1, id);

        // Executa o codigo SQL, e fecha
        stmt.execute();
        stmt.close();

    }
    /* <-Aluno---- */
}
