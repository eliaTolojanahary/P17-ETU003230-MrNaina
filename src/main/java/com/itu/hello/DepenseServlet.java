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

public class DepenseServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException {
    
        try {
            res.setContentType("text/html");
            int idlibelle = Integer.parseInt(req.getParameter("depense").toString());
            //String montant = req.getParameter("montant");
            int montant=Integer.parseInt(req.getParameter("montantDep").toString());
            Depense d=new Depense(1,idlibelle, montant);
           // boolean existe=p.verificationprev(idlibelle);
            Boolean verifieMontant=d.verifieMontant(idlibelle, montant);
            if(verifieMontant){
                d.save();
                res.sendRedirect("formDepense"); 
            }else{
                throw new SQLException("Montant trop grande");
            }
            
        } catch (Exception e) {
            throw new ServletException(e.getMessage());
        }


    } 
}