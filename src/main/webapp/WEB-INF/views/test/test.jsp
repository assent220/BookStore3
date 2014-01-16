<%-- 
    Document   : test
    Created on : Jan 12, 2014, 6:59:51 PM
    Author     : assent2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="c"
          uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" 
          uri="http://www.springframework.org/tags"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>


        <spring:theme code="styleSheet" var="styleSheet_css" />
        <link rel="stylesheet" type="text/css" media="screen" 
              href="${pageContext.request.contextPath}/${styleSheet_css}" />

        <spring:theme code="bootstrap" var="bootstrap_css" />
        <link rel="stylesheet" type="text/css" media="screen" 
              href="${pageContext.request.contextPath}/${bootstrap_css}" />

        <spring:theme code="bootstrap_docs" var="bootstrap_docs_css" />
        <link rel="stylesheet" type="text/css" media="screen" 
              href="${pageContext.request.contextPath}/${bootstrap_docs_css}" />

        <link rel="stylesheet" type="text/css" media="screen" 
              href="${pageContext.request.contextPath}/resources/jslib/bootstrap/v3.0.3/css/bootstrap.css" />

    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-md-3 bs-docs-sidebar">
                    <!--Sidebar content-->
                    <ul ul class="nav nav-list bs-docs-sidenav">
                        <li class="active">
                            <a href="#dropdowns">
                                <i class="icon-chevron-right"></i>
                                menu1
                            </a>
                        </li>
                        <li>
                            <a href="#buttonDropdowns">
                                <i class="icon-chevron-right"></i>
                                menu2
                            </a>
                        </li>
                        <li>
                            <a href="#buttonDropdowns">
                                <i class="icon-chevron-right"></i>
                                menu3
                            </a>
                        </li>
                        <li>
                            <a href="#buttonDropdowns">
                                <i class="icon-chevron-right"></i>
                                menu4
                            </a>
                        </li>
                    </ul>

                </div>

                <div class="col-md-6">
                    <div class="content">
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

        </div>



        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/jslib/jquery/jquery-1.10.2.js"/>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/jslib/bootstrap/v3.0.3/js/bootstrap.js"/>
    </body>
</html>
