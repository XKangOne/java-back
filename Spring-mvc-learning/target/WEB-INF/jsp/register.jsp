<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<h2>注册</h2>
<form action="${pageContext.request.contextPath}/registerUser" method="post">
    <label>
        用户名:
        <input type="text" name="username"/>
     </label>
    <br>
    <label>
        密码:
        <input type="text" name="password"/>
    </label>
    <br>
    <input type="submit" value="注册"/>
</form>
</body>
</html>
