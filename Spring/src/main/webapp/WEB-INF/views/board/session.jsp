<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<link rel="stylesheet"
	href="//unpkg.com/bootstrap@4/dist/css/bootstrap.min.css">
<script src='//unpkg.com/jquery@3/dist/jquery.min.js'></script>
<script src='//unpkg.com/popper.js@1/dist/umd/popper.min.js'></script>
<script src='//unpkg.com/bootstrap@4/dist/js/bootstrap.min.js'></script>
<script type="text/javascript"
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.6.2/jquery.min.js"></script>
<body>
	<table>
		<tr>
			<%-- <c:if test="${member != null }">
				<th>
					<p>${member.userName}님환영합니다.</p>
				</th>


			</c:if> --%>
			<th>${member.userName} 님 환영합니다.</th>
			<th><a href="../member/view?userName=${member.userName}">작성글
					보기</a></th>
			<th><a href="/">뒤로가기</a></th>
			<th width="50%"></th>
			<th align="right"><a href="../member/logout"> 로그아웃</a></th>
		</tr>
		<c:if test="${member == null }">
			<script language="javascript">
				alert("잘못된경로입니다.");
				location.href = "${HOME}/";
			</script>
		</c:if>
		<p></p>
	</table>
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
				<li class="nav-item active"><a class="nav-link" href="#">Home
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link" id="toBoard"
					href="board/list?num=1">Board</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Info&Contact</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="#">Skill</a></li>
			</ul>
		</div>
	</div>
	</nav>
	<script
		src="${pageContext.request.contextPath}/resource/jquery/jquery.slim.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.bundle.min.js"></script>
</body>
</html>