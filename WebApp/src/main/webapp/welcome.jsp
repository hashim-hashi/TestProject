<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Novel Development</title>
</head>
<body>

<form action="./HomeServlet" method="post">
        <center>
            <table  >
                <thead>
                    <tr>
                        <th colspan="2">ADD PROJECT/TASK<br><br><br><br></th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Project Name</td>
                        <td><input type="text" class="" id="username" name="projects" value="" /></td>
                    </tr>
                    <tr>
                        <td><br>Engineer</td>
                        <td><br><input type="text" name="engineer" id="engineer" value="" /><br></td>
                    </tr>
                    

       
                </tbody>

                <tr>
                    <td><br><input type="submit" value="submit" name="conf" /></td>
                   
                </tr>
                
        </table>
    </form>
    <form action="./Home" method="get">
    
          <table border="2">
          
          <tr>
          <td> Project   </td>
          <td> Engineer  </td>

          </tr>

          

    </table>


</form>



</body>
</html>