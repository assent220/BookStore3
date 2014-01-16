<%-- 
    Document   : show
    Created on : Jan 12, 2014, 5:11:10 PM
    Author     : assent2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="c"
          uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" 
          uri="http://www.springframework.org/tags"%>

<spring:message code="data_is_not_found" var="data_is_not_found"/>

<spring:message code="admin_authors_first_name" var="first_name"/>
<spring:message code="admin_authors_last_name" var="last_name"/>

<spring:message code="admin_authors_show_header" var="title"/>
<spring:message code="admin_authors_show_label_update" var="label_update"/>

<div id="admin_authors_show">
    <h1>${title}</h1>

    <c:choose>
        <c:when test="${not empty author}">
            <table>
                <tr>
                    <td>id</td>
                    <td>${author.idAuthor}</td>
                </tr>
                <tr>
                    <td>${first_name}</td>
                    <td>${author.fname}</td>
                </tr>
                <tr>
                    <td>${last_name}</td>
                    <td>${contact.lname}</td>
                </tr>
            </table>

            <a href="${pageContext.request.contextPath}/${author.idAuthor}?form">${label_update}</a>
        </c:when>
        <c:otherwise>
            <h2>${data_is_not_found}</h2>
        </c:otherwise>
    </c:choose>
</div>
