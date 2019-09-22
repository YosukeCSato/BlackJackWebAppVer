<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="beans.Gamer" %>
<%
Gamer player = (Gamer)session.getAttribute("player");
Gamer dealer = (Gamer)session.getAttribute("dealer");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ブラックジャック</title>
</head>
<body>
プレイヤーの名前
<%= player.getName() %><br>
プレイヤーの所持金
<%= player.getMoney() %><br>

<%= dealer.getName() %>
</body>
</html>