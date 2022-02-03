package br.com.crud.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
		
		public static Connection createConnectionSQLServer() throws Exception {
			// Faz com que a classe seja carregada pela JVM
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
			
			// Cria a conexão com o banco de dados ----------------------- SEM senha
			// Connection connection = DriverManager.getConnection(
				// "jdbc:sqlserver://LAPTOP-1CT7LGRM;integratedSecurity=true;databaseName=crud;");
			
			// Cria a conexão com o banco de dados ----------------------- COM senha
			// Connection connection = DriverManager.getConnection(
					// "jdbc:sqlserver://LAPTOP-1CT7LGRM;databaseName=crud;", "usuario", "senha");
			
			// Cria a conexão com o banco de dados ----------------------- COM senha pelo Azure
			Connection connection = DriverManager.getConnection(
					"jdbc:sqlserver://recodecris.database.windows.net;databaseName=Bookstore;", "adminazure", "@admin123");
			
			return connection;
		}
		public static void main(String[] args) throws Exception{
			// Recupera uma conexão com o banco de dados
			Connection con = createConnectionSQLServer();
			// Testa se a conexão é nula
			if (con != null) {
				System.out.println("Conexão obtida com sucesso! " + con);
				con.close();
			}
		}
}
