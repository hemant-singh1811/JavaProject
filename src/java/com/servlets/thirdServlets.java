package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class thirdServlets extends HttpServlet{
    
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{

        System.out.println("this is doGet method");
        
        res.setContentType("text/html");
        
        PrintWriter ptr=res.getWriter();
        
        ptr.println("this is third servlets");
    }
}
