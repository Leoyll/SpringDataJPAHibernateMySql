<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update ticket</title>
</head>
<body>

	<div>
		<h2 align="center">Update ticket</h2>

		<form action="/ticket/add" method="post">

			<table border="0" cellspacing="0" cellpadding="3" align="center">
				<tr>
					<th align="left">Number</th>
					<td><input type="number" step="1" min="0"
						max="9999999999999999" placeholder="length is 16 maximally"
						name="number" style="width: 300px" value=${ticket1.number} required readonly></td>
				</tr>
				<tr>
					<th align="left">Activity Name</th>
					<td><input type="text" name="activity_name" style="width: 300px" value=${ticket1.activity_name}></td>
				</tr>
				<tr>
					<th align="left">Price</th>
					<td><input type="number" step="0.01" min="0"
						max="9999999999.99"
						placeholder="Eg. 5.81"
						name="price" style="width: 300px" value=${ticket1.price}></td>
				</tr>
				<tr>
					<th align="left">Buyer</th>
					<td><input type="text" name="buyer" style="width: 300px" value=${ticket1.buyer}></td>
				</tr>
				<tr>
					<th align="left">Purchase Date</th>
					<td><input type="datetime-local" name="purDate" style="width: 300px" value=${ticket1.purDate}></td>
				</tr>
				<tr><td></td></tr>
				<tr>
					<span class="validity"></span>
					<td align="center"><input type="submit" value="Submit"></td>
					<td align="center"><input type="reset" value="Reset"></td>
				<tr>
			</table>
		</form>
	</div>

</body>
</html>