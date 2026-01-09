package com.itu.hello.controller;

import java.io.IOException;
import java.util.List;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.itu.hello.dao.*;
import com.itu.hello.model.*;
import  com.itu.hello.service.*;
import java.io.PrintWriter;
import java.sql.SQLException;

public class ClientServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private ClientService clientService;

    public void init() throws ServletException {
        clientService = new ClientService();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String emp = request.getParameter("emp");
        int id_dept = Integer.parseInt(request.getParameter("id_dept"));
        
        // Vérifier si un ID a été envoyé (mise à jour)
        String idParam = request.getParameter("id");
        if (idParam != null && !idParam.isEmpty()) {
            int id_list_dept = Integer.parseInt(idParam);
            ListDept updatedListDept = new ListDept(id_list_dept, emp, id_dept);
    
            // Mise à jour dans la base de données
            try {
                listDeptDAO.update(updatedListDept);
                response.sendRedirect("EmpServlet"); // Redirige vers la liste mise à jour
            } catch (ServletException e) {
                throw new ServletException(e.getMessage());
            }
        } else {
            // Sinon, c'est une insertion
            ListDept newListDept = new ListDept(0, emp, id_dept);
    
            try {
                listDeptDAO.save(newListDept);
                response.sendRedirect("EmpServlet"); // Redirige vers la liste mise à jour
            } catch (ServletException e) {
                throw new ServletException(e.getMessage());
            }
        }
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action != null && action.equals("delete")) {
            int id = Integer.parseInt(request.getParameter("id"));
            PrintWriter out = response.getWriter();
            out.print(id);

            try {
                listDeptDAO.delete(id);
                response.sendRedirect("EmpServlet"); // Redirige vers la liste mise à jour
            } catch (ServletException e) {
                throw new ServletException(e.getMessage());
            }
        } else {
            // Récupérer tous les employés enregistrés
            List<ListDept> listeEmp = listDeptDAO.findAll();
            List<String> listeDept = listDeptDAO.findAllString();
            
            // Envoyer les données à la JSP
            request.setAttribute("listeDept", listeDept);
            request.setAttribute("listeEmp", listeEmp);
            request.getRequestDispatcher("list.jsp").forward(request, response);
        }
    }
    
}
