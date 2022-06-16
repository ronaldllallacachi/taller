<div class="container shadow-lg p-3 mb-5 bg-white rounded mt-5" style="width: 300px;">
    <form action="<%= request.getContextPath()%>/ServLogin" class="form-control " method="post">
        <h3>Ingreso al Sistema</h3>                    
        <img src="recursos/img/profile.png" class="img-fluid">

        <h5 class="text-left m-2"/>
        Usuario:
        </h5>
        <input class="form-control"
               type="text"
               name="user"
               required=""
               oninvalid="this.setCustomValidity('Ingrese nombre de usuario')">

        <h5 class="text-left m-2"/>
        Password:
        </h5>
        <input class="form-control"
               type="password"
               name="password"
               required=""
               oninvalid="this.setCustomValidity('Ingrese Contraseña')">

        <br/>

        <div class="d-grid ">
            <button class="btn btn-primary btn-block" type="submit">Ingresar</button>

            <button class="btn btn-danger   btn-block" type="reset">Cancelar</button>
        </div>
    </form>
    <form action="<%= request.getContextPath()%>/ServUsuarios" class="mb-0">
        <div class="float-left mb-1">
            <p class="lead ml-2">
                ¿No estas Registrado?
            </p>
        </div>
        <button class="btn btn-success btn-block" type="/ServUsuarios">Registrar</button>
    </form>
</div>