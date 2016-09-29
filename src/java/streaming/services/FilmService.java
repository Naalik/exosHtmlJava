/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.services;

import dao.services.FilmDAO;
import java.util.List;
import streaming.entity.Film;

/**
 *
 * @author admin
 */
public class FilmService {
    public List<Film> lister(){
        return  new FilmDAO().listeFilms();
    }
    public void supprimer(long id){
        new FilmDAO().supprimerFilm(id);
    }
    public void rechercher(long id){
        new FilmDAO().rechercherFilm(id);
    }
    public void modifier(Film film){
        new FilmDAO().modifierFilm(film);
    }
    public void ajouter(Film film){
        new FilmDAO().ajouterFilm(film);
    }
}
