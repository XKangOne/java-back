<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>学员调查问卷</h2>
<form action="${pageContext.request.contextPath}/registerUser" method="post">
    <label>
        您的姓名:
        <input type="text" name="username"/>
    </label>
    <br>
    <select>
        您正在学习的技术方向：
        <option>java</option>
        <option>c语言</option>
        <option>go语言</option>
    </select>
    <br>
    <label>
        <input type="checkbox" name="look" value="就业找工作"/>就业找工作
        <input type="checkbox" name="work" value="工作要求"/>工作要求
        <input type="checkbox" name="hobbies" value="兴趣爱好"/>兴趣爱好
        <input type="checkbox" name="other" value="其他"/>其他
    </label>
    <br>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
