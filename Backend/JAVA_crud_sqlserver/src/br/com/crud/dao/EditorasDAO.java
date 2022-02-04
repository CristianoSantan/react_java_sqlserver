package br.com.crud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.crud.factory.ConnectionFactory;
import br.com.crud.model.Editoras;

public class EditorasDAO {

    
	public void save(Editoras editora) {
		/*
		 * Isso � uma sql comum, os ? s�o os par�metros que n�s vamos adicionar na base
		 * de dados
		 */

		String sql = "INSERT INTO Editoras (Nome) VALUES(?)";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			// Cria uma conex�o com o banco
			conn = ConnectionFactory.createConnectionSQLServer();

			// Cria um PreparedStatement, classe usada para executar a query
			pstm = conn.prepareStatement(sql);

			// Adicionar o valor do primeiro par�metro da sql
			pstm.setString(1, editora.getNome());

			// Executar a sql para inser��o dos dados
			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// fecha as conex�es
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void removeById(int id) {
		String sql = "DELETE FROM Editoras WHERE Id_editora = ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = ConnectionFactory.createConnectionSQLServer();

			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, id);

			pstm.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}

				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void update(Editoras editora) {
		String sql = "UPDATE Editoras SET Nome = ? WHERE Id_editora = ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			// Cria uma conex�o com o banco
			conn = ConnectionFactory.createConnectionSQLServer();

			// Cria um PreparedStatement, classe usada para executar a query
			pstm = conn.prepareStatement(sql);

			// Adiciona o valor do primeiro par�metro da sql
			pstm.setString(1, editora.getNome());

			// Adicionar o valor do terceiro par�metro da sql
			pstm.setInt(2, editora.getId_editora());


			// Executa a sql para inser��o dos dados
			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Fecha as conex�es
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public List<Editoras> getEditoras() {

		String sql = "SELECT * FROM Editoras";

		List<Editoras> editoras = new ArrayList<Editoras>();

		Connection conn = null;
		PreparedStatement pstm = null;

		// Classe que vai recuperar os dados do banco de dados
		ResultSet rset = null;

		try {
			conn = ConnectionFactory.createConnectionSQLServer();

			pstm = conn.prepareStatement(sql);

			rset = pstm.executeQuery();

			// Enquanto existir dados no banco de dados, fa�a
			while (rset.next()) {
				Editoras editora = new Editoras();

				// Recupera o id do banco e atribui ele ao objeto
				editora.setId_editora(rset.getInt("Id_editora"));

				// Recupera o nome do banco e atribui ele ao objeto
				editora.setNome(rset.getString("Nome"));

				// Adiciona o contato recuperado, a lista de contatos
				editoras.add(editora);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rset != null) {
					rset.close();
				}
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return editoras;
	}
    
}
