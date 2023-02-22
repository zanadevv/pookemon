package com.nebrija.pookemon.controller;

import com.nebrija.pookemon.model.Pokemon;
import com.nebrija.pookemon.model.tipo.Agua;
import com.nebrija.pookemon.model.tipo.Aire;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Main", value = "/Main")
public class Main extends HttpServlet {

    Pokemon aire = new Aire(0, "Pikachu", 100, "Rayo", 20, 20, 0.9, 0.25, 50, 0.3, null, null, null);
    Pokemon agua = new Agua(0, "Pikacha", 100, "Rayo", 20, 20, 0.9, 0.25, 50, 0.3, null, null, null);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
            out.println("<button type=\"button\" id=\"atacar\">Ataque</button>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
