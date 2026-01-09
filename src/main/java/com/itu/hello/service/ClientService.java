package com.itu.hello.service;

import jakarta.servlet.ServletException;
import java.sql.Connection;
import java.sql.SQLException;
import java.math.BigDecimal;
import java.sql.Timestamp;

import com.itu.hello.dao.*;
import com.itu.hello.modele.*;

public class ClientService {
    private ClientDAO clientDAODAO = new ClientDAO();
  //  private AdminDAO adminDAO = new AdminDAO();
     public void save() {
        if (this.idClient == null) {
            clientDAO.create();
        } else {
            clientDAO.update();
        }
    }
}