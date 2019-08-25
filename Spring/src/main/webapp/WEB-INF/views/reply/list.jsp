<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
		<form>${dto.bno}
		<p>=============================== reply.jsp=============================== </p>
			<p>댓글</p>
			<input id="insertReply" name="insertReply" cols="100"> <input
				id="writerReply" type="hidden" value="${member.userName}"> <input
				id="idxBoard" type="hidden" value="${dto.bno}">
			<button type="button" id="buttonReply">작성</button>
			<div id="responeReply" name="responeReply"></div>
		</form>
	</div>
	<script>
	</script>
	<div>
		<c:choose>
			<c:when test="${replyCount eq '0'}">
				<p>작성된댓글이없습니다.</p>
			</c:when>
			<c:otherwise>
				<c:forEach var="row" items="${list}">
					<p>
						<td>${row.writer}</td>
						<td>${row.content}</td>
					</p>
				</c:forEach>
			</c:otherwise>
		</c:choose>

	</div>
</body>
</html>