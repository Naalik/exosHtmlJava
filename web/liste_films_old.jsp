<%-- 
    Document   : liste_films
    Created on : 28 sept. 2016, 11:52:18
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <head>
        <title>Les films du pompage</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <a href="lister_films">Films</a> <a href="series.html">Séries</a> <a href="add_film.html">Ajouter un film...</a> <a href="add_series.html">Ajouter une série...</a> <a href="index.html">Acceuil</a>
        
        <h1>${mesfilms}</h1>
        
        <div>
            <c:forEach items="${mesfilms}" var="monfilm">${monfilm.titre}<br/></c:forEach>
        </div>
        <footer>
            ${pied}
        </footer> 
    </body>
</html>
