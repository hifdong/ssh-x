<%--
  Created by IntelliJ IDEA.
  User: hifdong
  Date: 16/1/9
  Time: 下午4:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>register</title>
</head>
<body>
    <form action="login.action" method = "post">
        <table align="center" cellpadding="0">
        <caption>用户登录</caption>
        <tr>
            <td>用户名：</td>
            <td><input type="text" name="userName"></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="password" name="password"></td>
        </tr>
        <tr>
            <td><input type="submit" value="登录"></td>
        </tr>
        </table>
    </form>
</body>
</html>
