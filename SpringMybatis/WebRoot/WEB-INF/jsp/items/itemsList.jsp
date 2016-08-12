<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询商品列表</title>
</head>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.4.4.min.js"></script>
<script type="text/javascript">
	function deleteByIds()
	{
		var form = document.forms[0];
		form.action = "${pageContext.request.contextPath}/deleteMap.action";
		form.submit();
	}
	
	function requestJson()
	{
		$.ajax({
			type : 'post',
			url : '${pageContext.request.contextPath}/requestJson.action',
			contentType : 'application/json;charset=utf-8',
			data : '{"name" : "手机", "price" : 999}',
			success:function(data){
				alert(data);
			}		
		}
		);
	}
	function responseJson()
	{
		$.ajax({
			type : 'post',
			url : '${pageContext.request.contextPath}/responseJson.action',
			data : 'name=手机&price=999',
			success:function(data){
				alert(data);
			}		
		}
		);
	}
</script>

<body> 

<c:if test="${errorList != null }">
	<c:forEach items="${ errorList}" var="error">
		${error.defaultMessage}<br/>
		
	</c:forEach>
</c:if>
<input type="submit" value="requestJson" onclick = "requestJson()"/>
<input type="submit" value="responseJson" onclick = "responseJson()"/>
<form action="${pageContext.request.contextPath }/item/queryItem.action" method="post">
查询条件：
<table width="100%" border=1>
<tr>
<td><input type="submit" value="查询"/></td>
<td><input type="submit" value="删除" onclick="deleteByIds()"/></td>
</tr>
</table>
商品列表：
<table width="100%" border=1>
<tr>
	<td>商品名称</td>
	<td>商品价格</td>
	<td>生产日期</td>
	<td>商品描述</td>
	<td>操作</td>
</tr>
<c:forEach items="${itemList }" var="item">
<tr>
	<td><input type="checkbox" name = "itemsCustomMap['${item.id}'].id" value="${item.id}"></td>
	<td>${item.name }</td>
	<td>${item.price }</td>
	<td><fmt:formatDate value="${item.createtime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
	<td>${item.detail }</td>
	
	
	
	<td><a href="${pageContext.request.contextPath }/editUI.action?id=${item.id}">修改</a></td>

</tr>
</c:forEach>

</table>
</form>
</body>

</html>