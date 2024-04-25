
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class JDBC {
    private java.sql.Connection conexao;
   public Connection getConexao() {
        return conexao;
    }
    public void conectar() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost/leilão","root","Firedragon@157xyz");
            
        }catch(ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Classe de conexão não encontrada!");
        }catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na conexão com banco sql"); 
        }
    }
    public void desconectar() {
        try {
            if(conexao != null && !conexao.isClosed()) {
                conexao.close();                        
            }
        }catch (SQLException e){
        }
    }
}
