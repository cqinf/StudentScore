<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>学生管理系统</h1>
	<ul>
		<li><h3><a href="${pageContext.request.contextPath }/pages/addStu.jsp">添加学生</a></h3></li>
		<li>
			<h3><a href="${pageContext.request.contextPath }/stuAction_findStuList">学生列表</a></h3>
			<ul>
				<li><h4><a href="${pageContext.request.contextPath }/scoreAction_findStuList">添加成绩</a></h4></li>
				<li><h4><a href="${pageContext.request.contextPath }/pages/showScore.jsp">成绩列表</a></h4></li>
			</ul>
		</li>
	</ul>
</body>
</html>