<!-- ADMIN -->
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
    <jsp:include page="../head.jsp"/>

    <body id="page-top">
        <div id="wrapper">
            <jsp:include page="../menu.jsp"/>
            <div id="content-wrapper" class="d-flex flex-column" ">
                <div id="content" class="d-flex p-3">
                    <div class="mx-auto" style="width: 760px">
                        <h2 class="text-center">Lista de Usuarios</h2>
                        <div class="text-right mb-3 me-4">
                            <a href="<%= request.getContextPath()%>/ServAdminAddUsuario" class="btn btn-info ">
                                <i class="bi bi-person-plus-fill"></i>
                                Agregar Usuario
                            </a>
                        </div>
                        <div class="row d-flex justify-content-center">

                            <table class="table">
                                <thead
                                    <tr>
                                <th style="width: 10%">#</th>
                                <th style="width: 15%">Usuario</th>
                                <th style="width: 15%">Rol</th>
                                <th style="width: 60%">Opciones</th>
                                </tr>
                                </thead>
                                <tbody>
                                    <c:forEach items="${admin_usuarios}" var="usu">
                                        <tr>      
                                            <td>${usu.numeracion}</td>
                                            <td>${usu.usuario}</td>
                                            <td>${usu.rol.nombre}</td>
                                            <td>
                                                <c:choose>
                                                    <c:when test="${usu.rol.idrol == 1}">
                                                        <a class="btn btn-info" href="<%= request.getContextPath()%>/vista/admin/usuarios/horario/index.jsp?idusuario=${usu.idusuario}" >
                                                            <i class="bi bi-calendar-week"></i>
                                                            </i>
                                                            Horario
                                                        </a>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <a class="btn btn-info disabled" href="" >
                                                            <i class="bi bi-calendar-week"></i>
                                                            </i>
                                                            Horario
                                                        </a>
                                                    </c:otherwise>
                                                </c:choose>
                                                <c:choose>
                                                    <c:when test="${usu.estado==true}">

                                                        <a class="btn btn-success" href="<%= request.getContextPath()%>/ServAdminFicha?id_usu=${usu.idusuario}" >
                                                            <i class="bi bi-file-earmark-person-fill">
                                                            </i>
                                                            Ficha
                                                        </a>
                                                        <a class="btn btn-primary" href="">
                                                            <i class="bi bi-person-fill"></i>
                                                            Usuario
                                                        </a>
                                                        <a class="btn btn-danger" href="">
                                                            <i class="bi bi-toggle2-on"></i> Desactivar
                                                        </a>
                                                    </c:when>    
                                                    <c:otherwise>
                                                        <a class="btn btn-success disabled" href="<%= request.getContextPath()%>/ServAdminFicha?id_usu=${usu.idusuario}" disabled>
                                                            <i class="bi bi-file-earmark-person-fill"></i> Ficha
                                                        </a>
                                                        <a class="btn btn-primary disabled" href="">
                                                            <i class="bi bi-person-fill"></i> Usuario
                                                        </a>
                                                        <a class="btn btn-danger" href="">
                                                            <i class="bi bi-toggle-off"></i> Activar
                                                        </a>
                                                    </c:otherwise>
                                                </c:choose>                                                        
                                            </td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>