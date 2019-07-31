<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List</title>
    <style>
        table,table tr th, table tr td { border:1px solid rgba(41, 36, 35, 0.96); }
        #mytable{width:800px;margin: 100px auto}
    </style>
</head>
<body>
<div id="list">
    <table id="mytable">
        <thead>
        <th>id</th>
        <th>姓名</th>
        <th>手机号</th>
        <th>地址</th>
        <th>性别</th>
        <th>出生日期</th>
        <th>修改</th>
        <th>删除</th>
        </thead>
        <tbody>
        <c:forEach items="${us}" var="user">
            <tr>
                <td>${user.id}</td>
                <td>${user.name}</td>
                <td>${user.mobile}</td>
                <td>${user.address}</td>
                <td>${user.sex}</td>
                <td>${user.birthday}</td>
                <td><a href="edit/${user.id}">edit</a> </td>
                <td><a href="delete/${user.id}">delete</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div> 
<a href="<%=request.getContextPath()%>/user/add" style="display:block;text-align:center">新增用户  </a>
 
</body>
</html>