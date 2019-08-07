<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>끼에
<body>

	<script type="text/javascript"
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.6.2/jquery.min.js"></script>
	<script type="text/javascript">
		
	$()
	
	</script>
	
	
	<form action="board/list" method="get">
		<button type="submit">CRUD게시판 가기</button>
	</form>
	<tbody>
		<tr>
			<th scope="row">ID</th>
			<td><input type="text" name="userId" id = "name" class="wdp=_90">
			</td>
		</tr>

		<tr>
			<th scope="row">비밀번호</th>
			<td><input type ="password" name = "userPw" id ="pw"  class = "wdp_90">
			</td>


		</tr>



	</tbody>
	<form action = "member/login" method="get" >
		<button type="submit" id = "login_btn">login</button>
	</form>

	<form action="member/write" method="get">
		<button type="submit">회원가입</button>
	</form>


</body>


</body>
</html>