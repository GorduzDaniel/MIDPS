<?php
	function connectDB  () {
		global $mysqli;
		$mysqli = new mysqli("localhost", "root", "", "midpsbase");
		$mysqli->query("SET NAMES 'utf-8'");
	}

	function closeDB () {
		global $mysqli;
		$mysqli->close ();
	}


	function getNews ($limit) {
		global $mysqli;
		connectDB();
		$result = $mysqli->query("SELECT * FROM 'NEWS' ORDER BY 'id' DESC LIMIT $limit"); 
		clodeDB();
		return resultToArray ($result);	
	}

	function resutlToArray ($result) {
		$array = array ();
		while(($row=$result->fetch_assoc())!=false)
			$array[] = $row;
		return $array;
	}
?>