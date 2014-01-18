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

<spring:message code="admin_authors_patronymic" var="patronymic"/>

<spring:message code="admin_authors_show_header" var="title"/>
<spring:message code="admin_authors_show_label_update" var="label_update"/>

<div id="admin_authors_show">
    <c:choose>
        <c:when test="${not empty author}">
            <div class="form-horizontal">
                <div class="form-group">
                    <div class="col-sm-2 control-label"><strong>id</strong></div>
                    <div class="col-sm-10">
                        <div class="form-control">${author.idAuthor}</div>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-2 control-label"><strong>${first_name}</strong></div>
                    <div class="col-sm-10">
                        <div class="form-control">${author.fname}</div>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-2 control-label"><strong>${last_name}</strong></div>
                    <div class="col-sm-10">
                        <div class="form-control fo">${author.lname}</div>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-2 control-label"><strong>${patronymic}</strong></div>
                    <div class="col-sm-10">
                        <div class="form-control">${author.pname}</div>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                        <button type="button" 
                                class="btn btn-default" 
                                onclick="window.location.href = '${pageContext.request.contextPath}/authors/${author.idAuthor}?form'">
                            Edit data
                        </button>
                    </div>
                </div>
            </div>
        </c:when>
        <c:otherwise>
            <h2>${data_is_not_found}</h2>
        </c:otherwise>
    </c:choose>
</div>
