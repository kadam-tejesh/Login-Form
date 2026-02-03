<!DOCTYPE html>
<html>
<head>
    <title> welcome page</title>
</head>
<body>
    <%
    response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");
    response.setHeader("Expires","0");
    if(session.getAttribute("name")==null)
    {
        response.sendRedirect("index.jsp");
        out.println("enter the details");
    }
    %>
    welcome..
    <a href="video.jsp">videos here </a>
    <form action="logout">
    <input type="submit" value="logout"><br>
    </form>

</body>
</html>