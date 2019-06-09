<!-- - var navbarShadow = true-->
<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%-- Using Struts2 Tags in JSP --%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html class="loading" lang="en" data-textdirection="ltr">
<head>

</head>
<body>
  <!-- fixed-top-->
  <s:form novalidate="true" theme="simple" action="/cadastrarExame.action">
    <h1>Adiciona Exame2</h1>
    <hr />
      Nome: <s:textfield type="text" name="exame.nome" /><br />
      E-mail: <s:textfield type="text" name="exame.email" /><br />
      CPF: <s:textfield type="text" name="exame.cpf" /><br />
      Exame: <s:textfield type="text" name="exame.exame" /><br />
      Situação: <s:textfield type="text" name="exame.situacao" /><br />
      Data: <input type="text" name="exame.data" /><br />
      <s:submit type="submit" value="Adicionar" />
  </s:form>
</body>
</html>
