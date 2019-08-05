<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>


<script src="http://code.jquery.com/jquery-latest.js"></script>

<script>
	$(document).ready(function() {
		$("#btnWrite").click(function() {
			location.href = "${path}/board/write.do";
		});

	});
		
</script>


</head>
<body>
	<button type = "button" id="btnWrite">글쓰기</button>
	<table border="1" width="600px">
		<tr style ="text-align : center">
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>조회수</th>
			<th>작성일자</th>
		</tr>
		<c:forEach var="row" items="${list}">
			<tr>
				<td>${row.bno}</td>
				<td><a href="${path}/board/view?bno=${row.bno}">${row.title}</a></td>
				<td>${row.writer}</td>
				<td>${row.viewcnt}</td>
				<td><fmt:formatDate value="${row.regdate}"pattern="yyyy-MM-dd HH:mm:ss" /></td>

			</tr>
		</c:forEach>
	</table>

</body>
</html>