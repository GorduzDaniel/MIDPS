<?php
	require_once "funtions/functions.php"
?>
<?php
	$name = htmlspecialchars($_POST['name']);
	$email = htmlspecialchars($_POST['email']);
	$subject = htmlspecialchars($_POST['subject']);
	$message = htmlspecialchars($_POST['message']);
	if ($name == '' || $email=='' || $subject=='' || $message== ''){
		echo 'Feel all the blank spaces';
		exit;
	}
	//sending
	$subject = "=?utf8-8?B?".base64_encode($subject."?");
	$headers = "From: $email\r\nReply-to: $email\r\nContent-type: text/html; charset=utf-8\r\n"; 
	if(mail("myemail@yahoo.com", $subject, $message, $headers))
		echo "Message Sent successfully";
	else
		echo "Message was not sent!";
?>