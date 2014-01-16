<%-- 
    Document   : authors
    Created on : Jan 8, 2014, 9:55:58 PM
    Author     : assent2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="c"
          uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="joda" 
          uri="http://www.joda.org/joda/time/tags"%>
<%@taglib prefix="fn"
          uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="form" 
          uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" 
          uri="http://www.springframework.org/tags"%>
<%@taglib prefix="tiles" 
          uri="http://tiles.apache.org/tags-tiles"%>

<spring:message code="admin_authors_first_name" var="admin_authors_first_name"/>
<spring:message code="admin_authors_last_name" var="admin_authors_last_name"/>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <spring:theme code="styleSheet" var="app_css" />
        <spring:url value="/${app_css}" var="app_css_url" />
        <link rel="stylesheet" type="text/css" media="screen" href="${app_css_url}" />
        
        <%--getRootUrl
            ${pageContext.request.contextPath}
        --%>

    </head>
    <body>
        <h1>Contact Listing</h1>
        <c:if test="${not empty authors}">
            <table>
                <thead>
                    <tr>
                        <th>${admin_authors_first_name}</th>
                        <th>${admin_authors_last_name}</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${authors}" var="author">
                        <tr>
                            <td>${author.fname}</td>
                            <td>${author.lname}</td>
                            <%--
                            <td><joda:format value="${authors.birthDate}" pattern="yyyy-MM-dd"/></td>
                            --%>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </c:if>
    </body>
</html>
