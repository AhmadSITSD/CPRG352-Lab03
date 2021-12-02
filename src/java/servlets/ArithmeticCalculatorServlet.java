
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 816601
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

   


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         // load up a JSP
        String r = "---";
        request.setAttribute("result", r);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
        return;
        
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
            String firstNumber = request.getParameter("firstnum");
            String secondNumber = request.getParameter("secondnum");
            
            String addition = request.getParameter("Addition");
            String subtraction = request.getParameter("Subtraction");
            String multiplication = request.getParameter("Multiplication");
            String modulo = request.getParameter("Modulo");
            
            request.setAttribute("firstnum", firstNumber);
            request.setAttribute("secondnum", secondNumber);
            
            request.setAttribute("Addition", addition);
            request.setAttribute("Subtraction", subtraction);
            request.setAttribute("Multiplication", multiplication);
            request.setAttribute("Modulo", modulo);
            
            if (firstNumber == null || firstNumber.equals("") || secondNumber == null || secondNumber.equals("")) {
                request.setAttribute("result", "invalid");
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
                return;
               
            }
            
            int firstnum = Integer.parseInt(request.getParameter("firstnum"));
            int secondnum = Integer.parseInt(request.getParameter("secondnum"));
            
            request.setAttribute("firstnum", firstnum);
            request.setAttribute("secondnum", secondnum);
            
            if (addition != null) {
                request.setAttribute("result", firstnum + secondnum);
            }
            
            if (subtraction != null) {
                request.setAttribute("result", firstnum - secondnum);
            }
            
            if (multiplication != null) {
                request.setAttribute("result", firstnum * secondnum);
            }
            
            if (modulo != null) {
                request.setAttribute("result", firstnum % secondnum);
            }
           
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
            return;
        
        
            }

}
