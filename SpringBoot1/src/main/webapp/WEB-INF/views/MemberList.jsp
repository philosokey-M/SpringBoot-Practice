<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
 <%@ page isELIgnored="false"%> 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table>
		<tr>
			<th>ID</th>
			<th>PW</th>
			<th>NAME</th>
		</tr>
		<c:forEach items="${member_list}" var="member" varStatus="status">
			<tr>
				<td>${member.id}</td>
				<td>${member.pw}</td>
				<td>${member.name}</td>
			</tr>
		</c:forEach>
	</table>


</body>
</html>