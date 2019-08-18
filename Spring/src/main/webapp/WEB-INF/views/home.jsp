<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>끼에
<body>

	<script type="text/javascript"
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.6.2/jquery.min.js"></script>
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


	<button type="submit" id="toBoard">게시판 가기</button>

	<c:if test="${member == null }">
		<form name="login" method="post" action="${path}/member/loginTry">
			<tr>
				<th scope="row">ID</th>
				<td><input type="text" name="userId" id="id" class="wdp=_90">
				</td>
			</tr>

			<tr>
				<th scope="row">비밀번호</th>
				<td><input type="password" name="userPw" id="pw" class="wdp_90"></td>
			</tr>

		</form>
		<form action="member/write" method="get">
			<button type="submit">회원가입</button>
		</form>
		<button type="submit" id="login_btn">login</button>
	</c:if>

	<c:if test="${msg == false}">

		<p style="color: #f00;">로그인에 실패 했습니다. 아이디 또는 패스워드를 다시 입력해주세요.</p>
	</c:if>


	<c:if test="${member != null }">
		<p>${member.userName}님환영합니다.</p>
		<a href="member/logout">로그아웃</a>

	</c:if>
</body>


</body>
</html>