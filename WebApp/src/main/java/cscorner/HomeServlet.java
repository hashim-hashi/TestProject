package cscorner;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import cscorner.DatabaseConnection;

public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		try
		{
			Connection con = DatabaseConnection.initializeDatabase();
			PreparedStatement st=con.prepareStatement("insert into project values(?,?)");
			st.setString(1, request.getParameter("projects"));
			st.setString(2, request.getParameter("engineer"));
			st.executeUpdate();
			st.close();
			con.close();
			PrintWriter out=response.getWriter();
			out.println("<html><body><b>Successfully Added" + "</b></body></html>");
			out.println("<br><a href=welcome.jsp>Go back");		
		}     
		        catch(Exception e)
		        {
		        System.out.print(e);
		        e.printStackTrace();
		        }
		

	}

}
