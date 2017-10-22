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
	<h2>学生信息</h2>
	<s:if test="message == 2">
		<p style="color:green">修改成功！</p>
	</s:if>
	<s:elseif test="message == 3">
		<p style="color:green">删除成功！</p>
	</s:elseif>
	<s:elseif test="message == -1">
		<p style="color:red">操作失败！</p>
	</s:elseif>
	<table id="mytable" border="1" width="500">
		<tr>
			<th>编号</th>
			<th>学生姓名</th>
			<th>学生年龄</th>
			<th>学生性别</th>
			<th>管理</th>
		</tr>
		<s:iterator var="s" value="#request.sList" status="ids">
			<tr>
				<td>${ids.count }</td>
				<td>${s.sname }</td>
				<td>${s.sage }</td>
				<td>${s.ssex == 1?"男":"女" }</td>
				<td>
					<a href="${pageContext.request.contextPath }/stuAction_getStuById?stu.sno=${s.sno}">修改</a>
					<a href="${pageContext.request.contextPath }/stuAction_deleteStu?stu.sno=${s.sno}">删除</a>
				</td>
			</tr>
		</s:iterator>
	</table>
	<a href="${pageContext.request.contextPath }/index.jsp">首页</a>
	<a href="${pageContext.request.contextPath }/pages/addStu.jsp">添加学生</a>
</body>
</html>