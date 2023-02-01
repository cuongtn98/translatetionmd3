package com.example.demo4;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "TranslateServlet", value = "/TranslateServlet")
public class TranslateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String ,String> dictionary = new HashMap<>();
        dictionary.put("hello" , "xin chào");
        dictionary.put("how", "thế lào");
        dictionary.put("book", " quyển sách");
        dictionary.put("computer", "máy tính");
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        String search = request.getParameter("txtSearch");
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        String result = dictionary.get(search);
        if ( result != null) {
            writer.println("word : " + search);
            writer.println("result : " + result);
        } else {
            writer.println("not found");
        }
        writer.println("</html>");
    }

}
