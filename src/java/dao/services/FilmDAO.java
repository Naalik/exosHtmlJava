/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.services;

import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import streaming.entity.Film;

/**
 *
 * @author admin
 */
public class FilmDAO {

    public List<Film> listeFilms() {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        List<Film> films = em.createQuery("SELECT f FROM Film f ORDER BY f.id DESC").getResultList();

        return films;
    }

    public void ajouterFilm(Film film) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.persist(film);

        em.getTransaction().commit();

    }

    public void supprimerFilm(long id) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.createQuery("DELETE f FROM Film f WHERE f.id=" + id);

        em.getTransaction().commit();

    }

    public Film rechercherFilm(long id) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();

        return em.find(Film.class, id);
    }
    
    public void modifierFilm(Film film) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.merge(film);

        em.getTransaction().commit();

    }
}
