<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 12.09.2019
  Time: 21:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Simple jsp page</title>
</head>
<body>
<table>
    <tr>
        <th>Name</th>
        <th>Last Name</th>
    </tr>
     <c:forEach items="${student}" var="d">
        <tr>
            <td>${d.name}</td>
            <td>${d.lastName}</td>
        </tr>
     </c:forEach>
</table>
<%--<a href="student.jsp"></a>--%>
<a href="/student/add">Add student</a>
</body>
</html>
