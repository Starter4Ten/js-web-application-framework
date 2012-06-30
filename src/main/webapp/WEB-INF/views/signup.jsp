<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html lang="en">
<head>

<link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
</head>
<body style="margin-top: 40px;">

<div class="navbar navbar-fixed-top">
  <div class="navbar-inner">
  </div>
</div>
    <div class="container">
    <form:form method="post" modelAttribute="signupForm" cssClass="form-horizontal well">
    <form:errors path="*" element="div" cssClass="alert alert-error" />
    <fieldset>
        <legend>About yourself</legend>
        <spring:bind path="email">
        <div class="control-group">
            <label for="email" class="control-label">Email Address</label>
            <div class="controls">
                <form:input path="email" type="email" required="required" autocomplete="off" />
                <span class="help-block">Your email address will be your username</span>
            </div>
        </div>
        </spring:bind>
        <div class="control-group">
            <label for="name" class="control-label">Real Name</label>
            <div class="controls">
                <form:input path="name" title="Real Name" type="text" required="required" autocomplete="off" />
            </div>
        </div>
    </fieldset>

    <fieldset>
        <legend>Choose Password</legend>
        <div class="control-group">
            <label for="name" class="control-label">Password</label>
            <div class="controls">
                <form:input path="password" title="Password" type="password" required="required" autocomplete="off" />
            </div>
        </div>
        <div class="control-group">
            <label for="name" class="control-label">Repeat Password</label>
            <div class="controls">
                <form:input path="passwordRpt" title="Repeat Password" type="password" required="required" autocomplete="off" />
            </div>
        </div>
    </fieldset>
    <div class="form-actions">
        <button id="submit" type="submit" class="btn btn-primary">Sign Up</button>
        <button type="reset" class="btn">Cancel</button>     
    </div>
    </form:form>
</div>

</body>
</html>