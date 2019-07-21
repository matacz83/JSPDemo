package com.jsp.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet(name = "DateServlet", urlPatterns = {"/date"})
public class DateServlet extends HttpServlet {

    public void init(){
        System.out.println("servlet init");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Date date = new Date();
        PrintWriter out = response.getWriter();
        out.println(date.toString());
    }

    public void destroy(){
        System.out.println("servlet destroy");
    }
}