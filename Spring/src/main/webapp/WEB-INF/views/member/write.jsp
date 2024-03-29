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
			var userId = $("#userId").val();
			var userName = $("#userName").val();
			var userPw = $("#userPw").val();
			var userEmail = $("#userEmail").val();
			console.log("console LOG:" + userId);
			if (userId == "") {
				alert("ID를 입력하세요");
				document.join.userId.focus();
				return;
			}
			if (userName == "") {
				alert("이름을 입력하세요");
				document.join.userName.focus();
				return;
			}
			if (userPw == "") {
				alert("패스워드를 입력하세요");
				document.join.userPw.focus();
				return;
			}
			if (userEmail == "") {
				alert("Email을 입력하세요");
				document.join.userEmail.focus();
				return;
			}
			document.join.submit();
		});

		$("#userId").blur(function() {
			var user_Id = { //JSON용
					"userId" : $("#userId").val()
			}
			
			$.ajax({
				type : "POST",
				url : "${pageContext.request.contextPath}/member/checkId",
				data : user_Id, //JSON용
					//{"userId" : $("#userId").val()},
				success : function(data, status, xhr) {
					if ($.trim(data) == 0) {
						$("#checkID").text("사용 가능한 ID입니다.");
						$("#checkID").css("color", "blue");

					} else {
						$("#checkID").text("사용 불가능한 ID입니다.");
						$("#checkID").css("color", "red");
						$("#join").attr("disable", true);

					}
				}

			})

		});

		$("#userName").blur(function() {
			//JSON용
			var user_name = {
					"userName" : $("#userName").val()
			}
			 $.ajax({
				type : "POST",
				url : "${pageContext.request.contextPath}/member/checkName",
				data : 
					user_name,// JSON사용
					//{"userName" : $("#userName").val()},  //JSON 미사용
				
				success : function(data) {
					if ($.trim(data) == 0) {
						$("#checkName").text("사용 가능한 닉네임입니다.");
						$("#checkName").css("color", "blue");

					} else {
						$("#checkName").text("사용 불가능한 닉네임입니다.");
						$("#checkName").css("color", "red");
						$("#join").attr("disable", true);

					}
				}

			}) 
			
			
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
			<div id="checkID" name="checkId"></div>
		</div>
		<div>
			닉네임<input name="userName" id="userName" size="20"
				placeholder="닉네임을 입력하세요">
			<div id="checkName" name="checkName"></div>

		</div>
		<div>
			PWD<input name="userPw" id="userPw" size="20"
				placeholder="패스워드를 입력하세요">
		</div>
		<div>
			EMAIL<input name="userEmail" id="userEmail" size="40"
				placeholder="이메일을 입력하세요">
		</div>
		<div style="width: 350px; text-align: center;">
			<button type="button" id="joinSave" name="joinSave">회원가입</button>
			<input type="button" value="뒤로가기" onclick="location.href='/'">
		</div>

	</form>
</body>
</html>