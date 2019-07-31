<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
 
<%-- 这里并没有指定action=""，说明表单是提交给自己的，说白了就是"哪来的回哪儿去 --%>
 
<form:form method="POST" modelAttribute="user">
		    姓名:          <form:input path="name"/><br/>
		    手机:          <form:input path="mobile"/><br/>
		    地址:          <form:input path="address"/><br/>
		    性别:          <form:input path="sex"/><br/>
		   出生日期：<form:input path="birthday"/><br/>
    <input type="submit" value="添加新用户"/>
</form:form>