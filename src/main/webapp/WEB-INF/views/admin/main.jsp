<%-- 
    Document   : customer
    Created on : Jan 10, 2014, 10:09:19 PM
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

<!DOCTYPE html>
<html lang="en">
    <head>
        <tiles:insertAttribute name="meta" ignore="true" />    
    </head>
    <body>
        <div class="navbar navbar-fixed-top navbar-inverse" role="navigation">
            <div class="container">
                <div id="nav-top">
                    <tiles:insertAttribute name="header" ignore="true" />    
                </div>
            </div><!-- /.container -->
        </div><!-- /.navbar -->

        <div class="container">
            <div class="row row-offcanvas row-offcanvas-right">
                <div class="col-xs-6 col-sm-3 sidebar-offcanvas" id="sidebar" role="navigation">
                    <div class="list-group">
                        <div id="nav-left">
                            <tiles:insertAttribute name="nav" ignore="true" />
                        </div>
                    </div>
                </div><!--/span-->

                <div class="col-xs-12 col-sm-9">
                    <div class="row">
                        <div class="panel panel-default">
                            <div class="panel-body">
                                <div class="bs-callout bs-callout-danger">
                                    <div id="content">
                                        <tiles:insertAttribute name="content" ignore="true" />            
                                    </div>
                                </div>    
                            </div>
                        </div>
                    </div><!--/row-->
                </div><!--/span-->
            </div><!--/row-->

            <div id="footer">
                <tiles:insertAttribute name="footer" ignore="true" />    
            </div>
        </div><!--/.container-->
        <tiles:insertAttribute name="defaultScript" ignore="true" />
    </body>
</html>
