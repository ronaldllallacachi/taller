<%
    String incidencia = "";
    if (request.getParameter("incidencia") != null) {
%>

<div class="container alert alert-danger alert-dismissible fade show mt-1" role="alert" style="width: 400px;">
    <b>El Usuario ya Existe!.</b>
    <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
</div>
<%
    }
%>
