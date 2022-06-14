<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.3/font/bootstrap-icons.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <p>${error}ss</p>
    <c:if test="${error == true}"">
        <div class="d-flex flex-row-reverse m-2">            
            <div class="toast show bg-danger">
                <div class="toast-header">
                    <img src="recursos/img/cancelar.png" alt=""/>
                    <strong class="me-auto">Error</strong>
                    <button type="button" class="btn-close" data-bs-dismiss="toast"></button>
                </div>
                <div class="toast-body bg-white">
                    <p>${error}</p>
                </div>
            </div>
        </div>
    </c:if>
    <center>
        <div class="container shadow-lg p-3 mb-5 bg-white rounded" style="width: 300px;">
            <form action="<%= request.getContextPath()%>/ServLogin" class="form-control mt-6" method="post">
                <h3>Ingreso al Sistema</h3>                    
                <img src="recursos/img/profile.png" class="img-fluid">

                <h5 class="text-left m-2">Usuario:</h2>
                    <input class="form-control" type="text" name="user" required="">

                    <h5 class="text-left m-2">Password:</h2>
                        <input class="form-control" type="password" name="password" required="">

                        <br>
                        <div class="d-grid ">
                            <button class="btn btn-primary btn-block" type="submit">Ingresar</button>
                            <button class="btn btn-success btn-block" type="submit">Registrar</button>
                            <button class="btn btn-danger   btn-block" type="reset">Cancelar</button>
                        </div>
                        </form>
                        </div>
                        </center>
                        </body>
                        </html>
