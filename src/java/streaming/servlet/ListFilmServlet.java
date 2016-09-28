/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
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
@WebServlet(name = "ListFilmServlet", urlPatterns = {"/lister_films"})//href à placer dans le html
public class ListFilmServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Film> films = new FilmService().lister();
        req.setAttribute("mesfilms", films);
        req.getRequestDispatcher("liste_films.jsp").forward(req, resp);//nom de la page html cible
    }

   

}
