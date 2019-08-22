<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<link rel="stylesheet"
	href="//unpkg.com/bootstrap@4/dist/css/bootstrap.min.css">
<script src='//unpkg.com/jquery@3/dist/jquery.min.js'></script>
<script src='//unpkg.com/popper.js@1/dist/umd/popper.min.js'></script>
<script src='//unpkg.com/bootstrap@4/dist/js/bootstrap.min.js'></script>
<script type="text/javascript"
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.6.2/jquery.min.js"></script>
<script>
	$(document).ready(function() {
		$("#toBoard").click(function() {
			var userId = $("#id").val();

			if (userId == "") {
				alert("로그인을 해야 게시판으로 갈 수 있습니다.");
				return;
			} else {
				location.href = 'board/list?num=1';
				return;
			}
		});
	});
</script>
<body>
	<c:if test="${member != null }">
		<p>${member.userName}님환영합니다.</p>
 		<a href="member/view?userName=${member.userName}" >작성 글 보기</a>
 		<a href="member/logout">로그아웃</a>

	</c:if>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark static-top">
	<div class="container">
		<a class="navbar-brand" href="#">Project Khark</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarResponsive" aria-controls="navbarResponsive"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarResponsive">
			<ul class="navbar-nav ml-auto">
				<li class="nav-item active">
				<a  href="/" class="nav-link">Home
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link" id="toBoard"
					href="board/list?num=1">Board</a></li>
				<li class="nav-item"><a class="nav-link" href="/Info">Info&Contact</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="#">Skill</a></li>
			</ul>
		</div>
	</div>
	</nav>

	<!-- Page Content -->


	<!-- Bootstrap core JavaScript -->
	<script
		src="${pageContext.request.contextPath}/resource/jquery/jquery.slim.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.bundle.min.js"></script>

</body>
</html>