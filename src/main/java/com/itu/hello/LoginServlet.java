package com.itu.hello;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
        String nom = req.getParameter("nom");
        String mdp = req.getParameter("mdp");
        //int id=Integer.parseInt(req.getParameter("id").toString());
        try {
            Admin a=new Admin(nom, mdp);
            if(a.verificationCompte(nom,mdp)){
                res.sendRedirect("formDepense"); 
            }else{
                res.sendRedirect("/"); 
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
            req.setAttribute("error", "Erreur lors de l'opération: " + e.getMessage());
            RequestDispatcher dispatcher = req.getRequestDispatcher("/error.jsp");
            dispatcher.forward(req, res);
        }
    }

    
}