<%--
  Created by IntelliJ IDEA.
  User: thinkpad
  Date: 2018/12/4
  Time: 13:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>spring boot</title>
</head>
<body>
    hello ky! this is jsp!
    <a href="/save">保存</a><a href="/read">读取</a>
    <table>

        <c:forEach items="${list}" var="item">
            <tr>
                <td>${item}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
