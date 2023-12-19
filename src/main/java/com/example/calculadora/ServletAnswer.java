package com.example.calculadora;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Answer")
public class ServletAnswer extends HttpServlet {

    private Double a, b;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        a = Double.parseDouble(req.getParameter("a"));
        b = Double.parseDouble(req.getParameter("b"));
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
        System.out.println("operation : "+req.getParameter("oper"));
        String ans= "null";
        switch (req.getParameter("oper")) {
            case "-" -> {
                    ans = String.valueOf(restar(a, b));
            }
            case "+" -> {
                    ans = String.valueOf(a + b);
            }
            case "*" -> {
                    ans = String.valueOf(a * b);
            }
            case "/" -> {
                    ans = String.valueOf(a / b);
            }
        }
        req.setAttribute("answer", ans);
        req.getRequestDispatcher("Answer.jsp").forward(req, resp);
        System.out.println(ans);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    public double restar(double a,double b){
        return a-b;
    }

}