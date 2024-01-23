<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>User's Browser info</p>
	<%=request.getHeader("User-Agent") %>
	<br/>
	<%=request.getLocale() %>


</body>
</html>