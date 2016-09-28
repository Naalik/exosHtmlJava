/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.services;

import dao.services.FilmDAO;
import dao.services.SerieDAO;
import java.util.List;
import streaming.entity.Film;
import streaming.entity.Serie;

/**
 *
 * @author admin
 */
public class SerieService {
    public List<Serie> lister(){
        return  new SerieDAO().listeSeries();
    }
}
