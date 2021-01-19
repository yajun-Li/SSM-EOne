<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2021/1/14
  Time: 21:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>success</title>
</head>
<body>
登录成功
<form action="http://localhost:8080/SSM_EOne/addUser">
    姓名：<input type="text" name="name"><br>
    密码：<input type="text" name="password"><br>
    <button type="submit">注册</button>
</form>
</body>
</html>
