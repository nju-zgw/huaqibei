<%@ page import="com.springapp.mvc.db.entities.UserEntity" %>
<%@ page import="java.util.List" %>
<%@page pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Document</title>
</head>
<body>
    <ol>
        <% for (UserEntity e:(List<UserEntity>)request.getAttribute("users")){%>
            <li> 名字:<%out.print(e.getName());%>, 年龄:<%out.print(e.getAge());%></li>
        <%}%>
    </ol>

    <a href="add_user">添加用户</a>
</body>
</html>