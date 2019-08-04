<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


<!-- <script type="text/javascript" src="<c:url value='/js/jquery.3.4.1.min.js'/>"></script>
 -->
<script type="text/javascript"
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.6.2/jquery.min.js"></script>
	

	<script>
		$(document).ready(function() {
			$("#btnSave").click(function() {				

				var title = $("#title").val();

				if (title == "") {
					alret("제목을 입력하세요");
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
			작성자 <input name="writer" id="writer" placeholder="작성자 ">
		</div>
		<div>
			내용
			<textarea name="content" id="content" rows="4" cols="80"placeholder="내용을 입력하세요"></textarea>
		</div>
		<div style="width: 650px; text-align: center;">
			<button type="button" id="btnSave">작성</button>
			<button type="reset">취소</button>
		</div>
	</form>
</body>
</html>