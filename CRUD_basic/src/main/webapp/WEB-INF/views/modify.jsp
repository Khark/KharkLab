<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>글 수정</title>
</head>
<body>
글 수 정    페 이 지
<form acton = "modify" method = "post">
	<body>

		<textarea name= "content" rows = "10" cols ="70">${boardVO.content}</textarea><br> 
		<button type = "submit">완료</button>	
	</body>

</form>
</html>