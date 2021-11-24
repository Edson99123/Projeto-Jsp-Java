package connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Classe de conexão com o banco de dados
 */
public class SingleConnectionBanco {
	/* pameters */
	private static String banco = "jdbc:postgresql://localhost:5432/projec-jsp?autoReconnect=true";
	private static String user = "postgres";
	private static String senha = "admin";
	private static Connection connection = null;

	public static Connection getConnection() {
		return connection;
	}

	static {
		conectar();
	}

	public SingleConnectionBanco() {/* Quando tiver uma instancia, vai connectar */
		conectar();
	}

	private static void conectar() {

		try {

			if (connection == null) {
				Class.forName("org.postgresql.Driver");/* Carrega o driver de conexão do banco */
				connection = DriverManager.getConnection(banco, user, senha); /* Recebe parametros de conexão */
				connection.setAutoCommit(false);/* Para não efetuar commit no banco sem permissão */
			}

		} catch (Exception e) {
			e.printStackTrace();/* mostrar erros no memento de connctar */
		}
	}

}
