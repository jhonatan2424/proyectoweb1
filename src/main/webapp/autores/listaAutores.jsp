<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.List" %>
<%@ page import="com.unu.proyectoweb1.beans.Autor" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<table id="tabla">
	<thead>
		<tr>
			<th>Codigo del Autor</th>
			<th>Nombre del Autor</th>
			<th>Nacionalidad</th>
			<th>Operaciones</th>
		</tr>
	</thead>
	<tbody>
		<%
		List<Autor>listaAutores=(List<Autor>)request.getAttribute("listaAutores");
		if(listaAutores != null){
			for(Autor autor: listaAutores){
		%>
				<tr>
					<td><%=autor.getIdAutor()%></td>
					<td><%=autor.getNombre()%></td>
					<td><%=autor.getNacionalidad()%></td>
					<td></td>
				</tr>
		<%
			}
		}else {
		%>
			<tr>
				<td>No hay datos</td>
				<td>No hay datos</td>
				<td>No hay datos</td>
				<td></td>
		<% 			
		}
		%>
	</tbody>

</table>
	
</head>
<body>
</body>
</html>