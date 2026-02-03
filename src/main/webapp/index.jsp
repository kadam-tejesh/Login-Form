<html>
<head>
    <title> Jstl </title>
    </head>
<body>
<%
response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");
response.setHeader("Expires","0");
%>
<form action="login" method="get">
    Enter Name<input type="text" name="name"><br>
    Enter Password<input type="password" name="password"><br>
    <input type="submit">
</form>

</body>
</html>
