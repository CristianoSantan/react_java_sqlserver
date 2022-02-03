package br.com.crud.model;

public class Livros {
	
	private int Id_livro;
	private String Nome;
	private int isbn;
	private float Preco; 
	private int Id_autor;
	private Autores autor;
	private int Id_editora;
	private Editoras editora;
	
	public int getId_livro() {
		return Id_livro;
	}
	public void setId_livro(int id_livro) {
		Id_livro = id_livro;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public float getPreco() {
		return Preco;
	}
	public void setPreco(float preco) {
		Preco = preco;
	}
	public int getId_autor() {
		return Id_autor;
	}
	public void setId_autor(int id_autor) {
		Id_autor = id_autor;
	}
	public Autores getAutor() {
		return autor;
	}
	public void setAutor(Autores autor) {
		this.autor = autor;
	}
	public int getId_editora() {
		return Id_editora;
	}
	public void setId_editora(int id_editora) {
		Id_editora = id_editora;
	}
	public Editoras getEditora() {
		return editora;
	}
	public void setEditora(Editoras editora) {
		this.editora = editora;
	}

}
