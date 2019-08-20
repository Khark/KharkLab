<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="bar.jsp" flush="false" />

	<!-- <script src="//ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
	<script
		src="//maxcdn.bootstrapcdn.com/bootstrap/latest/js/bootstrap.min.js"></script>
	<link
		href="//maxcdn.bootstrapcdn.com/bootstrap/latest/css/bootstrap.min.css"
		rel="stylesheet"> -->



	<style>
body {
	background: #f8f8f8;
	padding: 60px 0;
	margin: 0 auto;
}

#sfrom {
	display: inline-block;
	text-align: center;
	margin: 0 auto;
}
}
</style>


	<!-- 	<script type="text/javascript"
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.6.2/jquery.min.js"></script> -->
	<script>
		$(document).ready(function() {

			$("#login_btn").click(function() {
				var userId = $("#id").val();
				var userPW = $("#pw").val();

				if (userId == "") {
					alert("ID를 입력하세요");
					document.login.id.focus();
					return;
				}

				if (userPW == "") {
					alert("PW를 입력하세요");
					document.login.pw.focus();
					return;
				}
				document.login.submit();

			});

			/* 	$("#toBoard").click(function() {
					var userId = $("#id").val();

					if (userId == "") {
						alert("로그인을 해야 게시판으로 갈 수 있습니다.");
						return;
					} else {
						location.href = 'board/list?num=1';
						return;
					}
				}); */
		});
	</script>
	<!-- vue.js 나중에하기
	<div id="app">{{ message }}</div>
 -->
	<!-- <button type="submit" id="toBoard">게시판 가기</button>
 -->
	<div class="col-lg-12 text-center">
		<h1 class="mt-5">STUDIO 7707</h1>
		<p class="lead">made by Khark</p>
		<ul class="list-unstyled">
			<li>환영합니다</li>
		</ul>
	</div>
	<c:if test="${member == null }">
		<div class="container">
			<div class="row">
				<div class="col-lg-12 text-center">

					<form name="login" method="post" action="${path}/member/loginTry">
						<div id="sform">
							<input class="col-sm-2" type="text" name="userId" id="id"
								placeholder="id"> <input class="col-sm-2"
								type="password" name="userPw" id="pw" placeholder="Password">
						</div>

						<div>
							<table height="10px">
							</table>
						</div>


						<button type="submit" class="btn btn-primary col-sm-2"
							id="login_btn">login</button>


					</form>
					<table height="5px"></table>
					<form action="member/write" method="get">
						<button type="submit" class="btn  btn-dark col-sm-2">join</button>
					</form>



				</div>
			</div>
		</div>
	</c:if>

	<c:if test="${msg == false}">

		<p style="color: #f00;" align="center">로그인에 실패 했습니다. 아이디 또는 패스워드를
			다시 입력해주세요.</p>
	</c:if>



</body>


</body>
</html>