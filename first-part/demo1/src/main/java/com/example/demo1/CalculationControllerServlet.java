package com.example.demo1;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/calculation")
public class CalculationControllerServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String formulaType = request.getParameter("formula");
        double paramA = Double.parseDouble(request.getParameter("paramA"));
        double paramB = Double.parseDouble(request.getParameter("paramB"));
        double paramC = Double.parseDouble(request.getParameter("paramC"));
        double paramD = Double.parseDouble(request.getParameter("paramD"));

        FormulaCalculator calculator = new FormulaCalculator();

        double result;
        switch (formulaType) {
            case "first":
                result = calculator.firstFormula(paramA, paramB, paramC, paramD);
                break;
            case "second":
                result = calculator.secondFormula(paramA, paramB, paramC, paramD);
                break;
            case "third":
                result = calculator.thirdFormula(paramA, paramB, paramC, paramD);
                break;
            default:
                result = Double.NaN;
                break;
        }

        request.setAttribute("result", result);
        request.getRequestDispatcher("/result.html").forward(request, response);
    }
}