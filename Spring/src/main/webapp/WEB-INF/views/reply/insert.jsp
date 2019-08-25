<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<script>
	$(document).ready(function() {

		listReply();
		function listReply() {
			$.ajax({
				url : "../reply/list?bno=${dto.bno}",
				method : "GET",

				success : function(result) {
					console.log("ok");
					$("#listReply").html(result);
				}

			});
		}

		$("#buttonReply").click(function() {
			var JSON = {
				"content" : $("#insertReply").val(),
				"writer" : $("#writerReply").val(),
				"bno" : $("#idxBoard").val()

			}
			console.log(JSON);

			$.ajax({
				type : "POST",
				url : "${pageContext.request.contextPath}/reply/insertReply",
				async : true,
				data : JSON,
				success : function(data, status, xhr) {
						$("#responeReply").text("작성완료");
						$("#responeReply").css("color", "blue");
						listReply();
				}

			})

		});

	});
</script>


</head>
<body>
	<div>
		<form>${dto.bno}
			<p>===============================
				reply.jsp===============================</p>
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
	<div id="listReply">
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