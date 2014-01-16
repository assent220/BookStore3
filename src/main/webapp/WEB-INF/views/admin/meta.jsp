<%-- 
    Document   : meta
    Created on : Jan 13, 2014, 12:01:37 PM
    Author     : assent2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="c"
          uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" 
          uri="http://www.springframework.org/tags"%>

<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="assent220">
<!--
<link rel="shortcut icon" href="http://getbootstrap.com/docs-assets/ico/favicon.png">
-->
<title>AdminPanel</title>

<!-- Bootstrap core CSS -->
<link rel="stylesheet" type="text/css" media="screen" 
      href="${pageContext.request.contextPath}/<spring:theme code="bootstrap"/>" />
<link rel="stylesheet" type="text/css" media="screen" 
      href="${pageContext.request.contextPath}/<spring:theme code="bootstrap_theme"/>" />

<!-- Custom styles for this template -->
<link rel="stylesheet" type="text/css" media="screen" 
      href="${pageContext.request.contextPath}/<spring:theme code="jqueryui"/>" />
<link rel="stylesheet" type="text/css" media="screen" 
      href="${pageContext.request.contextPath}/<spring:theme code="offcanvas"/>" />
<link rel="stylesheet" type="text/css" media="screen" 
      href="${pageContext.request.contextPath}/<spring:theme code="admin"/>" />




<!-- Just for debugging purposes. Don't actually copy this line! -->
<!--[if lt IE 9]><script src="../../docs-assets/js/ie8-responsive-file-warning.js"></script><![endif]-->

<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
  <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
<![endif]-->