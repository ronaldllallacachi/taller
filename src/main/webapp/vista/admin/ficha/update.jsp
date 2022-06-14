<!-- ADMIN -->
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>UTP | Taller</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.3/font/bootstrap-icons.css">
        <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
        <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">
        <link href="<%= request.getContextPath()%>/recursos/css/sb-admin-2.min.css" rel="stylesheet">
    </head>

    <body id="page-top">
        <!-- Page Wrapper -->
        <div id="wrapper">
            <!-- Sidebar -->
            <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">
                <!-- Sidebar - Brand -->
                <a class="sidebar-brand d-flex align-items-center justify-content-center" href="<%= request.getContextPath()%>/vista/admin/index.jsp">        
                    <div class="sidebar-brand-text mx-3"> 
                        <img src="<%= request.getContextPath()%>/recursos/img/logo.png" alt=""/>
                    </div>
                    TALLER UTP
                </a>
                <hr class="sidebar-divider my-0"> 
                <li class="nav-item text-center active mt-3">
                    <p class="text-uppercase text-white font-weight-bold">${rol}</p>
                </li>
                <li class="nav-item active">
                    <a class="nav-link" href="<%= request.getContextPath()%>/ServAdminUsuarios">
                        <i class="bi bi-file-person-fill" style="font-size: 1.2rem;">
                            Usuarios
                        </i>
                    </a>
                </li>

                <hr class="sidebar-divider my-0"> 
                <li class="nav-item active">
                    <a class="nav-link" href="<%= request.getContextPath()%>/ServLogout">
                        <i class="bi bi-box-arrow-left" style="font-size: 1.2rem;">
                            Cerrar Sesión
                        </i>
                    </a>
                </li>
                <hr class="sidebar-divider my-0">      
            </ul>
            <!-- End of Sidebar -->

            <!-- Content Wrapper -->
            <div id="content-wrapper" class="d-flex flex-column" ">
                <!-- Main Content -->
                <div id="content" class="d-flex p-2">
                    <div class="container-fluid " style="width: 500px;">
                        <div class="row">
                            <h2 class="mx-auto font-weight-bold mt-4">Ficha Personal de ${rol}</h2>
                        </div>
                        <form action="<%= request.getContextPath()%>/ServAdminFicha" method="post">
                            <div class="row">
                                Nombres:
                                <input class="form-control" type="text" name='txtnombres' placeholder="Ingrese Nombres" value="${nombres}">
                                Apellidos:
                                <input class="form-control" type="text" name='txtapellidos' placeholder="Ingrese Apellidos" value="${apellidos}">
                                DNI
                                <input class="form-control" type="number" name='txtdni' placeholder="Ingrese DNI" value="${dni}">
                                Telefono:
                                <input class="form-control" type="number" name='txttelefono' placeholder="Ingrese Telefono:" value="${telefono}">
                                Dirección                            
                                <textarea class="form-control" rows="3" name="txtdireccion" placeholder="Ingrese Dirección">${direccion}</textarea>
                                Correo Electronico
                                <input class="form-control" type="email" name='txtcorreo' placeholder="Ingrese Correo" value="${correo}">
                                <button type="submit" class="btn btn-primary btn-lg btn-block mt-3">Guardar</button>
                            </div>
                        </form>
                    </div>
                </div>
                <!-- End of Main Content -->

                <!-- Footer -->
                <footer class="sticky-footer bg-white">
                    <div class="container my-auto">
                        <div class="copyright text-center my-auto">
                            <span>Copyright &copy; Taller UTP 2022</span>
                        </div>
                    </div>
                </footer>
            </div>
        </div>

        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>