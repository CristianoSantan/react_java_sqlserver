package br.com.crud.teste;

import br.com.crud.dao.AutoresDAO;
import br.com.crud.model.Autores;

public class AutoresTeste {

	public static void main(String[] args) {
		AutoresDAO autoresDAO = new AutoresDAO();
		
		// ------------ Cria um contato e salva no banco
		// Autores autor = new Autores();
		// autor.setNome("João");
		// autor.setSobrenome("Lino");
		
		// autoresDAO.save(autor);
		
		// ------------ Atualiza o contato com id = 1 com os dados do objeto contato1
		/* Autores autor1 = new Autores();
		autor1.setId_autor(1);
		autor1.setNome("Carla");
		autor1.setSobrenome("Andrade");;
		
		autoresDAO.update(autor1);*/
		
		// ------------ Remove o contato com id
		// autoresDAO.removeById(1);
		
		// ------------ Lista todos os contatos do banco de dados
		for (Autores a : autoresDAO.getAutores()) {
			System.out.println("Nome: " + a.getNome() + " " + a.getSobrenome());
		}
	}
}
