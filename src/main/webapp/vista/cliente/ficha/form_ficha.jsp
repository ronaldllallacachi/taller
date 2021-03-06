<div id="content-wrapper" class="d-flex flex-column" ">
    <div id="content" class="d-flex p-2">
        <div class="container-fluid " style="width: 500px;">
            <div class="row">
                <h2 class="mx-auto font-weight-bold mt-4">Ficha Personal</h2>
            </div>
            <form action="<%= request.getContextPath()%>/ServFicha" method="post">
                <div class="row">
                    Nombres:
                    <input
                        class="form-control"
                        type="text"
                        name='txtnombres'
                        placeholder="Ingrese Nombres"
                        value="${nombres}"
                        required="required">
                    Apellidos:
                    <input
                        class="form-control"
                        type="text" name='txtapellidos'
                        placeholder="Ingrese Apellidos"
                        value="${apellidos}"
                        required="required">
                    DNI
                    <input
                        class="form-control"
                        type="number"
                        name='txtdni'
                        placeholder="Ingrese DNI"
                        value="${dni}"
                        required="required">
                    Telefono:
                    <input
                        class="form-control"
                        type="number"
                        name='txttelefono'
                        placeholder="Ingrese Telefono:"
                        value="${telefono}"
                        required="required">
                    Direcci?n                            
                    <textarea
                        class="form-control"
                        rows="3"
                        name="txtdireccion"
                        placeholder="Ingrese Direcci?n"
                        required="required">${direccion}</textarea>
                    Correo Electronico
                    <input
                        class="form-control"
                        type="email"
                        name='txtcorreo'
                        placeholder="Ingrese Correo"
                        value="${correo}"
                       required="required">
                    <button type="submit" class="btn btn-primary btn-lg btn-block mt-3">Guardar</button>
                </div>
            </form>
        </div>
    </div>
</div>
