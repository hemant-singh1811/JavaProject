 package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

 
public class secondServlets extends GenericServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
            
        System.out.println("service method");
      
        res.setContentType("text/html");
        
        PrintWriter ptr= res.getWriter();
        
        ptr.write("this is resp");
        
        ptr.println(" this is second servlets");

    }
}
