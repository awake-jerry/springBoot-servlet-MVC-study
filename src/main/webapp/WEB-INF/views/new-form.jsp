<%@ page contentType="text/html; charset=utf-8" language="java" %>
<html>
<head>
	<meta charset="utf-8">
	<title>Title</title>
</head>
<body>
	
	<!-- 상대경로로 사용, [현재 URL이 속한 계층 경로 + /save] -->
	<form action="save" method="post">
		username: <input type="text" name="username" />
		age: <input type="text" name="age" />
		<button type="submit">전송</button>
	</form>
</body>
</html>