<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<form:form method="POST" modelAttribute="user">
    姓名:          <form:input path="name"/><br/>
    手机:          <form:input path="mobile"/><br/>
    地址:          <form:input path="address"/><br/>
    性别:          <form:input path="sex"/><br/>
    出生日期：     <form:input path="birthday"/><br/>
    <input type="submit" value="更新用户信息"/>
</form:form>