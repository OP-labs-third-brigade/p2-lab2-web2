package com.example.demo1;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet (name = "calculation", urlPatterns = {"/calculation"})
public class CalculationControllerServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String formulaType = request.getParameter("formula");

        FormulaCalculator calculator = new FormulaCalculator();

        double result;
        switch (formulaType) {
            case "first":
                double param1A = Double.parseDouble(request.getParameter("param1A"));
                double param1B = Double.parseDouble(request.getParameter("param1B"));
                double param1C = Double.parseDouble(request.getParameter("param1C"));
                double param1D = Double.parseDouble(request.getParameter("param1D"));

                Cookie cookie1A = new Cookie("param1A", Double.toString(param1A));
                Cookie cookie1B = new Cookie("param1B", Double.toString(param1B));
                Cookie cookie1C = new Cookie("param1C", Double.toString(param1C));
                Cookie cookie1D = new Cookie("param1D", Double.toString(param1D));

                cookie1A.setMaxAge(60 * 60 * 48);
                cookie1B.setMaxAge(60 * 60 * 48);
                cookie1C.setMaxAge(60 * 60 * 48);
                cookie1D.setMaxAge(60 * 60 * 48);

                response.addCookie(cookie1A);
                response.addCookie(cookie1B);
                response.addCookie(cookie1C);
                response.addCookie(cookie1D);

                result = calculator.firstFormula(param1A, param1B, param1C, param1D);
                break;
            case "second":
                double param2A = Double.parseDouble(request.getParameter("param2A"));
                double param2B = Double.parseDouble(request.getParameter("param2B"));
                double param2C = Double.parseDouble(request.getParameter("param2C"));
                double param2D = Double.parseDouble(request.getParameter("param2D"));

                Cookie cookie2A = new Cookie("param2A", Double.toString(param2A));
                Cookie cookie2B = new Cookie("param2B", Double.toString(param2B));
                Cookie cookie2C = new Cookie("param2C", Double.toString(param2C));
                Cookie cookie2D = new Cookie("param2D", Double.toString(param2D));

                cookie2A.setMaxAge(60 * 60 * 48);
                cookie2B.setMaxAge(60 * 60 * 48);
                cookie2C.setMaxAge(60 * 60 * 48);
                cookie2D.setMaxAge(60 * 60 * 48);

                response.addCookie(cookie2A);
                response.addCookie(cookie2B);
                response.addCookie(cookie2C);
                response.addCookie(cookie2D);

                result = calculator.secondFormula(param2A, param2B, param2C, param2D);
                break;
            case "third":
                double param3A = Double.parseDouble(request.getParameter("param3A"));
                double param3B = Double.parseDouble(request.getParameter("param3B"));
                double param3C = Double.parseDouble(request.getParameter("param3C"));
                double param3D = Double.parseDouble(request.getParameter("param3D"));

                Cookie cookie3A = new Cookie("param3A", Double.toString(param3A));
                Cookie cookie3B = new Cookie("param3B", Double.toString(param3B));
                Cookie cookie3C = new Cookie("param3C", Double.toString(param3C));
                Cookie cookie3D = new Cookie("param3D", Double.toString(param3D));

                cookie3A.setMaxAge(60 * 60 * 48);
                cookie3B.setMaxAge(60 * 60 * 48);
                cookie3C.setMaxAge(60 * 60 * 48);
                cookie3D.setMaxAge(60 * 60 * 48);

                response.addCookie(cookie3A);
                response.addCookie(cookie3B);
                response.addCookie(cookie3C);
                response.addCookie(cookie3D);

                result = calculator.thirdFormula(param3A, param3B, param3C, param3D);
                break;
            default:
                result = Double.NaN;
                break;
        }

        request.setAttribute("result", result);
        request.getRequestDispatcher("/result.jsp").forward(request, response);
    }
}
