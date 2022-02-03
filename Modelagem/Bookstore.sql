create database Bookstore2;

CREATE TABLE Autores ( 
 Id_autor INT PRIMARY KEY IDENTITY(1, 1),  
 Nome VARCHAR(50) NOT NULL,  
 Sobrenome INT NOT NULL,  
); 

CREATE TABLE Editoras ( 
 Id_editora INT PRIMARY KEY IDENTITY(1, 1),  
 Nome VARCHAR(50) NOT NULL,  
); 

CREATE TABLE Livros ( 
 Id_livro INT PRIMARY KEY IDENTITY(1, 1),  
 Nome VARCHAR(50) NOT NULL,  
 isbn INT NOT NULL,  
 Preco FLOAT NOT NULL,  
 AutorId_autor INT NOT NULL,  
 EditoraId_editora INT NOT NULL,  
); 

ALTER TABLE Livros ADD FOREIGN KEY(AutorId_autor) REFERENCES Autores (Id_autor)
ALTER TABLE Livros ADD FOREIGN KEY(EditoraId_editora) REFERENCES Editoras (Id_editora)