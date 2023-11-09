package Code.Utils;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;


public class Conexao {
    private static Connection conexao;
    
    public static Connection criaConexao(){
        if(conexao == null){
            try {
                Class.forName("org.postgresql.Driver");
                conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/aulaSimulado", "postgres", "senai");
                System.out.println("Conexao OK");
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println("Problema ao conectar DB" +e.getMessage());
            }
        }
        return conexao;
    }
}
