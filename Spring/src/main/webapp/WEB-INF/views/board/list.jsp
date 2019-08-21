<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<jsp:include page="session.jsp" flush="false" />
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/latest/js/bootstrap.min.js"></script>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/latest/css/bootstrap.min.css"
	rel="stylesheet">
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script>
	
	 $(document).ready(function() {
		$("#btnWrite").click(function() {
			location.href = "${path}/board/write.do";
		});

		/* 부트스트랩으로 대체되었다.
		$('p:odd').css('background-color', 'blue');
		$('tr:even').css('background-color', 'gray');
		$('tr:first').css('background-color', 'white');
 */
	}); 
</script>


</head>
<body>

	<c:set var="now" value="<%=new java.util.Date()%>" />
	<button type="button" id="btnWrite">글쓰기</button>

	<table border="1" width="600px" class="table table-striped">
		<tr style="text-align: center">
			<th>제목</th>
			<th>작성자</th>
			<!--  <th>조회수</th>-->
			<th>작성일자</th>
		</tr>
		<c:forEach var="row" items="${list}">
			<p>
			<tr>
				<td><a href="${path}/board/view?bno=${row.bno}">${row.title}</a></td>
				<td>${row.writer}</td>
				<!-- <td>${row.viewcnt}</td> -->
				<td><fmt:formatDate value="${row.regdate}" pattern="yyyy-MM-dd"/></td>
				<!-- <td><fmt:formatDate value="${row.regdate}"/></td>
 				-->
			</tr>
			</p>
		</c:forEach>
	</table>

	<c:forEach begin="1" end="${pageNum}" var="num">
		<span> <a href="/board/list?num=${num}">${num}</a>
		</span>
	</c:forEach>

</body>
</html>