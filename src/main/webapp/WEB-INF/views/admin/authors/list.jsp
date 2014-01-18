<%-- 
    Document   : authors
    Created on : Jan 8, 2014, 9:55:58 PM
    Author     : assent2
--%>

<%@page import="org.springframework.web.util.UrlPathHelper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="c"
          uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" 
          uri="http://www.springframework.org/tags"%>

<spring:message code="data_is_not_found" var="data_is_not_found"/>
<spring:message code="admin_authors_first_name" var="first_name"/>
<spring:message code="admin_authors_last_name" var="last_name"/>
<spring:message code="admin_authors_patronymic" var="patronymic"/>


<spring:message code="admin_authors_list_header" var="title"/>

<div id="admin_authors_list">
    <table class="table table-hover">
        <thead>
            <tr>
                <th>id</th>
                <th>${first_name}</th>
                <th>${last_name}</th>
                <th>${patronymic}</th>
                <th>action</th>
            </tr>
        </thead>
        <tbody>
            <c:choose>
                <c:when test="${not empty authors}">
                    <c:forEach items="${authors}" var="author">
                        <tr>
                            <td>${author.idAuthor}</td>
                            <td>${author.fname}</td>
                            <td>${author.lname}</td>
                            <td>${author.pname}</td>
                            <td>
                                <a href="${pageContext.request.contextPath}/authors/${author.idAuthor}">show</a>/
                                <a href="${pageContext.request.contextPath}/authors/${author.idAuthor}?form">edit</a>
                            </td>
                        </tr>
                    </c:forEach>
                </c:when> 
                <c:otherwise>
                    <tr>
                        <td colspan="4">${data_is_not_found}</td>
                    </tr>
                </c:otherwise>
            </c:choose>
        </tbody>
    </table>   
</div>