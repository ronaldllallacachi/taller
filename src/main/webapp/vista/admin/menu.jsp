<ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">
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
    <hr class="sidebar-divider my-0"> 
    <li class="nav-item active">
        <a class="nav-link" href="<%= request.getContextPath()%>/ServAdminUsuarios">
            <i class="bi bi-file-person-fill" style="font-size: 1.2rem;">
                Usuarios
            </i>
        </a>
    </li>
    <li class="nav-item active">
        <a class="nav-link" href="<%= request.getContextPath()%>/ServAdminUsuarios">
            <i class="bi bi-file-person-fill" style="font-size: 1.2rem;">
                Servicios
            </i>
        </a>
    </li>
    <li class="nav-item active">
        <a class="nav-link" href="<%= request.getContextPath()%>/ServAdminUsuarios">
            <i class="bi bi-file-person-fill" style="font-size: 1.2rem;">
                Atención
            </i>
        </a>
    </li>
    <li class="nav-item active">
        <a class="nav-link" href="<%= request.getContextPath()%>/ServEquipos">
            <i class="bi bi-file-person-fill" style="font-size: 1.2rem;">
                Equipos
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
