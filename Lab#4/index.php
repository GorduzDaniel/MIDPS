
<!DOCTYPE html>
<html>
<head>

	<title>Incredible Life</title>
	<link rel="stylesheet" type="text/css" href="style/main.css">
</head>
<body>
		<h1>Incredible Wildlife</h1>
		<div id="feed">
			<a href="feed.php">Feedback</a>
		</div>
		<p id="line"></p>
		<ul id="menu">
			<li><a href="#">Home</a></li>
			<li><a href="page2.php">About</a></li>
			<li><a href="page3.php">Wallpapers</a></li>
		</ul>
		<p id="line"></p>

		<h2>Top 3 Birds With Super Abilities</h2>
		<h3>#3. The Owl Is Daredevil and Wolverine Combined</h3>
		<img src="http://www.cracked.com/phpimages/article/7/5/0/95750.jpg?v=1" alt="Owl img" align="center">
		<p class="order">
		<br>
			This is a great example right here, because apparently owls can't do shit, if comic books are our guide. While there are several owl-themed superheroes and villains in existence, they tend to be thinly veiled Batman knockoffs with no powers to speak of. Even the superpowered ones usually possess some rather sad and useless power, such as Owlman's ability to "cause confusion."
			<br><br>
			Well, all we can say to that is comic book writers need to open a damned encyclopedia every now and then. We mean, look at the creature we're dealing with here. Besides having the best night vision of all birds, owls also have a satellite dish built into their face. The circular pattern of feathers on there? Yeah, that acts as a dish, focusing the sound and giving them what may be the best directional hearing in the world. And even weirder, those feather patterns can also, no kidding, be individually adjusted to increase reception.<br><br>
			And keep in mind, we're talking about a nocturnal hunter -- they're using this finely tuned sense of hearing to take down prey that the owl can't even see. So, basically we're looking at a flying Daredevil but with a slew of built-in razor blades on its hands a la Wolverine. <br><br>
			To demonstrate how these powers would be handy fighting crime, we'd like to show you the following video. imagine that the lemming is crime:<br>
		</p>
		<iframe width="40%" height="400" src="https://www.youtube.com/embed/yps7pgq1TAk" frameborder="0" allowfullscreen></iframe>
		<h3>#2. The Lyrebird Is the World's Greatest Mimic</h3>
		<img src="http://www.cracked.com/phpimages/article/7/4/8/95748.jpg?v=1">
		<br>
		<p class="order">
			The lyrebird is the greatest audio mimic in the world. Besides copying the songs of other birds, it can copy the sounds of car alarms, construction equipment, gunshots, dogs barking, musical instruments and even people. And we're not talking about that "Polly wanna cracker" parrot bullshit. This thing can reproduce the exact sound of your voice, like a living tape recorder. It can imitate you better than another human can imitate you.
			<br><br>
			That's because the lyrebird has the most advanced set of vocal cords in the world, made all the more impressive by the fact that it has no lips to help it shape the sound, what with being a bird and everything. The lyrebird does it all with its throat.
			<br><br>
			Also, their memory for recording and storing these sounds is impeccable. For example, in 1969 a lyrebird song was recorded and sent to a scholar named Norman Robinson. After filtering it, he figured out to his surprise that this bird was singing two popular tunes from the 1930s ... at the same time. Watch:
			<br><br>
		<iframe width="75%" height="360" src="https://www.youtube.com/embed/VjE0Kdfos4Y?feature=player_embedded" frameborder="0" allowfullscreen></iframe>
		</p>
		<h3>#1. The Ostrich Is a Super-Kicking T-Rex</h3>
		<img src="http://www.cracked.com/phpimages/article/7/4/7/95747.jpg?v=1" alt="No Internet connection!">
		<br>
		<p class="order">
			The ostrich is an ugly creature, but luckily fighting crime isn't a pretty business. This 300-pound bird brings in a hefty bulk and the ability to run at speeds of 100 km per hour. Big deal, right? It's kinda fast, sure, but there are other animals, namely cheetahs, that can easily exceed that. But the thing is, cheetahs aren't known for their stamina, and in fact run out of gas almost instantaneously. The ostrich, on the other hand, can keep going for half an hour. Still, that alone wouldn't be enough for this list.<br><br>

			Because as handy as super speed may be, when you're fighting crime with a name like "The Mighty Ostrich," sometimes you've got to stand up to the enemy and fight back. So let's talk about its horrifying giant bird claws, and how it can fire them at you hard enough to pulverize your organs.

			On their own, the ostrich's foot talons, at a "mere" 4 inches, leave something to be desired when facing evildoers such as Harpy Eagle up there. But ostriches also possess two finger claws on the end of each wing to give it extra options for attack, and those foot claws are going to be delivered with the horrifying power of the Ostrich Kick.	
			<br><br>
			So, how does this translate to the superhero realm? One, gaining ostrich powers means your uniform requires some seriously creative tailoring, and two, said powers give you the ability to kick directly forward with a force of 2,000 freaking pounds per square inch. To put that in context, a professional heavyweight boxer can hit at some 800 pounds per square inch. So the Ostrich Kick is the equivalent of roughly 2.5 Mike Tysons delivering their best knockout punch, in the same spot, at the exact same time. Except instead of a nice, soft boxing glove, the whole of the impact will be delivered with those 4-inch talons. Did you forget about those? The ostrich didn't.
		</p>
		<?php
			$connection = new mysqli("localhost", "root", "");
			mysqli_select_db($connection, "article");
			$result = $connection->query("SELECT * FROM title"); 
			if($result->num_rows){
				while($row= $result->fetch_assoc()) {
					echo $row["full_text"];
					echo $row["title"];
				}
			}
		?>
		<footer>
			<div id="rights">
				<div>All rights reserved &copy; <?= date ('Y')?> </div>
			</div>
		</footer>
	</body>
</html>
