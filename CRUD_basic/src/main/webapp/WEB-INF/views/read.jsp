<!--  -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>
		<label>글번호</label> <input type="text" name="bno"
			value="${boardVO.bno}" readonly="readonly">
	</p>

	<p>
		<label>제목</label> <input type="text" name="title"
			style="background-color: #B0E0E6;" value="${boardVO.title}"
			readonly="readonly">
	</p>


	<p>
		<label>작성자</label> <input type="text" name="writer" size="15"
			value="${boardVO.writer}" readonly="readonly">
	</p>

	<p>
		<label>내용</label>
		<textarea name=content rows="10" cols="10"
			style="background-color: #B0E0E6;" readonly="readonly">${boardVO.content}</textarea>
		<br>
		
		<form action="modify" method="get">
		<button type="submit">수정</button>
	</form>

	<form action="remove" method="post">
		<button type="submit" >삭제</button>
	</form>

	<form action="listAll" method="get">
		<button type="submit" >목록</button>
	</form> 
	</p>
	 
	
	
</body>
</html>