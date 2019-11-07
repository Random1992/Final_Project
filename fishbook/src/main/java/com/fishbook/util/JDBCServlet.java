package com.fishbook.util;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCServlet extends HttpServlet {
    public void doGET(HttpServletRequest inRequest, HttpServletResponse outResponse){
        System.out.println("GET Request Processing...");
        PrintWriter out= null;
        try {
            out = outResponse.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        outResponse.setContentType("text/html;charset=utf-8");
        out.println("<strong>Hello Servlet!</strong>");
//        PrintWriter out=null;
//        Connection connection=null;
//        Statement statement=null;
//        ResultSet resultSet=null;
//
//        outResponse.setContentType("text/html");
//        try {
//            out=outResponse.getWriter();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try{
//            connection=JDBCUtil.getConn();
//            statement=connection.createStatement();
//
//            resultSet=statement.executeQuery("SELECT name FROM userInfo");
//
//            out.println(
//                    "<HTML><HEAD><TITLE>Account Number</TITLE></HEAD>"
//            );
//            out.println("<BODY>");
//            out.println("<UL>");
//
//            while (resultSet.next()){
//                out.println("<LI>"+resultSet.getString("name"));
//            }
//
//            out.println("</UL>");
//            out.println("</BODY></HTML>");
//
//            JDBCUtil.release(connection,statement,resultSet);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
    }

    public void doPost(HttpServletRequest inRequest, HttpServletResponse outResponse){
        System.out.println("POST Request Processing...");
        PrintWriter out= null;
        try {
            out = outResponse.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        outResponse.setContentType("text/html;charset=utf-8");
        String userName=inRequest.getParameter("userID");
        out.println("<strong>Hello"+userName+"!</strong>");
    }
}
