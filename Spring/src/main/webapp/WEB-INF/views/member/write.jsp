<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<script src="http://code.jquery.com/jquery-latest.js"></script>



<script>
	$(document).ready(function() {

		$("#joinSave").click(function() {

			var userId = $("#id").val();
			var userName = $("#name").val();
			var userPw = $("#pwd").val();
			var userEmail = $("#EMAIL").val();

			if (userId == "") {
				alert("ID를 입력하세요");
				document.write.id.focus();
				return;
			}

			if (userName == "") {
				alert("이름을 입력하세요");
				document.write.id.focus();
				return;

			}

			if (userPw == "") {
				alert("패스워드를 입력하세요");
				document.write.id.focus();
				return;

			}

			if (userEmail == "") {
				alert("Email을 입력하세요");
				document.write.id.focus();
				return;

			}
			document.join.submit();

		});
	});
</script>


<title>얘 이곳은 회원가입 폼이 있는 곳이란다</title>
</head>
<body>
	<h2>회원가입</h2>
	<form name="join" method="post" action="${path}/member/join.do">

		<div>
			ID<input name="userId" id="userId" size="20" placeholder="ID를 입력하세요">
		</div>
		<div>
			이름<input name="userName" id="userName" size="20" placeholder="이름을 입력하세요">
		</div>
		<div>
			PWD<input name="userPw" id="userPw" size="20" placeholder="패스워드를 입력하세요">
		</div>
		<div>
			EMAIL<input name="userEmail" id="userEmail" size="40"
				placeholder="이메일을 입력하세요">
		</div>
		<div style="width: 350px; text-align: center;">
			<button type="button" id="joinSave">회원가입</button>
			<button type="button" type="reset">뒤로가기</button>
		</div>

	</form>
</body>
</html>