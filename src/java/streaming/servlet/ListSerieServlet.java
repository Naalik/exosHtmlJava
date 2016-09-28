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
import streaming.entity.Serie;
import streaming.services.FilmService;
import streaming.services.SerieService;

/**
 *
 * @author admin
 */
@WebServlet(name = "ListSerieServlet", urlPatterns = {"/liste_series"})
public class ListSerieServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Serie> series = new SerieService().lister();
        req.setAttribute("messeriess", series);
        
        req.getRequestDispatcher("liste_series.jsp").forward(req, resp);//nom de la page html cible
    }

    

}
