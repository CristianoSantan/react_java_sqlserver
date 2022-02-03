package br.com.crud.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
		
		public static Connection createConnectionSQLServer() throws Exception {
			// Faz com que a classe seja carregada pela JVM
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
			
			// Cria a conex�o com o banco de dados ----------------------- SEM senha
			// Connection connection = DriverManager.getConnection(
				// "jdbc:sqlserver://LAPTOP-1CT7LGRM;integratedSecurity=true;databaseName=crud;");
			
			// Cria a conex�o com o banco de dados ----------------------- COM senha
			// Connection connection = DriverManager.getConnection(
					// "jdbc:sqlserver://LAPTOP-1CT7LGRM;databaseName=crud;", "usuario", "senha");
			
			// Cria a conex�o com o banco de dados ----------------------- COM senha pelo Azure
			Connection connection = DriverManager.getConnection(
					"jdbc:sqlserver://recodecris.database.windows.net;databaseName=Bookstore;", "usuario", "senha");
			
			return connection;
		}
		public static void main(String[] args) throws Exception{
			// Recupera uma conex�o com o banco de dados
			Connection con = createConnectionSQLServer();
			// Testa se a conex�o � nula
			if (con != null) {
				System.out.println("Conex�o obtida com sucesso! " + con);
				con.close();
			}
		}
}
