<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<jsp:include page="session.jsp" flush="false" />

<script src="http://code.jquery.com/jquery-latest.js"></script>

<script>
	$(document).ready(function() {

		$("#btnSave").click(function() {

			var title = $("#title").val();
			var content = $("#content").val();

			if (title == "") {
				alert("제목을 입력하세요");
				document.write.title.focus();
				return;
			}

			if (content == "") {
				alert("내용을 입력하세요")
				document.write.content.focus();
				return;
			}

			document.write.submit();
		});
	});
</script>

<title>Insert title here</title>
</head>
<body>
	<h2>게시글 작성</h2>
	<form name="write" method="post" action="${path}/board/insert.do">
		<div>
			제목 <input name="title" id="title" size="80" placeholder="제목을 입력하세요">
		</div>
		<div>
			<input name="writer" id="writer" type="hidden" value="${member.userName}">
		</div>
		<div>
			내용
			<textarea name="content" id="content" rows="4" cols="80"
				placeholder="내용을 입력하세요"></textarea>
		</div>
		<div style="width: 650px; text-align: center;">
			<button type="button" id="btnSave">작성</button>
			<button type="reset">취소</button>
		</div>
	</form>
</body>
</html>