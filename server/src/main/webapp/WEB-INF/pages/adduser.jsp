<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="forn" uri="http://www.springframework.org/tags/form" %>
<%@page pageEncoding="UTF-8" %>

<html>
<head>
    <meta charset="UTF-8">
    <title>添加用户</title>
</head>
<body>
<%--<form action="2" method="post">--%>
    <%--名字：<input type="text" name="name"><br>--%>
    <%--年龄：<input type="text" name="age">--%>
    <%--<input type="submit">--%>
<%--</form>--

<%--spring风格的form方便设置默认值--%>
<form:form action="2" methon="post" modelAttribute="user">
    名字:<forn:input path="name"/><br>
    年龄:<forn:input path="age"/><br>
    <input type="submit">
</form:form>


</body>
</html>