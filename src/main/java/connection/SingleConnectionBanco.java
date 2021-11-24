package connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Classe de conex�o com o banco de dados
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
				Class.forName("org.postgresql.Driver");/* Carrega o driver de conex�o do banco */
				connection = DriverManager.getConnection(banco, user, senha); /* Recebe parametros de conex�o */
				connection.setAutoCommit(false);/* Para n�o efetuar commit no banco sem permiss�o */
			}

		} catch (Exception e) {
			e.printStackTrace();/* mostrar erros no memento de connctar */
		}
	}

}
