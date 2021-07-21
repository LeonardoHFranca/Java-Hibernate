package entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Livro")
public class Livro {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    private String autor;
    private String editora;
    private String titulo;
    private Date dataLancamento;

    public Livro() {
    }

    //condição para inserir no banco
    public Livro(String autor, String editora, String titulo, Date dataLancamento) {
        this.autor = autor;
        this.editora = editora;
        this.titulo = titulo;
        this.dataLancamento = dataLancamento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }
}
