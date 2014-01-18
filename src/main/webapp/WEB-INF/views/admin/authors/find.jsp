<%-- 
    Document   : find
    Created on : Jan 18, 2014, 1:55:02 PM
    Author     : assent2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="c"
          uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" 
          uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" 
          uri="http://www.springframework.org/tags"%>

<div id="admin_authors_find">
    <form:form modelAttribute="author" method="post" class="form-horizontal" role="form">
        <div class="form-group">
            <form:label path="idAuthor" for="inputId" class="col-sm-2 control-label">id</form:label>
                <div class="col-sm-10">
                <form:input path="idAuthor" type="text" class="form-control" id="inputId" placeholder="id"/>
            </div>
            <div class="col-sm-10">
                <form:errors path="idAuthor" cssClass="error" />    
            </div>
        </div>

        <div class="form-group">
            <form:label path="fname" for="inputFname" class="col-sm-2 control-label">first name</form:label>
                <div class="col-sm-10">
                <form:input path="fname" type="text" class="form-control" id="inputFname" placeholder="first name" />
            </div>
            <div class="col-sm-10">
                <form:errors path="fname" cssClass="error" />    
            </div>
        </div>

        <div class="form-group">
            <form:label path="lname" for="inputLname" class="col-sm-2 control-label">last name</form:label>
                <div class="col-sm-10">
                <form:input path="lname" type="text" class="form-control" id="inputLname" placeholder="last name" />
            </div>
            <div class="col-sm-10">
                <form:errors path="lname" cssClass="error" />    
            </div>
        </div>

        <div class="form-group">
            <form:label path="pname" for="inputPname" class="col-sm-2 control-label">patronymic</form:label>
                <div class="col-sm-10">
                <form:input path="pname" type="text" class="form-control" id="inputPname" placeholder="patronymic" />
            </div>
            <div class="col-sm-10">
                <form:errors path="pname" cssClass="error" />    
            </div>
        </div>

        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-default">Start search</button>
                <button type="reset" class="btn btn-default">Reset</button>
            </div>
        </div>
    </form:form>
</div>
