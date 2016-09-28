/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.services;

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
    public List<Film> listeFilms(){
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        List<Film> films = em.createQuery("SELECT f FROM Film f ORDER BY f.id DESC").getResultList();
        
        
        return films;
    }
}