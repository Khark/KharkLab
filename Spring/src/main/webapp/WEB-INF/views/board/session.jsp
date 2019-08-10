<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<table>
		<tr width="100%">
			<c:if test="${member != null }">
				<th>
					<p>${member.userName}님환영합니다.</p>
				</th>
				<th><a href="/">뒤로가기</a></th>
				<th width="50%"></th>
				<th align="right"><a href ="../member/logout"> 로그아웃</a></th>

			</c:if>
			
		</tr>
		<c:if test="${member == null }">
			<script language="javascript">
				alert("잘못된경로입니다.");
				location.href = "${HOME}/";
			</script>
		</c:if>

	</table>
</body>
</html>