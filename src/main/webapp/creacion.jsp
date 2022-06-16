<%
    String creacion = "";
    if (request.getParameter("creacion") != null) {
%>

<div class="container alert alert-success alert-dismissible fade show mt-1" role="alert" style="width: 400px;">
    <b>Usuario Creado satisfactoriamente!</b>
    <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
</div>
<%
    }
%>