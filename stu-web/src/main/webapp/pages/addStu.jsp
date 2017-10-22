<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>添加学生</h2>
	<s:if test="#parameters.message[0] == -1">
		<p style="color:red">添加学生失败!</p>
	</s:if>
	<s:elseif test="#parameters.message[0] == 1">
		<p style="color:green">添加学生成功!</p>
	</s:elseif>
	<s:form action="stuAction_addStu" method="post">
		学生姓名：<s:textfield name="stu.sname" /><br />
		学生年龄：<s:textfield name="stu.sage" /><br />
		学生性别：<s:radio list="#{1:'男',0:'女' }" value="%{1}" name="stu.ssex" /><br />
		<s:submit value="添加学生" />
	</s:form>
	<a href="${pageContext.request.contextPath }/index.jsp">首页</a>
	<a href="${pageContext.request.contextPath }/stuAction_findStuList">学生列表</a>
</body>
</html>