<%-- 
    Document   : menu
    Created on : Jan 11, 2014, 11:16:39 AM
    Author     : assent2
--%>

<%@page import="com.pb.mycompany.assent.jsp.ActiveResolver.Authors"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="spring" 
          uri="http://www.springframework.org/tags"%>

<%
    Authors activeResolver = new Authors(request, "active");
%>

<a href="${pageContext.request.contextPath}/authors/find" class="list-group-item <%=activeResolver.isFind()%>">
    <spring:message code="admin_authors_nav_find"/>
</a>

<a href="${pageContext.request.contextPath}/authors/all" class="list-group-item <%=activeResolver.isAll()%>">
    <spring:message code="admin_authors_nav_list"/>
</a>

<a href="${pageContext.request.contextPath}/authors/0?form" class="list-group-item <%=activeResolver.isEdit()%>">
    <spring:message code="admin_authors_nav_edit"/>
</a>

<a href="${pageContext.request.contextPath}/authors?form" class="list-group-item <%=activeResolver.isShow()%>">
    <spring:message code="admin_authors_nav_create"/>
</a>

<%--
<a href="${pageContext.request.contextPath}/authors" class="list-group-item <%=activeResolver.isShow()%>"><spring:message code="admin_authors_nav_show"/></a>
--%>