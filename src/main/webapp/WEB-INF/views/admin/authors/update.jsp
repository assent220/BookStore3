<%-- 
    Document   : update
    Created on : Jan 12, 2014, 5:11:19 PM
    Author     : assent2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="c"
          uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" 
          uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" 
          uri="http://www.springframework.org/tags/form"%>

<spring:message code="data_is_not_found" var="data_is_not_found"/>
<spring:message code="admin_authors_first_name" var="first_name"/>
<spring:message code="admin_authors_last_name" var="last_name"/>
<spring:message code="admin_authors_update_header" var="title"/>

<div id="admin_authors_find">
    <c:if test="${not empty message}">
        <div id="message" class="${message.type}">${message.message}</div>
    </c:if>
    <c:choose>
        <c:when test="${not empty author}">

            <form:form modelAttribute="author" method="post" class="form-horizontal" role="form">
                <div class="form-group">
                    <label class="col-sm-2 control-label">id</label>
                    <div class="col-sm-10">
                        <p class="form-control-static">${author.idAuthor}</p>
                        <form:input path="idAuthor" type="text" id="inputFname" placeholder="first name" hidden="true" value="${author.idAuthor}" />
                    </div>
                </div>

                <div class="form-group">
                    <form:label path="fname" for="inputFname" class="col-sm-2 control-label">
                        first name
                    </form:label>
                    <div class="col-sm-10">
                        <form:input path="fname" type="text" class="form-control" id="inputFname" placeholder="first name" />
                    </div>
                    <div class="col-sm-10">
                        <form:errors path="fname" cssClass="error" />    
                    </div>
                </div>

                <div class="form-group">
                    <form:label path="lname" for="inputLname" class="col-sm-2 control-label">
                        last name
                    </form:label>
                    <div class="col-sm-10">
                        <form:input path="lname" type="text" class="form-control" id="inputLname" placeholder="last name" />
                    </div>
                    <div class="col-sm-10">
                        <form:errors path="lname" cssClass="error" />    
                    </div>
                </div>

                <div class="form-group">
                    <form:label path="pname" for="inputPname" class="col-sm-2 control-label">
                        patronymic
                    </form:label>
                    <div class="col-sm-10">
                        <form:input path="pname" type="text" class="form-control" id="inputPname" placeholder="patronymic" />
                    </div>
                    <div class="col-sm-10">
                        <form:errors path="pname" cssClass="error" />    
                    </div>
                </div>

                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                        <button type="submit" class="btn btn-default">Update</button>
                    </div>
                </div>
            </form:form>

        </c:when>
        <c:otherwise>
            <h2>If you want edit data first you must find entity</h2>
        </c:otherwise>
    </c:choose>
</div> 
