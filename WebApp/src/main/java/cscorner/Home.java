package cscorner;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException 
	      {  
	         PrintWriter out = res.getWriter();  
	         res.setContentType("text/html");  
	         out.println("<html><body>"); 
		
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/projects";
		String username="root";
		String password="hashim123";
		String query="select * from project";
		Connection conn=DriverManager.getConnection(url,username,password);
		Statement stmt=conn.createStatement();
		ResultSet rs=stmt.executeQuery(query);
		out.println("<table border=1 width=50% height=50%>");
		out.println("<tr><th>Project</th><th>Engineer</th><tr>");
		
		while(rs.next())
		{
			String n=rs.getString("projects");
			String nm=rs.getString("engineer");
			
			out.println("<tr><td>" + n + "</td><td>" + nm + "</td></tr>");   
        }  
            out.println("</table>");  
            out.println("</html></body>");  
            rs.close();
		    stmt.close();
		    conn.close();
		
		}
		catch(Exception e)
		{
		    e.printStackTrace();
		    }
		}
}


