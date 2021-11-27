package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.sun.net.httpserver.Authenticator.Result;

import connection.SingleConnectionBanco;
import model.ModelLogin;

public class DAOUsuarioRepository {
	
	private Connection connection;
	
	public DAOUsuarioRepository() {
		connection = SingleConnectionBanco.getConnection();
	
	}
	
	public ModelLogin gravarUsuario(ModelLogin objeto) throws Exception {
		
				
		String sql =  "INSERT INTO model_login(login, senha, nome, email) VALUES (?, ?, ?, ?);";
		PreparedStatement prepareSql = connection.prepareStatement(sql);
		
		prepareSql.setString(1, objeto.getLogin());
		prepareSql.setString(2, objeto.getSenha());
		prepareSql.setString(3, objeto.getNome());
		prepareSql.setString(4, objeto.getEmail());
		
		prepareSql.execute();
		
		connection.commit();
		
		return this.consultaUsuario(objeto.getLogin());
	}
	
	public ModelLogin consultaUsuario(String login) throws Exception{
		
		ModelLogin modelLogin = new ModelLogin();
		
		String sql = "SELECT * from model_login where upper(login) = upper('"+login+"');";
		
		PreparedStatement statement = connection.prepareStatement(sql);
		
		ResultSet resultado = statement.executeQuery();
		
		while (resultado.next()) {
			
			modelLogin.setId(resultado.getLong("id"));
			modelLogin.setEmail(resultado.getString("email"));
			modelLogin.setLogin(resultado.getString("login"));
			modelLogin.setSenha(resultado.getString("senha"));
			modelLogin.setNome(resultado.getString("nome"));
		}
			
		return modelLogin;
		
	}
	
}
