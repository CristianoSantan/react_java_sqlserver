package br.com.crud.teste;

import br.com.crud.dao.LivrosDAO;
import br.com.crud.model.Livros;

public class LivroTeste {
	
	public static void main(String[] args) {
		LivrosDAO livrosDAO = new LivrosDAO();
		
		// ------------ Cria um livro e salva no banco
		/*Livros livro = new Livros();
		livro.setNome("João");
		livro.setIsbn(654);
		livro.setPreco(59);
		livro.setId_autor(2);
		livro.setId_editora(1);
		
		livrosDAO.save(livro);*/
		
		// ------------ Atualiza o contato com id = 1 com os dados do objeto contato1
		Livros livro = new Livros();
		livro.setId_livro(1);
		livro.setNome("Game of Thrones");
		livro.setIsbn(654);
		livro.setPreco(59);
		livro.setId_autor(2);
		livro.setId_editora(1);
		
		livrosDAO.update(livro);
		
		// livrosDAO.removeById(2);
		
		// ------------ Lista todos os contatos do banco de dados
		for (Livros l : livrosDAO.getLivros()) {
			System.out.println("Nome: " + l.getNome() + " | autor: " + l.getAutor().getNome() + " | editora: " + l.getEditora().getNome());
		}
	}

}
