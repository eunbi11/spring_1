<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<link href="./resources/css/home.css" rel="stylesheet">
</head>
<body>
<h1>
	Hello world!  spring!
</h1>

<!-- <img src="./resources/images/spring.jpg">  -->

<P>The time on the server is ${serverTime}. </P>

<a href="./notice/noticeList?name=notice">go Notice</a>
<a href="./qna/qnaList">go Qna</a>
</body>
</html>
