<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet"
	href="https://www.w3schools.com/lib/w3-theme-black.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title>First Sample Application!</title>
</head>
<body>
	<!-- Sidebar on click -->
	<nav
		class="w3-sidebar w3-bar-block w3-white w3-card w3-animate-left w3-xxlarge"
		style="display:none;z-index:2" id="mySidebar"> <a
		href="javascript:void(0)" onclick="w3_close()"
		class="w3-bar-item w3-button w3-display-topright w3-text-teal">Close
		<i class="fa fa-remove"></i>
	</a> <a href="#" class="w3-bar-item w3-button">Link 1</a> <a href="#"
		class="w3-bar-item w3-button">Link 2</a> <a href="#"
		class="w3-bar-item w3-button">Link 3</a> <a href="#"
		class="w3-bar-item w3-button">Link 4</a> <a href="#"
		class="w3-bar-item w3-button">Link 5</a> </nav>

	<!-- Navbar -->
	<div class="w3-top">
		<div class="w3-bar w3-theme-d2 w3-left-align">
			<a
				class="w3-bar-item w3-button w3-hide-medium w3-hide-large w3-right w3-hover-white w3-theme-d2"
				href="javascript:void(0);" onclick="openNav()"><i
				class="fa fa-bars"></i></a> <a href="#"
				class="w3-bar-item w3-button w3-teal"><i
				class="fa fa-home w3-margin-right"></i>Logo</a> <a href="#team"
				class="w3-bar-item w3-button w3-hide-small w3-hover-white">Team</a>
			<a href="#work"
				class="w3-bar-item w3-button w3-hide-small w3-hover-white">Work</a>
			<a href="#pricing"
				class="w3-bar-item w3-button w3-hide-small w3-hover-white">Price</a>
			<a href="#contact"
				class="w3-bar-item w3-button w3-hide-small w3-hover-white">Contact</a>
		</div>

		<!-- Navbar on small screens -->
		<div id="navDemo"
			class="w3-bar-block w3-theme-d2 w3-hide w3-hide-large w3-hide-medium">
			<a href="#team" class="w3-bar-item w3-button">Team</a> <a
				href="#work" class="w3-bar-item w3-button">Work</a> <a
				href="#pricing" class="w3-bar-item w3-button">Price</a> <a
				href="#contact" class="w3-bar-item w3-button">Contact</a> <a
				href="#" class="w3-bar-item w3-button">Search</a>
		</div>
	</div>
	<br><br>
<h1>Hello ${userName}</h1>
</body>
</html>