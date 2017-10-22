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
	<h2>添加成绩</h2>
	<s:if test="#parameters.message[0] == -1">
		<p style="color:red">添加成绩失败!</p>
	</s:if>
	<s:elseif test="#parameters.message[0] == 1">
		<p style="color:green">添加成绩成功!</p>
	</s:elseif>
	<s:form action="scoreAction_addScore">
		次数：<s:textfield name="score.sfrequency" /><br />
		语文成绩：<s:textfield name="score.schinese" /><br />
		数学成绩：<s:textfield name="score.smathematics" /><br />
		英语成绩：<s:textfield name="score.senglish" /><br />
		物理成绩：<s:textfield name="score.sphysics" /><br />
		化学成绩：<s:textfield name="score.schemistry" /><br />
		生物成绩：<s:textfield name="score.sbiology" /><br />
		地理成绩：<s:textfield name="score.sgeography" /><br />
		政治成绩：<s:textfield name="score.spolitics" /><br />
		历史成绩：<s:textfield name="score.shistory" /><br />
		选择学生：<s:select name="score.stu.sno" list="#request.sList" listKey="sno" listValue="sname" headerKey="" headerValue="请选择学生" /><br />
		<s:submit value="添加" />
	</s:form>
	<a href="${pageContext.request.contextPath }/index.jsp">首页</a>
	<a href="${pageContext.request.contextPath }/pages/showScore.jsp">分数列表</a>
</body>
</html>