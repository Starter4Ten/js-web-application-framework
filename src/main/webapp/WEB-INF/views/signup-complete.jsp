<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
</head>
<body style="margin-top: 40px;">
<div class="navbar navbar-fixed-top">
  <div class="navbar-inner">
  </div>
</div>
    <div class="container">
      <h2> ${signupForm.name} your sign Up is complete. Thank you for your registration.</h2>
    </div>
</body>
</html>