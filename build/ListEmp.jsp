<%@ page import="java.util.List, com.itu.hello.ListDept" %>
<%
    List<ListDept> listD = (List<ListDept>) request.getAttribute("listD");
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
            <th>Departement</th>
            <th>Employe</th>
        </tr>
        <% if (listD != null) { %>
            <% for (ListDept lDept : listD) { %>
                <tr>
                <form method="get" actiion="">
                    <td><%= lDept.getDept() %></td>
                    <td><%= lDept.getNom() %></td>
                    <td><a href="formEmp?id=<%=lDept.getId()%>&emp=<%= lDept.getNom() %>&dept=<%= lDept.getDept() %>">Modifier</a></td>
                    <td><a href="emp?idDel=<%=lDept.getId()%>">Supprimer</a></td>
                </form>
                </tr>
            <% } %>
        <% } else { %>
            <tr><td colspan="2">Aucun employé trouvé.</td></tr>
        <% } %>
    </table> 
</body>
</html>
