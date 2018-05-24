<%--
  Created by IntelliJ IDEA.
  User: dangkhoa
  Date: 24/05/2018
  Time: 11:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Welcome</h1>
<h3>Account: ${user.account}</h3>
<h3>Name: ${user.name}</h3>
<h3>Email: ${user.email}</h3>
<h3>Age: ${user.age}</h3>
</body>
</html>
Bước 12: Tạo view error.jsp

View error.jsp hiển thị trang thông báo lỗi trong trường hợp đăng nhập thất bại.

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Error</title>
</head>
<body>
<h1>Login error</h1>
</body>
</html>
