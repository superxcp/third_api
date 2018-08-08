<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table  border="1" align="center" width="30%">
    <tr >
        <td>姓名：</td>
        <td>密码：</td>
    </tr>
    <c:forEach items="${list}" var="user">
        <tr><td>${user.username}</td><td>${user.userpass}</td></tr>
    </c:forEach>
</table>
</body>
</html>