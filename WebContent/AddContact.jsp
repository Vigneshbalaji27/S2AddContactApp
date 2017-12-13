<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>AddContact</title>
</head>
<body>
<h1><s:text name="addcontact.header"/></h1>
<s:form action="addcontact">
<s:text name="addcontact.uname"/><s:textfield name="bean.uname"/><br/>
<s:text name="addcontact.email"/><s:textfield name="bean.email"/><br/>
<s:submit value="AddContact"/>
</s:form>
<s:actionerror/>
</body>
</html>