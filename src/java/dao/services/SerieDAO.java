package dao.services;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import streaming.entity.Film;
import streaming.entity.Serie;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class SerieDAO {
    public List<Serie> listeSeries(){
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        List<Serie> series = em.createQuery("SELECT s FROM Serie s ORDER BY s.id DESC").getResultList();
        
        
        return series;
    }
    
    public void ajouterSerie(Serie serie) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.persist(serie);

        em.getTransaction().commit();

    }

    public void supprimerSerie(long id) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.createQuery("DELETE s FROM Serie s WHERE s.id=" + id);

        em.getTransaction().commit();

    }

    public Serie rechercherSerie(long id) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();

        return em.find(Serie.class, id);
    }
    
    public void modifierSerie(Serie serie) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.merge(serie);

        em.getTransaction().commit();

    }
}
