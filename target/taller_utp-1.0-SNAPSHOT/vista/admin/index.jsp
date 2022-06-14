<!-- ADMIN -->
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
    <jsp:include page="head.jsp"/>
    <body id="page-top">
        <div id="wrapper">
            <jsp:include page="menu.jsp"/>
            <div id="content-wrapper" class="d-flex flex-column" ">
                <div id="content" class="d-flex p-2">
                    <img class="img-fluid img-thumbnail" src="<%= request.getContextPath()%>/recursos/img/logo_admin.png" />
                </div>
            </div>
        </div>
        <jsp:include page="footer.jsp"/>
    </body>
</html>