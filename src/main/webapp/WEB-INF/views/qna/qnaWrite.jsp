<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Q&A Write Form Page</h1>
<form action="./qnaWrite" method="post">
<p>TITLE : <input type="text" name="title"></p>
<p>WRITER : <input type="text" name="writer"></p>
<p>AGE : <input type="text" name="age"></p>
<p>IU <input type="checkbox" name="name" value="iu">
CHOA <input type="checkbox" name="name" value="choa">
SUJI <input type="checkbox" name="name" value="suzi">

</p>
    <button>Click</button>
</form>
</body>
</html>