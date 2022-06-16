<div class="container shadow-lg p-3 mb-5 bg-white rounded mt-5" style="width: 300px;">
    <a href="<%= request.getContextPath()%>/index.jsp" class="link-danger">
        <i class="bi bi-arrow-bar-left"></i>
        Volver al Inicio
    </a>
    <center>
        <form action="<%= request.getContextPath()%>/ServUsuarios" class="form-control mt-1" method="post">
            <h3>Registro al Sistema</h3>                   

            <h5 class="text-left"/>

            <p class="mb-1">Usuario:</p>
            <input class="form-control"
                   type="text"
                   name="txtuser"
                   required=""
                   oninvalid="this.setCustomValidity('Ingrese nombre de usuario')">

            <h5 class="text-left"/>
            <p class="mb-1">Password:</p>

            <input class="form-control mb-3"
                   type="password"
                   name="txtpassword"
                   required=""
                   oninvalid="this.setCustomValidity('Ingrese Contraseña')">

            <div class="d-grid ">
                <button class="btn btn-primary btn-block" type="submit">Registrar</button>
                <button class="btn btn-danger   btn-block" type="reset">Cancelar</button>
            </div>

        </form>
    </center>
</div>