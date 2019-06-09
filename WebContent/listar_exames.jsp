<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<style>
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}

th, td {
	padding: 15px;
}
</style>
<title>Listagem</title>
<h1>
	<center>Listagem de exames</center>
	</center>
</h1>
</head>
<body>
	<table style="width: 100%">
		<tr>
			<th>Nome</th>
			<th>CPF</th>
			<th>Email</th>
			<th>Exame</th>
			<th>Data</th>
			<th>Situação</th>
			<th></th>
		</tr>

		<s:iterator value="exames" var="exame">
			<tr>
				<s:form novalidate="true" theme="simple"
					action="/alterar_exame.action">
					<td><s:property value="#exame.nome" /></td>
					<td><s:property value="#exame.cpf" /></td>
					<td><s:property value="#exame.email" /></td>
					<td><s:property value="#exame.exame" /></td>
					<td><s:property value="#exame.data" /></td>
					<td><s:property value="#exame.situacao" /></td>
					<s:hidden  type="text" name="exame.id" value = "%{#exame.id}" ></s:hidden >
					<s:hidden  type="text" name="exame.nome" value = "%{#exame.nome}" ></s:hidden >
					<s:hidden  type="text" name="exame.cpf" value = "%{#exame.cpf}" ></s:hidden >
					<s:hidden  type="text" name="exame.email" value = "%{#exame.email}" ></s:hidden >
					<s:hidden  type="text" name="exame.exame" value = "%{#exame.exame}" ></s:hidden >
					<s:hidden  type="text" name="exame.data" value = "%{#exame.data}" ></s:hidden >
					<s:hidden  type="text" name="exame.situacao" value = "%{#exame.situacao}" ></s:hidden >
					<td style="width: 50px">
						<s:submit type="submit" value="Alterar" />
				</s:form>
				<s:form novalidate="true" theme="simple" action="/excluir_exame.action">
					<s:hidden  type="text" name="exame.id" value = "%{#exame.id}" ></s:hidden >
					<s:submit type="submit" value="Excluir" />
				</s:form>
			</tr>
		</s:iterator>

		<%--

				<td style="width: 50px">
					<form action="/Exames/alterarExame" method="post">
					<input type="text" name="nome" value="${item.nome}" style="display:none"/>
					<input type="text" name="email" value="${item.email}" style="display:none"/>
					<input type="text" name="cpf" value="${item.cpf}" style="display:none"/>
					<input type="text" name="exame" value="${item.exame}" style="display:none"/>
					<input type="text" name="data" value="${item.data}" style="display:none"/>
					<input type="text" name="situacao" value="${item.situacao}" style="display:none"/>
					<input type="text" name="id" value="${item.id}" style="display:none"/><br>
						<button id="alterar" type="submit">Alterar</button>
					</form>
					<form action="/Exames/excluirExame" method="post">
						<input type="text" name="id" value="${item.id}" hidden />
						<br><button id="remover" type="submit">Remover</button>
					</form>
			<tr>
		</c:forEach> --%>
	</table>
</body>
</html>
