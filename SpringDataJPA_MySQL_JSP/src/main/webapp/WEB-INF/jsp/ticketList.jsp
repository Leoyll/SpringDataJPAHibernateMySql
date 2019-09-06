<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- import jstl  -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ticket Management</title>
</head>
<body>
	<h1 align="center">Ticket Management</h1>
	<div style="text-align: center">
		<table border="1" cellspacing="0" cellpadding="10" align="center">
			<tr>
				<th>Number</th>
				<th>Activity</th>
				<th>Price</th>
				<th>Owner</th>
				<th>Purchase Date</th>
				<th>Modify</th>
				<th>Delete</th>
			</tr>
			<!-- jstl statements -->
			<c:forEach items="${ticketList1}" var="item">
				<tr>
					<td><c:out value="${item.number}" /></td>
					<td><c:out value="${item.activity_name}" /></td>
					<td><c:out value="${item.price}" /></td>
					<td><c:out value="${item.buyer}" /></td>
					<td><c:out value="${item.purDate}" /></td>
					<td><a href="/ticket/preUpdate/${item.number}">Modify</a></td>
					<td><a href="/ticket/delByNumber?number=${item.number}">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>

	<h3 align="right">
		<br> <a href="/ticketAdd.html">Add new Ticket</a> 
		<br>
		<br> <a href="javascript:window.history.back();">Back</a>
		<br>
		<br> <a href="/">Back to Home</a>
	</h3>

</body>
</html>