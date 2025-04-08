<%@ page import="java.util.List, com.itu.hello.Prevision" %>
<%
  //  Integer id = null;
    List<Prevision> prevs = (List<Prevision>) request.getAttribute("prevision");

%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulaire</title>
</head>
<body>
<p>Inserer votre depense <p>
    <form name="form1" method="post" action="AjoutDep">

         <label for="depense">Libelle :</label><br><br>
       <select name="depense" id="depense">
    <% for (Prevision prev : prevs) { %>
        <option value="<%= prev.getId() %>">
            <%= prev.getLibelle() %>
        </option>
    <% } %>
</select><br><br>
<label for="depense">montant :</label><br><br>
<input type="number" name="montantDep"><br><br>
        <input type="submit" name="Submit" value="Confirmer"><br><br>
    </form>
    <a href="FormPrevision.jsp">Inserer une prevision</a><br><br>
     <a href="etat">Voir l'etat actuel</a>
</body>
</html>