<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Calendar, java.text.SimpleDateFormat" %>

<% Calendar cl = Calendar.getInstance();
   SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
   String formatDate = sdf.format(cl.getTime()); %>

<header>
	<h2>login</h2>
	<label><%= formatDate %></label>
</header>
