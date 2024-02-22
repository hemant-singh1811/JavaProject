package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class firstServlets implements Servlet {

    ServletConfig config;
    
    @Override
    public void init(ServletConfig config) throws ServletException {
        
        this.config=config;
        System.out.println("creating object");
        
        
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("service method");
      
        res.setContentType("text/html");
        
        PrintWriter ptr= res.getWriter();
        
        ptr.write("this is by first servlets");
        
        ptr.println("dsds");
        
    }

   
    @Override
    public void destroy() {
        
        System.out.println("destroy method");
        
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    // non life-cycle method
    @Override
    public ServletConfig getServletConfig() {
        
        return this.config;
                // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getServletInfo() {
        
        return "this servlets created by hemant singh";
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
