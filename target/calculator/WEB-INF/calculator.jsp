<%--
  Created by IntelliJ IDEA.
  User: sdblg
  Date: 9/30/2019
  Time: 2:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>

<form action="calcculator" method="post">
    <input type="text" name="add1" size="2" value="${forAdd.num1}"/>
    +
    <input type="text" name="add2" value="${forAdd.num2}" size="2"/>
    =
    <input type="text" name="sum" value="${forAdd.sum}" size="2" readonly/>
    <br/>

    <input type="text" name="mult1" value="${forMultiply.num1}" size="2"/>
    *
    <input type="text" name="mult2" value="${forMultiply.num2}" size="2"/>
    =
    <input type="text" name="product" value="${forMultiply.product}" size="2" readonly/>
    <br/>
    <input type="submit" value="Submit"/>

</form>

</body>
</html>
