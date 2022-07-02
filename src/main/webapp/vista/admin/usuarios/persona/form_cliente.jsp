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
