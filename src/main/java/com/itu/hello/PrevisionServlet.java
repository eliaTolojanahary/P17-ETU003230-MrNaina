package com.itu.hello;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

//import javax.servlet.http.HttpServletRequestWrapper;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class PrevisionServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException {
    
        try {

            res.setContentType("text/html");
            Prevision p=new  Prevision(1,"test", 0);
            List<Prevision> l=p.findAll();
            req.setAttribute("prevision",l);
            RequestDispatcher dispat = req.getRequestDispatcher("/FormDepense.jsp");
            dispat.forward(req,res);
        } catch (Exception e) {
            throw new ServletException(e.getMessage());
        }


    } 
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException {
    
        try {
            res.setContentType("text/html");
            String libelle = req.getParameter("nom");
            //String montant = req.getParameter("montant");
            int montant=Integer.parseInt(req.getParameter("montant").toString());
            Prevision p=new  Prevision(1,libelle, montant);
            boolean existe=p.verificationprev(libelle);
            if(existe){
                p.save();
                res.sendRedirect("formDepense"); 
            }else{
                throw new SQLException("Cette prevision existe deja");
            }
            
        } catch (Exception e) {
            throw new ServletException(e.getMessage());
        }


    } 
}