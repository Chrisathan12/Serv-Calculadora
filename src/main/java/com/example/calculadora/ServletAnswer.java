package com.example.calculadora;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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