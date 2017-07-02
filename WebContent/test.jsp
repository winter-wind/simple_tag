<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!--应用  看myTag.xml -->
    <!-- 导入标签库 -->
<%@taglib uri="http://www.biibi.cc/myTag/core" prefix="myTag" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- 调用 -->
<myTag:nicetomeetyou value="${param.name }" count="10"/>

</body>
</html>