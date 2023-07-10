<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>

<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello Spring world! Home2입니다.  
</h1>

	<a href="${path}"> home 가기 </a>
</body>
</html>
