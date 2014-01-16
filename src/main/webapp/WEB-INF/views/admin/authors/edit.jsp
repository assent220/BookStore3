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

<div id="admin_authors_update">

    <h1>${title}</h1>

    <form:form modelAttribute="contact" id="author_update_form" method="post">
        <c:if test="${not empty message}">
            <div id="message" class="${message.type}">${message.message}</div>
        </c:if>
        <form:label path="firstName">
            ${labelContactFirstName}*
        </form:label>
        <form:input path="firstName" />
        <div>
            <form:errors path="firstName" cssClass="error" />
        </div>
        <p/>
        <form:label path="lastName">
            ${labelContactLastName}*
        </form:label>
        <form:input path="lastName" />
        <div>
            <form:errors path="lastName" cssClass="error" />
        </div>
        <p/>
        <form:label path="birthDate">
            ${labelContactBirthDate}
        </form:label>
        <form:input path="birthDate" id="birthDate"/>
        <div>
            <form:errors path="birthDate" cssClass="error" />
        </div>
        <p/>
        <form:label path="description">
            ${labelContactDescription}
        </form:label>
        <form:textarea cols="60" rows="8" path="description" id="contactDescription"/>
        <div>
            <form:errors path="description" cssClass="error" />
        </div>
        <p/>
        <form:hidden path="version" />
        <button type="submit">Save</button>
        <button type="reset">Reset</button>
    </form:form>
</div>
</div>


<!--
<div class="panel panel-default">
                            <div class="panel-body">
                                <div class="bs-callout bs-callout-danger">
                                    <form class="form-horizontal" role="form">
                                        <div class="form-group">
                                            <label for="inputEmail3" class="col-sm-2 control-label">Email</label>
                                            <div class="col-sm-10">
                                                <input type="email" class="form-control" id="inputEmail3" placeholder="Email">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="inputPassword3" class="col-sm-2 control-label">Password</label>
                                            <div class="col-sm-10">
                                                <input type="password" class="form-control" id="inputPassword3" placeholder="Password">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <div class="col-sm-offset-2 col-sm-10">
                                                <div class="checkbox">
                                                    <label>
                                                        <input type="checkbox"> Remember me
                                                    </label>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <div class="col-sm-offset-2 col-sm-10">
                                                <button type="submit" class="btn btn-default">Sign in</button>
                                            </div>
                                        </div>
                                    </form>
                                </div>    
                            </div>
                        </div>
-->