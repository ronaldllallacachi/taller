<ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">
    <a class="sidebar-brand d-flex align-items-center justify-content-center" href="<%= request.getContextPath()%>/vista/cliente/index.jsp">        
        <div class="sidebar-brand-text mx-3">                    
            <img src="<%= request.getContextPath()%>/recursos/img/logo.png" alt=""/>
        </div>
        TALLER UTP
    </a>
    <hr class="sidebar-divider my-0"> 

    <li class="nav-item text-center active mt-3">
        <p class="text-uppercase text-white font-weight-bold">${rol}</p>
    </li>
    <hr class="sidebar-divider my-0"> 

    <li class="nav-item active">
        <a class="nav-link" href="<%= request.getContextPath()%>/ServFicha">
            <i class="bi bi-file-person-fill" style="font-size: 1.2rem;">
                Ficha Personal
            </i>
        </a>
    </li>
    <hr class="sidebar-divider my-0">

    <li class="nav-item active">
        <a class="nav-link" href="<%= request.getContextPath()%>/">
            <i class="bi bi-boxes" style="font-size: 1.2rem;">
                Servicios
            </i>
        </a>
    </li>
    <hr class="sidebar-divider my-0">

    <li class="nav-item active">
        <a class="nav-link" href="<%=request.getContextPath()%>/">
            <i class="bi bi-laptop" style="font-size: 1.2rem;">
                Mis Equipos
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
