/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import streaming.entity.Film;
import streaming.services.FilmService;

/**
 *
 * @author admin
 */
@WebServlet(name = "AjoutFilmServlet", urlPatterns = {"/ajout_film"})
public class AjoutFilmServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("ajout_film.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Film film = new Film();
        film.setTitre(req.getParameter("titre"));
        film.setSynopsis(req.getParameter("synopsis"));
        film.setAnnee(Integer.valueOf(req.getParameter("annee")));
        film.setDuree(Integer.valueOf(req.getParameter("duree")));
        new FilmService().ajouter(film);
        resp.sendRedirect("lister_films");
    }

    

}
