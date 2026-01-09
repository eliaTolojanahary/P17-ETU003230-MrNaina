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

public class EtatServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException {
    
        try {

            res.setContentType("text/html");
            Etat e=new Etat("test", 0, 0, 0);
            List<Etat> listE=e.findAll();
            req.setAttribute("etat",listE);
            RequestDispatcher dispat = req.getRequestDispatcher("/ListEtat.jsp");
            dispat.forward(req,res);
        } catch (Exception e) {
            throw new ServletException(e.getMessage());
        }


    } 
  
}