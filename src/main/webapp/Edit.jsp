<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    isELIgnored="false"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<H3>WELCOME TO EDIT PAGE</H3>
<form action="update" method="POST">
<pre>
ID   : <input type="text" name="sid" value="${ob.stdId}" readonly="readonly"/>
NAME : <input type="text" name="sname" value="${ob.stdName}"/>
FEE  : <input type="text" name="sfee" value="${ob.stdFee}"/>
 <input type="submit" value="Update"/>
</pre>
</form>
</body>
</html>