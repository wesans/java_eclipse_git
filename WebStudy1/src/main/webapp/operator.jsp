<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="POST" action="opServlet">
<table>
<tr><td>value1</td><td><input type=number name=val1 id=val1></td></tr>
<tr><td>value2</td><td><input type=number name=val2 id=val2></td></tr>
<tr><td>operator</td><td>
	<select name="op" multiple="multiple" size=4>
	<option value="+">+&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</option>
	<option value="-">-&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</option>
	<option value="*">*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</option>
	<option value="/">/&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</option>
	</select></td></tr>
<tr><td colspan=2 align=center>
		<input type=submit value="전송">
</td></tr>
</table>
</form>
</body>
</html>