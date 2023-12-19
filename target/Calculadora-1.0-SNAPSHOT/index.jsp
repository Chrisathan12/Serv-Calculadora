<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Calculator</title>
  <script type="text/javascript">
  <%@include file="script1.js" %>
  </script>
</head>
<body>
<label for="inp">
  Choose operation:
</label><select name="operation" id="inp" onchange="setInp()">
  <option value="1" selected>-</option>
  <option value="2">+</option>
  <option value="3">*</option>
  <option value="4">/</option>
</select>
<br><br>
<form action="Answer" method="post" id="form">
  A:<input name="a"/><br><br>B:<input name="b"/><br><br><input type="submit"  name='oper' value='-'>
</form>
</body>
</html>