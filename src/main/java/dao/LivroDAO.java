package dao;

import entities.Livro;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Date;

public class LivroDAO {

    public static void inserir(Livro livro){
        //conecta com hibernate para inserir o banco
        EntityManager em = Persistence.createEntityManagerFactory("app").createEntityManager();

        //realiza as operações para inserir no banco
        EntityTransaction entityTransaction = em.getTransaction();

        //iniciando a operação
        entityTransaction.begin();
        em.persist(livro);
        entityTransaction.commit();
        em.close();
    }

    public static Livro pesquisar(Long id){
        EntityManager em = Persistence.createEntityManagerFactory("app").createEntityManager();
        Livro l = em.find(Livro.class, id);
        em.close();
        return l;
    }
    public static void atualizar(Livro livro){
        EntityManager em = Persistence.createEntityManagerFactory("app").createEntityManager();
        EntityTransaction entityTransaction = em.getTransaction();
        entityTransaction.begin();
        em.merge(livro);
        entityTransaction.commit();
        em.close();
    }
    public static void excluir(Long id){
        EntityManager em = Persistence.createEntityManagerFactory("app").createEntityManager();
        EntityTransaction entityTransaction = em.getTransaction();
        Livro l = em.find(Livro.class, id);
        entityTransaction.begin();
        em.remove(l);
        entityTransaction.commit();
        em.close();
    }

}
