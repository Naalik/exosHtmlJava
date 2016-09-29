<%-- 
    Document   : _TEMPLATE
    Created on : 28 sept. 2016, 16:11:13
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <c:import url="_HEAD.jsp"></c:import>
        </head>
        <body>
            <div class="menu"><c:import url="_MENU.jsp"></c:import></div>
            <div class="titre"><h1>Tu m'veux quoi, lel ?</h1></div>
            <div class="contenu"><form method="POST">
                    <label>Titre</label>
                    <input name="titre" type="text"><br/>
                    <label>Synopsis</label>
                    <input name="synopsis" type="text"><br/>
                    <label>Année</label>
                    <input name="annee" type="text"><br/>
                    <label>Durée</label>
                    <input name="duree" type="text"><br/>
                    <input type="submit" value="Ajouter">
                </form></div>
            <div class="pied"><c:import url="_PIED.jsp"></c:import></div>
    </body>
</html>
