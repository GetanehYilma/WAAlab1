package controller;

import model.MyInput;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calcculator")
public class CalculatorController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public CalculatorController() {
        super();

    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String add1 = request.getParameter("add1").trim();
        String add2 = request.getParameter("add2").trim();
        String mult1 = request.getParameter("mult1").trim();
        String mult2 = request.getParameter("mult2").trim();

        MyInput forAdd = new MyInput(Double.parseDouble(add1), Double.parseDouble(add2));
        MyInput forMultiply = new MyInput(Double.parseDouble(mult1), Double.parseDouble(mult2));



        request.setAttribute("forAdd", forAdd);
        request.setAttribute("forMultiply", forMultiply);



        RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/calculator.jsp");
        rd.forward(request,response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}