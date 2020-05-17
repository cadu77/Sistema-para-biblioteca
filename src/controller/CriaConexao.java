package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class CriaConexao {
    
    public static Connection getConexao() throws SQLException {
        
        try {
            // MYSQL
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost/biblioteca","root","");
            
            // SQLITE   
            //Class.forName("org.sqlite.JDBC");
            //return DriverManager.getConnection("jdbc:sqlite:/ProjectBiblioteca/Banco_Dados/biblioteca.db");
            
            // lINHA DE COMANDO
            //return DriverManager.getConnection("jdbc:mysql://localhost:3307/biblioteca3", "root", "bd777");
        } catch (ClassNotFoundException e) {
            throw new SQLException(e.getMessage());
        }   
        
    }
    
}
