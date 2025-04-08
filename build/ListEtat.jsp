<%@ page import="java.util.List, com.itu.hello.Etat" %>
<%
    List<Etat> listE = (List<Etat>) request.getAttribute("etat");
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulaire</title>
</head>
<body>
    <table border='1'>
        <tr>
            <th>Libelle</th>
            <th>Montant Prevision</th>
            <th>Montant Depense total</th>
            <th>Montant restant</th>
        </tr>
        <% if (listE != null) { %>
            <% for (Etat lE : listE) { %>
                <tr>
              
                    <td><%= lE.getLibelle() %></td>
                    <td><%= lE.getPrevision() %></td>
                    <td><%= lE.getDepense() %></td>
                    <td><%= lE.getReste() %></td>
                </tr>
            <% } %>
        <% } else { %>
            <tr><td colspan="2">Aucune donnee trouvee.</td></tr>
        <% } %>
    </table> 
</body>
</html>
