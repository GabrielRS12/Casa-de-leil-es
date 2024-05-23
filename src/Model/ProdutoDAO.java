
package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProdutoDAO {
    public static boolean cadastrar(Produto p) throws SQLException {
        try {
            JDBC conexao = new JDBC();
            conexao.conectar();
            String sql = "insert into produtos(nome, valor, status ) VALUES(?,?,?);";
            PreparedStatement query = conexao.getConexao().prepareStatement(sql);
            query.setString(1, p.getNome());
            query.setString(2, p.getValor());
            query.setString(3, p.getStatus());
            query.execute();
            conexao.desconectar();
            return true;
        }catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Erro do cadastro no banco de dados" + se);
            return false;
        }
    } public static java.util.List<Produto> listarTodos() {
        java.util.List<Produto> lista = new ArrayList<Produto>();
            try {
            JDBC conexao = new JDBC();
            conexao.conectar();
            String sql = "select * from produtos";
            PreparedStatement consulta = conexao.getConexao().prepareStatement(sql);
            ResultSet resposta = consulta.executeQuery();
            while (resposta.next()) {
                Produto p = new Produto();
                p.setId(resposta.getInt("id"));
                p.setNome(resposta.getString("nome"));
                p.setValor(resposta.getString("valor"));
                p.setStatus(resposta.getString("status"));
                lista.add(p);
            }
            conexao.desconectar();
        } catch (SQLException e) {
            System.out.println("Erro ao listar os registros do banco de dados!" + e);
        }
        return lista;
    }
    public static java.util.List<Produto> listarTodosvendidos() {
        java.util.List<Produto> lista = new ArrayList<Produto>();
            try {
            JDBC conexao = new JDBC();
            conexao.conectar();
            String sql = "select * from produtos where status = 'vendido' ";
            PreparedStatement consulta = conexao.getConexao().prepareStatement(sql);
            ResultSet resposta = consulta.executeQuery();
            while (resposta.next()) {
                Produto p = new Produto();
                p.setId(resposta.getInt("id"));
                p.setNome(resposta.getString("nome"));
                p.setValor(resposta.getString("valor"));
                p.setStatus(resposta.getString("status"));
                lista.add(p);
            }
            conexao.desconectar();
        } catch (SQLException e) {
            System.out.println("Erro ao listar os registros do banco de dados!" + e);
        }
        return lista;
    }
    public static java.util.List<Produto> listarTodosvenda() {
        java.util.List<Produto> lista = new ArrayList<Produto>();
            try {
            JDBC conexao = new JDBC();
            conexao.conectar();
            String sql = "select * from produtos where status = 'A venda' ";
            PreparedStatement consulta = conexao.getConexao().prepareStatement(sql);
            ResultSet resposta = consulta.executeQuery();
            while (resposta.next()) {
                Produto p = new Produto();
                p.setId(resposta.getInt("id"));
                p.setNome(resposta.getString("nome"));
                p.setValor(resposta.getString("valor"));
                p.setStatus(resposta.getString("status"));
                lista.add(p);
            }
            conexao.desconectar();
        } catch (SQLException e) {
            System.out.println("Erro ao listar os registros do banco de dados!" + e);
        }
        return lista;
    }
 public static Produto buscaId(int id) {
        Produto a = new Produto();

        try {
            JDBC conexao = new JDBC();
            conexao.conectar();

            //Instrução SQL
            String sql = "SELECT * FROM produtos WHERE id=?";
            PreparedStatement consulta = conexao.getConexao().prepareStatement(sql);
            consulta.setInt(1, id);
            
            //Executar a instrução SQL
            ResultSet resposta = consulta.executeQuery();
            
            if (resposta.next()) {
                a.setId(resposta.getInt("id"));
                a.setNome(resposta.getString("nome"));
                a.setValor(resposta.getString("valor"));
                a.setStatus(resposta.getString("status"));
                
            }
            
            //Desconectar do banco
            conexao.desconectar();
        }catch(SQLException e) {
            System.out.println("Erro ao buscar o registro " + id + " do banco de dados" + e);
        }
        return a;
    }
 public static boolean Editar(Produto p) {
        try {
            JDBC conexao = new JDBC();
            conexao.conectar();
            String sql = "UPDATE Produtos SET nome=?, valor=?, status=? WHERE id=?;";
            PreparedStatement consulta = conexao.getConexao().prepareStatement(sql);
            consulta.setString(1, p.getNome());
            consulta.setString(2, p.getValor());
            consulta.setString(3, p.getStatus());
            consulta.setInt(4, p.getId());
            consulta.execute();
            conexao.desconectar();
            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao buscar o registro do banco de dados"+ e);
            return false;
        }
    }
}
