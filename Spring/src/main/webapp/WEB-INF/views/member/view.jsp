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
얘 이곳은 정보가 있는 곳이란다 아이고난1
<c:forEach var="row" items="${list}">
			<p>
			<tr>
				<td><a href="${path}/board/view?bno=${row.bno}">${row.title}</a></td>
				<td>${row.writer}</td>
				<!-- <td>${row.viewcnt}</td> -->
				<td><fmt:formatDate value="${row.regdate}" pattern="yyyy-MM-dd"/></td>
				<!-- <td><fmt:formatDate value="${row.regdate}"/></td>
 				-->
			</tr>
			</p>
		</c:forEach>
</body>
</html>