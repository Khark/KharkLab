<%@page import="com.studio7707.VO.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="text/javascript" src="<c:url value='/js/jquery.3.4.1.min.js'/>"></script>
<script>
	$(document).ready(function()){
		$("#btnDelete").click(function(){
			if(confirm("r u sure?")){
				document.form1.action ="${path}/board/delete.do";
				document.form1.subit();
			}
				
		});

</script>
</head>
<body>
<form name ="form1" method ="post">
	<div>
		제목
		<input name ="title" readonly = "readonly" type ="text" value = "${dto.title}">	
	
	</div>
	<%
	%>
	<div>	
		작성자
		<input name ="writer" readonly="readonly" id ="writer" value = "${dto.writer}" >
		
	</div>

	<div>
		
	</div>

	<dtv>
		조회수   <!--  {VO.viewcnt}  viewcnt 미구현-->
	</dtv>
	<div>
		내용
		<textarea name ="content" id ="content" row ="4" cols = "80">${dto.content}</textarea>
	</div>
	<div style = "text-align : center; width:650px; ">
		<input type = "hidden" name = "bno" value ="${dto.bno}">
		<button type = "button" id = "btnUpdate">수정</button>
		<button type = "button" id = "btnDelete">삭제</button>
	</div>
	

</form>
</body>
</html>