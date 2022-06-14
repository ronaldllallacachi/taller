<ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">
    <a class="sidebar-brand d-flex align-items-center justify-content-center" href="<%= request.getContextPath()%>/vista/admin/index.jsp">        
        <div class="sidebar-brand-text mx-3">                    
            <img src="<%= request.getContextPath()%>/recursos/img/logo.png" alt=""/>
        </div>
        TALLER UTP
    </a>
    <hr class="sidebar-divider my-0"> 
    <jsp:include page="rolname.jsp"/>
    <hr class="sidebar-divider my-0"> 
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
