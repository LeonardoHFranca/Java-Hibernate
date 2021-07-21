package controller;

import dao.LivroDAO;
import entities.Livro;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.Date;

public class LivroController {

    @FXML
    TextField  textAutor, textTitulo, textEditora;

    //botao cadastrar
    public void cadastrar(ActionEvent e){
        //Coletar os dados digitados e inserir no BD
        Livro livro = new Livro();
        livro.setAutor(textAutor.getText().toString());
        livro.setTitulo(textTitulo.getText().toString());
        livro.setEditora(textEditora.getText().toString());
        livro.setDataLancamento(new Date());

        LivroDAO.inserir(livro);
    }
}
