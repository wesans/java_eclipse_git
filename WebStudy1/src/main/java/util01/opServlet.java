package util01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class opServlet
 */
@WebServlet("/opServlet")
public class opServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public opServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		String op = req.getParameter("op");
		int v1=Integer.parseInt(req.getParameter("val1"));
		int v2=Integer.parseInt(req.getParameter("val2"));

		PrintWriter out=response.getWriter();
		response.setContentType("text/html; charset=utf-8");
		out.println("<html><head><title>OPERATOR</title></head><body>");
		out.println("value1: "+v1+"<br>value2: "+v2+"<br>operator: "+op+"<br>result: ");
		if(op.equals("+")) {
			out.println(v1+v2);
		}else if (op.equals("-")) {
			out.println(v1-v2);
		}else if (op.equals("*")) {
			out.println(v1*v2);
		}else {
			out.println(v1/v2);
		}
		out.println(" ("+v1+op+v2+")");
		out.println("</body></html>");
		
	}

}
