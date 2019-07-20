package com.jsp.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "DateServlet", urlPatterns = {"/date"})
public class DateServlet extends HttpServlet {
    public void init() {
        System.out.println("servlet init");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        DateFormat currentDate = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        {
            Date date = new Date();
            out.println("aktualnie data i godzina: " + currentDate.format(date));
        }
    }

    public void destroy() {
        System.out.println("servlet destroy");
    }
}
