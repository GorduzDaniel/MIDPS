
<!DOCTYPE html>
<html>
<head>

	<?php
	require_once "funtions/functions.php"
?>
	<title>Feedback</title>
	<link rel="stylesheet" type="text/css" href="style/main.css">
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>
	<script>
		$(document).ready (function(){
			$("#done").click (function(){
				var name=$("#name").val ();
				var email=$("#email").val ();.
				var subject=$("#subject").val ();
				var message=$("#message").val ();
				var fail="";

				if (fail!= ""){
					$('#messageShow').html (fail + "<div class='clear'><br/></div>");
					$('#messageShow').show ();
					return false;
				}
				$.ajax({
					url: '/ajax/Feedback.php',
					type: 'POST',
					cache: false,
					data: {'name': name, 'email': email, 'subject': subject, 'message': message},
					dataType: 'html',
					succes: function (data){
						if(data =='Message was sent successfully'){
							$('#messageShow').html (data + "<div class='clear'><br/></div>");
							$('#messageShow').show ();
						}

					}
				});
			})
		})
	</script>
</head>
<body>
		<h1>Incredible Wildlife</h1>
		<div id="feed">
			<a href="feed.php">Feedback</a>
		</div>
		<p id="line"></p>
		<ul id="menu">
			<li><a href="index.php">Home</a></li>
			<li><a href="page2.php">About</a></li>
			<li><a href="page3.php">Wallpapers</a></li>
		</ul>
		<p id="line"></p>
		<div id="wrapper">
			<div id="leftCol">
				<input type="text" placeholder="user" id="name" name="name"></input> <br />
				<input type="text" placeholder="e-mail" id="email" name="email"></input> <br />
				<input type="text" placeholder="subject" id="subject" name="subject"></input> <br />
				<textarea name="message" id="message" placeholder="Enter your message"></textarea><br />
				<div id="messageShow"></div>
				<input type="button" name="done" id="done" value="Send"></input>
			</div>
		</div>

	</body>
</html>