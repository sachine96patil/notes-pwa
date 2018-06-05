
ASSIGNMENT: B5

INPUT:

package Plagarism;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Plagarism extends HttpServlet 
{

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Plagarism</title>");            
            out.println("</head>");
            out.println("<body>");
            
            String fileOne = request.getParameter("File1");
            String fileTwo = request.getParameter("File2");
            out.println("Comparing the 2 files......");
            out.println("The result of the 2 files is ....");
            if (fileOne.equals(fileTwo)) {
                out.println("Plagiarism detected. Cheaters!!!!");
            } else {
                out.println("No plagiarism detected");
            }
            
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

        @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}


////index.html file


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="Plagarism">
     
       Enter the first input <textarea name="File1" rows="5" cols="10">
       </textarea><br>
       Enter the second input<textarea name="File2" rows="5" cols="10">
       </textarea><br>
       <input type="submit" value="Check Plagarism" name="btn"/>
          </form>
    </body>
</html>
