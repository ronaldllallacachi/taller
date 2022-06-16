<%
    String mensaje = "";
    if (request.getParameter("error") != null) {
%>

<div class="container alert alert-danger alert-dismissible fade show mt-1" role="alert" style="width: 400px;">
    <b>Usuario y/o Clave Incorrecta!</b>
    <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
</div>
<%
    }
%>