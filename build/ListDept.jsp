<%@ page import="java.util.List, com.itu.hello.Dept" %>
<%
    List<Dept> listD = (List<Dept>) request.getAttribute("depts");
    
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
        </tr>
        <% if (listD != null) { %>
            <% for (Dept dept : listD) { %>
                <tr>
                    <td><%= dept.getName() %></td>
                </tr>
            <% } %>
        <% } else { %>
            <tr><td colspan="2">Aucun departement trouvé.</td></tr>
        <% } %>
    </table> 
</body>
</html>
