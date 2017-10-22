<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/Chart.js"></script>
<style type="text/css">
	#div1{display: none}
</style>
<script type="text/javascript">
	function loadData() {
		$.post("scoreAction_findScoreList", null, function(data) {
			$("#mytable tr:not(:first)").remove();
			$.each(data.sList, function(i, v) {
				var tr = "<tr><td>" + (i + 1) + "</td><td>" + v[1].sname
						+ "</td><td>第" + v[0].sfrequency + "次月考</td><td>"
						+ v[0].schinese + "</td><td>" + v[0].smathematics
						+ "</td><td>" + v[0].senglish + "</td><td>"
						+ v[0].sphysics + "</td><td>" + v[0].schemistry
						+ "</td><td>" + v[0].sbiology + "</td><td>"
						+ v[0].sgeography + "</td><td>" + v[0].spolitics
						+ "</td><td>" + v[0].shistory
						+ "</td><td><a href='javascript:;' onclick='showRadar("+JSON.stringify(v)+")'>查看图表</a></td></tr>";
				$("#mytable").append(tr);
			});
		}, "json");
	}
	window.onload = loadData;
	
	/* 点击哪个学生就显示哪个学生的雷达图信息 */
	var num = -1;
	function showRadar(info){
		if(num == info[0].sno){
			$("#div1").slideUp();
			num = -1;
		}else{
			num = info[0].sno;
			$("#div1").slideDown();
		}
		var data = {
			labels : ["语文","数学","英语","物理","化学","生物","地理","政治","历史"],
			datasets : [
				{
					label : info[1].sname+"的成绩",
					fillColor : "rgba(151,187,205,0.5)",
					strokeColor : "rgba(151,187,205,1)",
					pointColor : "rgba(151,187,205,1)",
					pointStrokeColor : "#fff",
					data : [info[0].schinese, info[0].smathematics, info[0].senglish, info[0].sphysics, info[0].schemistry, info[0].sbiology, info[0].sgeography, info[0].spolitics, info[0].shistory]
				}
			]
		}
		
		var ctx = document.getElementById("myChart").getContext("2d");
		var myChart = new Chart(ctx,{
			type: 'radar',
			data: data,
			options: {
				showLines: false
			}
		});
	}
</script>
</head>
<body>
	<h2>成绩列表</h2>
	<table id="mytable" border="1" style="width: 1100px;">
		<tr>
			<th>编号</th>
			<th>学生姓名</th>
			<th>次数</th>
			<th>语文成绩</th>
			<th>数学成绩</th>
			<th>英语成绩</th>
			<th>物理成绩</th>
			<th>化学成绩</th>
			<th>生物成绩</th>
			<th>地理成绩</th>
			<th>政治成绩</th>
			<th>历史成绩</th>
			<th>操作</th>
		</tr>
	</table>
	<div id="div1" style="width:350px;height:350px;">
		<canvas id="myChart" width="350" height="350"></canvas>
	</div>
	<a href="${pageContext.request.contextPath }/index.jsp">首页</a>
	<a href="${pageContext.request.contextPath }/scoreAction_findStuList">添加成绩</a>
</body>
</html>