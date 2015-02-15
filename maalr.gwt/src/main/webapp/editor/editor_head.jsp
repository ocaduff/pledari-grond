<!DOCTYPE html>

<%@ page import="de.uni_koeln.spinfo.maalr.common.server.util.Configuration" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%
	if(session.getAttribute("pl") == null) {
		session.setAttribute("pl", request.getLocale().getLanguage());
		//session.setAttribute("pl", "ss");
	}
	if(request.getParameter("pl") != null) {
		session.setAttribute("pl", request.getParameter("pl"));
	}
%>
<html lang='<%=session.getAttribute("pl")%>'>
<fmt:setLocale value='<%=session.getAttribute("pl") %>' />
<fmt:setBundle basename="de.uni_koeln.spinfo.maalr.webapp.i18n.text" />
<head>

<!--[if lt IE 9]>
	<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
<![endif]-->
<!--[if IE 7]>
	<link rel="stylesheet" href="/de.uni_koeln.spinfo.maalr.user/css/font-awesome-ie7.css">
<![endif]-->

<title><%=Configuration.getInstance().getShortName()%> - Editor Backend</title>

<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<meta name="gwt:property" content='locale=<%=request.getLocale()%>'>

<link rel="shortcut icon" type="image/x-icon" href="../favicon.ico">

<link href="${dictContext}/de.uni_koeln.spinfo.maalr.editor/css/font-awesome.css" rel="stylesheet" type="text/css">
<link href="${dictContext}/de.uni_koeln.spinfo.maalr.editor/css/bootstrap.min.css" rel="stylesheet" type="text/css">
<link href="${dictContext}/de.uni_koeln.spinfo.maalr.editor/css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css">
<link href="${dictContext}/de.uni_koeln.spinfo.maalr.editor/css/datetimepicker.css" rel="stylesheet" type="text/css">
<link href="${dictContext}/de.uni_koeln.spinfo.maalr.editor/css/editor.css" rel="stylesheet" type="text/css">

<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<script type="text/javascript" src="${dictContext}/de.uni_koeln.spinfo.maalr.editor/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${dictContext}/de.uni_koeln.spinfo.maalr.editor/js/bootstrap-datetimepicker.js"></script>
<script type="text/javascript" src="${dictContext}/de.uni_koeln.spinfo.maalr.editor/js/dynamic_locale.js"></script>
<script type="text/javascript" src="../de.uni_koeln.spinfo.maalr.editor/de.uni_koeln.spinfo.maalr.editor.nocache.js"></script>
</head>