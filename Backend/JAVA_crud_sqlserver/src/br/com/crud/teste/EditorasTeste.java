package br.com.crud.teste;

import br.com.crud.dao.EditorasDAO;
import br.com.crud.model.Editoras;

public class EditorasTeste {
    public static void main(String[] args) {
        EditorasDAO editorasDAO = new EditorasDAO();
            
        // ------------ Cria um contato e salva no banco
        // Editoras editora = new Editoras();
        // editora.setNome("Unibolso");
        
        // editorasDAO.save(editora);
        
        // ------------ Atualiza o contato com id = 1 com os dados do objeto contato1
        /* Editoras editora = new Editoras();
        editora.setId_editora(1);
        editora.setNome("Carla");
        
        editorasDAO.update(editora);*/
        
        // ------------ Remove o contato com id
        // editorasDAO.removeById(1);
        
        // ------------ Lista todos os contatos do banco de dados
        for (Editoras e : editorasDAO.getEditoras()) {
            System.out.println("Nome: " + e.getNome());
        }
    }
}
