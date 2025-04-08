<%@ page import="java.util.List, com.itu.hello.Dept" %>
<%
    Integer id = null;
    List<Dept> depts = (List<Dept>) request.getAttribute("depts");
    String emp=(String)request.getAttribute("emp") ;
    String deptName=(String)request.getAttribute("deptName") ;
    if(request.getAttribute("empId") != null && !request.getAttribute("empId").toString().isEmpty()){
        id = Integer.parseInt(request.getAttribute("empId").toString());
    }else
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulaire</title>
</head>
<body>
    <form name="form1" method="post" action="emp">
        <label for="nom">Nom :</label><br><br>
        <input type="text" name="nom" id="nom"  value="<%= emp != null ? emp : "" %>"><br><br>
         <label for="departement">Departement :</label><br><br>
       <select name="departement" id="departement">
    <% for (Dept dept : depts) { %>
        <option value="<%= dept.getName() %>" 
            <%= (deptName != null && deptName.equals(dept.getName())) ? "selected" : "" %>>
            <%= dept.getName() %>
        </option>
    <% } %>
</select>
        <% if(id != null) { %>
            <input type="hidden" name="idList" value="<%= id %>">
        <% } %>
        <input type="submit" name="Submit" value="Confirmer"><br><br>
    </form>
     <a href="emp">Voir la liste</a>
     <form action="dept" method="post">
      <label for="newDepartement">Ajouter un departement :</label><br><br>
        <input type="text" name="departement" id="newDepartement"><br><br>
        <input type="submit" name="Submit" value="Ajouter"><br><br>
     </form>
      <a href="dept">Voir la liste des departements</a>
</body>
</html>