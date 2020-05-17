package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Livro;

public class BdLivro {

    /* ----CONEXÃO COM O BD-> */
    private Connection conexao;

    // Estabelece uma conexão
    public BdLivro() throws SQLException {
        this.conexao = CriaConexao.getConexao();
    }

    /* <-CONEXÃO COM O BD---- */

 /* ----LIVRO-> */
    // CREATE - Adiciona um registro
    public void adicionaLivro(Livro livro) throws SQLException {
        // Prepara conexão p/ receber o comando SQL
        String sql = "INSERT INTO livro(exemplar, autor, edicao, ano, categoria, localizacao, descricao, disponibilidade)"
                + "VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt;
        // stmt recebe o comando SQL
        stmt = this.conexao.prepareStatement(sql);

        // Seta os valores p/ o stmt, substituindo os "?"
        stmt.setString(1, livro.getExemplar());
        stmt.setString(2, livro.getAutor());
        stmt.setString(3, livro.getEdicao());
        stmt.setString(4, livro.getAno());
        stmt.setString(5, livro.getCategoria());
        stmt.setString(6, livro.getLocalizacao());
        stmt.setString(7, livro.getDescricao());
        stmt.setString(8, livro.getDisponibilidade());

        // O stmt executa o comando SQL no BD, e fecha a conexão
        stmt.execute();
        stmt.close();

    }

    // SELECT - Retorna uma lista com o resultado da consulta
    public List<Livro> getLista(String exemplar) throws SQLException {
        // Prepara conexão p/ receber o comando SQL
        String sql = "SELECT * FROM livro WHERE Exemplar like ?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setString(1, exemplar);

        // Recebe o resultado da consulta SQL
        ResultSet rs = stmt.executeQuery();

        List<Livro> lista = new ArrayList<>();

        // Enquanto existir registros, pega os valores do ReultSet e vai adicionando na lista
        while (rs.next()) {
            //  A cada loop, é instanciado um novo objeto, p/ servir de ponte no envio de registros p/ a lista
            Livro livro = new Livro();

            // "c" -> Registro novo - .setNome recebe o campo do banco de String "nome" 
            livro.setId(Integer.valueOf(rs.getString("id_livro")));
            livro.setExemplar(rs.getString("exemplar"));
            livro.setAutor(rs.getString("autor"));
            livro.setEdicao(rs.getString("edicao"));
            livro.setAno(rs.getString("ano"));
            livro.setCategoria(rs.getString("categoria"));
            livro.setLocalizacao(rs.getString("localizacao"));
            livro.setDescricao(rs.getString("descricao"));
            livro.setStatus(rs.getString("disponibilidade"));

            // Adiciona o registro na lista
            lista.add(livro);
        }

        // Fecha a conexão com o BD
        rs.close();
        stmt.close();

        // Retorna a lista de registros, gerados pela consulta
        return lista;
    }

    // SELECT - Retorna uma lista com o resultado da consulta
    public List<Livro> getListaId(String exemplar) throws SQLException {
        // Prepara conexão p/ receber o comando SQL
        String sql = "SELECT * FROM livro WHERE id_livro like ?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setString(1, exemplar);

        // Recebe o resultado da consulta SQL
        ResultSet rs = stmt.executeQuery();

        List<Livro> lista = new ArrayList<>();

        // Enquanto existir registros, pega os valores do ReultSet e vai adicionando na lista
        while (rs.next()) {
            //  A cada loop, é instanciado um novo objeto, p/ servir de ponte no envio de registros p/ a lista
            Livro livro = new Livro();

            // "c" -> Registro novo - .setNome recebe o campo do banco de String "nome" 
            livro.setId(Integer.valueOf(rs.getString("id_livro")));
            livro.setExemplar(rs.getString("exemplar"));
            livro.setAutor(rs.getString("autor"));
            livro.setEdicao(rs.getString("edicao"));
            livro.setAno(rs.getString("ano"));
            livro.setCategoria(rs.getString("categoria"));
            livro.setLocalizacao(rs.getString("localizacao"));
            livro.setDescricao(rs.getString("descricao"));
            livro.setStatus(rs.getString("disponibilidade"));

            // Adiciona o registro na lista
            lista.add(livro);
        }

        // Fecha a conexão com o BD
        rs.close();
        stmt.close();

        // Retorna a lista de registros, gerados pela consulta
        return lista;
    }

    // UPDATE - Atualiza registros
    public void altera(Livro livro) throws SQLException {
        // Prepara conexão p/ receber o comando SQL
        String sql = "UPDATE livro set exemplar=?, autor=?, edicao=?, ano=?, categoria=?, imagem=? localizacao=?, descricao=?, disponibilidade=?"
                + "WHERE id_livro=?";
        // stmt recebe o comando SQL
        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        // Seta os valores p/ o stmt, substituindo os "?"        
        stmt.setString(1, livro.getExemplar());
        stmt.setString(2, livro.getAutor());
        stmt.setString(3, livro.getEdicao());
        stmt.setString(4, livro.getAno());
        stmt.setString(5, livro.getCategoria());
        stmt.setString(6, livro.getLocalizacao());
        stmt.setString(7, livro.getDescricao());
        stmt.setString(8, livro.getDisponibilidade());
        // Usa o ID como parâmetro de comparação no SQL
        stmt.setInt(8, livro.getId());

        // O stmt executa o comando SQL no BD, e fecha a conexão
        stmt.execute();
        stmt.close();
    }

    // UPDATE - Altera a disponibilidade do livro
    public void alteraDisponibilidadeLivro(Livro livro) throws SQLException {
        // Prepara conexão p/ receber o comando SQL
        String sql = "UPDATE livro set disponibilidade=?"
                + "WHERE id_livro=?";
        // stmt recebe o comando SQL
        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        // Seta os valores p/ o stmt, substituindo os "?"  
        stmt.setString(1, livro.getDisponibilidade());
        // Usa o ID como parâmetro de comparação no SQL
        stmt.setInt(2, livro.getId());

        // O stmt executa o comando SQL no BD, e fecha a conexão
        stmt.execute();
        stmt.close();
    }

    // DELETE - Apaga registros
    public void remove(int id) throws SQLException {
        // Prepara conexão p/ receber o comando SQL
        String sql = "DELETE FROM livro WHERE id_livro=?";
        // stmt recebe o comando SQL
        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        // Seta o valor do ID p/ a condição de verificação SQL, dentro do stmt
        stmt.setInt(1, id);

        // Executa o codigo SQL, e fecha
        stmt.execute();
        stmt.close();

    }
    /* <-LIVRO---- */
}
