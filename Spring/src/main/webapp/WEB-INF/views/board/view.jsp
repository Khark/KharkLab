<%@page import="com.studio7707.DTO.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="session.jsp" flush="false" />

<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link
	href="https://fonts.googleapis.com/css?family=Nanum+Gothic:400,700,800&amp;subset=korean"
	rel="stylesheet">
<style>
p {
	font-family: "Nanum Gothic", sans-serif;
	font-size: 23px;
}

p.a {
	font-weight: 400;
}

p.b {
	font-weight: 700;
}

p.c {
	font-weight: 800;
}

p.d {
	font-weight: bold;
}

.container {
	padding-right: 15px;
	padding-left: 15px;
	margin-right: auto;
	margin-left: auto;
}
</style>

<script src="http://code.jquery.com/jquery-latest.js"></script>
<script>
	$(document).ready(function() {

		$("#btnDelete").click(function() {
			if (confirm("삭제하시겠습니까?")) {
				document.view.action = "${path}/board/delete.do"
				document.view.submit();
			}
		});
		$("#btnUpdate").click(function() {
			var bno = $("#bno").val();

			if (confirm("수정하시겠습니까?")) {
				document.view.action = "${path}/board/modify?bno=" + bno
				document.view.submit();
			}
		});

		$("#writeReply").click(function() {
			var JSON = {
				"content" : $("#insertReply").val(),
				"writer" : $("#writerReply").val(),
				"bno" : $("#idxBoard").val()

			}
			console.log(JSON);
			$.ajax({
				type : "POST",
				url : "${pageContext.request.contextPath}/board/insertReply",
				async : true,
				data : JSON,
				success : function(data, status, xhr) {

					$("#responeReply").text("작성완료");
					$("#responeReply").css("color", "blue");

				}

			})

		});

	});
</script>

<title></title>


</head>
<body>
	<p>
	<div class="container">
		<form name="view" method="post">
			<div>
				<p>제목</p>
				<input name="title" readonly="readonly" type="text"
					value="${dto.title}">

			</div>
			<%
				
			%>
			<div>
				작성자 <input name="writer" readonly="readonly" id="writer"
					value="${dto.writer}">

			</div>

			<div></div>

			<div>
				조회수 <input name="title" readonly="readonly" type="text"
					value="${dto.viewcnt}">

			</div>
			<div>
				내용
				<textarea name="content" id="content" row="4" cols="80">${dto.content}</textarea>
			</div>
			<c:set var="loginId" value="${member.userName}" />
			<c:if
				test="${member.userName == dto.writer || member.userName=='운영자' }">


				<div style="text-align: center; width: 650px;">
					<input type="hidden" name="bno" id="bno" value="${dto.bno}">
					<button type="button" id="btnUpdate">수정</button>


					<button type="button" id="btnDelete">삭제</button>

				</div>
			</c:if>
		</form>
	</div>
	<div>
${dto.bno}		<%-- <form name="writeReply" method="post"
			action="${path}/board/insertReply">
			<p>댓글</p>
			<input id="insertReply" name="insertReply" cols="100"> <input
				id="writerReply" type="hidden" value="${member.userName} ">
			<input id="idxBoard" type="hidden" value="${dto.bno} ">
			<button type="button" id="writeReply">작성</button>
			<div id="responeReply" name="responeReply"></div>
		</form> --%>
	</div>
	<script></script>
	<%@ include file="../reply/insert.jsp"%>
	<%-- 	<%@ include file = "../reply/list.jsp"%> --%>
	<c:import url="../reply/list">
		<c:param name ="bno" value ="${dto.bno}"/>
	</c:import>
	<%-- <jsp:include page="../reply/list"  flush="false">
		<jsp:param name ="bno" value="${dto.bno}"/>
	</jsp:include> --%>
</body>

</html>