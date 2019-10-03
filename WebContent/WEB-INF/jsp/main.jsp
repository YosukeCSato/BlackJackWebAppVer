<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BlackJack</title>
</head>
<body>
<h1>ブラックジャックを始めましょう！</h1>
<p>プレイヤーの名前を入力してください</p><br>
<form action="/BlackJackWebAppVer/Main" method="post"><br>
<input type="text" name="playerName"><br>
<p>ディーラーの名前を入力してください</p><br>
<input type="text" name="dealerName"><br>
<input type="submit" value="決定">
</form>
<form action="/BlackJackWebAppVer/LoginServlet" method="get">
<p>または</p>
<input type="submit" value="ログイン">
</form>
</body>
</html>