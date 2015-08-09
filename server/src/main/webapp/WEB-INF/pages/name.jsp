<%@page pageEncoding="UTF-8" %>
<%request.setCharacterEncoding("UTF-8");
%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Document</title>
</head>
<body>
<div>
    姓名:${name}<br>
    年龄:${age}

</div>
<% response.sendRedirect("users");%>
</body>
</html>

