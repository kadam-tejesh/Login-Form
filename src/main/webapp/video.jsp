<html>
<head>
<title> video link</title>
<head>
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
    <iframe width="560" height="315" src="https://www.youtube.com/embed/OuBUUkQfBYM?si=NvotbLGo6Tj3oY-z" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>
</body>
</html>