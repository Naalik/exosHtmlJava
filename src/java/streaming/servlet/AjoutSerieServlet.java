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
import streaming.entity.Serie;
import streaming.services.FilmService;
import streaming.services.SerieService;

/**
 *
 * @author admin
 */
@WebServlet(name = "AjoutSerieServlet", urlPatterns = {"/ajout_serie"})
public class AjoutSerieServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("ajout_serie.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Serie serie = new Serie();
        serie.setTitre(req.getParameter("titre"));
        serie.setSynopsis(req.getParameter("synopsis"));
        new SerieService().ajouter(serie);
        resp.sendRedirect("lister_series");
    }

    

}
