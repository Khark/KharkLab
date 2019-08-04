<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:chose>
	<c:when test="${sessionScope.userId == null}">
		<a href="${path}/member/login.do">로그인</a>
	</c:when>
	<c:otherwise>
		${sessionScope.userName} 님 께서 로그인 중입니다.
		<a href = "${path}/member/logout.do">로그이아웃</a>
	</c:otherwise>
	
</c:chose>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>

</body>
</html>