package br.com.crud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.crud.factory.ConnectionFactory;
import br.com.crud.model.Autores;
import br.com.crud.model.Editoras;
import br.com.crud.model.Livros;

public class LivrosDAO {
	
	public void save(Livros livro) {
		/*
		 * Isso é uma sql comum, os ? são os parâmetros que nós vamos adicionar na base
		 * de dados
		 */

		String sql = "INSERT INTO Livros (Nome, isbn, Preco, AutorId_autor, EditoraId_editora)" + "VALUES(?,?,?,?,?)";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			// Cria uma conexão com o banco
			conn = ConnectionFactory.createConnectionSQLServer();

			// Cria um PreparedStatement, classe usada para executar a query
			pstm = conn.prepareStatement(sql);

			// Adicionar o valor do primeiro parámetro da sql
			pstm.setString(1, livro.getNome());

			// Adicionar o valor do segundo parâmetro da sql
			pstm.setInt(2, livro.getIsbn());
			
			pstm.setFloat(3, livro.getPreco());
			
			pstm.setInt(4, livro.getId_autor());
			
			pstm.setInt(5, livro.getId_editora());

			// Executar a sql para inserção dos dados
			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// fecha as conexões
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
		String sql = "DELETE FROM Livros WHERE Id_livro = ?";

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

	public void update(Livros livro) {
		String sql = "UPDATE Livros SET Nome = ?, isbn = ?, Preco = ?, AutorId_autor = ?, EditoraId_editora = ? WHERE Id_livro = ? ";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			// Cria uma conexão com o banco
			conn = ConnectionFactory.createConnectionSQLServer();

			// Cria um PreparedStatement, classe usada para executar a query
			pstm = conn.prepareStatement(sql);

			// Adiciona o valor do primeiro parâmetro da sql
			pstm.setString(1, livro.getNome());

			// Adicionar o valor do segundo parâmetro da sql
			pstm.setInt(2, livro.getIsbn());
			
			pstm.setFloat(3, livro.getPreco());
			
			pstm.setInt(4, livro.getId_autor());
			
			pstm.setInt(5, livro.getId_editora());

			// Adicionar o valor do terceiro parâmetro da sql
			pstm.setInt(6, livro.getId_livro());

			// Executa a sql para inserção dos dados
			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Fecha as conexões
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

	public List<Livros> getLivros() {

		String sql = "select l.Id_livro, l.Nome, l.isbn, l.Preco, a.Id_autor, a.Nome as autor, a.Sobrenome, e.Id_editora, e.Nome as editora from Livros as l inner join Autores as a on l.AutorId_autor = a.Id_autor inner join Editoras as e on l.EditoraId_editora = e.Id_editora";

		List<Livros> livros = new ArrayList<Livros>();

		Connection conn = null;
		PreparedStatement pstm = null;

		// Classe que vai recuperar os dados do banco de dados
		ResultSet rset = null;

		try {
			conn = ConnectionFactory.createConnectionSQLServer();

			pstm = conn.prepareStatement(sql);

			rset = pstm.executeQuery();

			// Enquanto existir dados no banco de dados, faça
			while (rset.next()) {
				Livros livro = new Livros();
				Autores autor = new Autores();
				Editoras editora = new Editoras();

				// Recupera o id do banco e atribui ele ao objeto
				livro.setId_autor(rset.getInt("Id_livro"));

				// Recupera o nome do banco e atribui ele ao objeto
				livro.setNome(rset.getString("Nome"));

				// Recupera a idade do banco e atribui ele ao objeto
				livro.setIsbn(rset.getInt("isbn"));
				
				livro.setPreco(rset.getFloat("Preco"));
				
				autor.setId_autor(rset.getInt("Id_autor"));
				
				autor.setNome(rset.getString("autor"));
				
				autor.setSobrenome(rset.getString("Sobrenome"));
				
				livro.setAutor(autor);
				
				editora.setId_editora(rset.getInt("Id_editora"));
				
				editora.setNome(rset.getString("editora"));
				
				livro.setEditora(editora);

				// Adiciona o contato recuperado, a lista de contatos
				livros.add(livro);
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
		return livros;
	}
}
